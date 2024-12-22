package test1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaiQuanGUI extends JFrame {
    private JTextField textUserName;
    private JButton[] opponentButtons;
    private JButton[] gestureButtons;
    private JButton buttonStart, buttonRestart, buttonExit;
    private JLabel labelUserScore, labelComputerScore, labelSelectedOpponent, labelComputerOutput, labelResult;
    private int userScore = 0, computerScore = 0;
    private String cName = null;

    public CaiQuanGUI() {
        setTitle("猜拳游戏");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Top Panel: 用户输入姓名和选择对手
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(3, 1, 5, 5));

        // 用户输入姓名
        JLabel labelUserName = new JLabel("请输入您的姓名：");
        topPanel.add(labelUserName);
        textUserName = new JTextField(10);
        topPanel.add(textUserName);

        // 对手选择
        JLabel labelOpponent = new JLabel("请选择对手：");
        topPanel.add(labelOpponent);
        JPanel opponentPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        opponentButtons = new JButton[3];
        String[] opponents = {"张飞", "关羽", "刘备"};
        for (int i = 0; i < opponentButtons.length; i++) {
            opponentButtons[i] = new JButton(opponents[i]);
            opponentPanel.add(opponentButtons[i]);
            int finalI = i;
            opponentButtons[i].addActionListener(e -> {
                cName = opponents[finalI];
                labelSelectedOpponent.setText("您选择了对手：" + cName);
            });
        }
        topPanel.add(opponentPanel);
        add(topPanel, BorderLayout.NORTH);

        // Middle Panel: 分数和选择手势
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new GridLayout(3, 1, 10, 10));

        // 分数显示
        JPanel scorePanel = new JPanel();
        labelUserScore = new JLabel("您的得分：0");
        labelComputerScore = new JLabel("电脑得分：0");
        scorePanel.add(labelUserScore);
        scorePanel.add(labelComputerScore);
        middlePanel.add(scorePanel);

        labelSelectedOpponent = new JLabel("您选择了对手：");
        middlePanel.add(labelSelectedOpponent);

        labelComputerOutput = new JLabel("电脑出举：");
        middlePanel.add(labelComputerOutput);

        // 手势选择按钮
        JPanel gesturePanel = new JPanel();
        String[] gestures = {"石头", "剪刀", "布"};
        gestureButtons = new JButton[3];
        for (int i = 0; i < gestureButtons.length; i++) {
            gestureButtons[i] = new JButton(gestures[i]);
            gesturePanel.add(gestureButtons[i]);
            int finalI = i;
            gestureButtons[i].addActionListener(e -> {
                if (cName == null) {
                    JOptionPane.showMessageDialog(this, "请先选择对手！");
                    return;
                }
                String userGesture = gestures[finalI];
                labelComputerOutput.setText("电脑出举：" + computerGesture());
                String result = determineWinner(userGesture, computerGesture());
                labelResult.setText(result);
                updateScore(result);
            });
        }
        middlePanel.add(gesturePanel);
        add(middlePanel, BorderLayout.CENTER);

        // Bottom Panel: 游戏控制按钮
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 3, 10, 10));

        buttonStart = new JButton("开始游戏");
        buttonStart.setPreferredSize(new Dimension(100, 40));
        buttonStart.addActionListener(e -> startGame());
        bottomPanel.add(buttonStart);

        buttonRestart = new JButton("重新开始");
        buttonRestart.setPreferredSize(new Dimension(120, 40));
        buttonRestart.addActionListener(e -> resetGame());
        bottomPanel.add(buttonRestart);

        buttonExit = new JButton("退出游戏");
        buttonExit.setPreferredSize(new Dimension(120, 40));
        buttonExit.addActionListener(e -> System.exit(0));
        bottomPanel.add(buttonExit);

        add(bottomPanel, BorderLayout.SOUTH);

        // 结果标签
        labelResult = new JLabel("等待开始...");
        labelResult.setHorizontalAlignment(SwingConstants.CENTER);
        add(labelResult, BorderLayout.SOUTH);

        pack();
    }

    // 启动游戏逻辑
    private void startGame() {
        String userName = textUserName.getText();
        if (userName.isEmpty() || cName == null) {
            JOptionPane.showMessageDialog(this, "请输入姓名并选择对手！");
            return;
        }
        // 启用手势按钮
        for (JButton button : gestureButtons) {
            button.setEnabled(true);
        }
        buttonStart.setEnabled(false); // 禁用开始游戏按钮
        textUserName.setEditable(false); // 禁止修改用户名
    }

    // 判断谁赢了
    private String determineWinner(String userGesture, String computerGesture) {
        if (userGesture.equals(computerGesture)) {
            return "平局！";
        }
        if ((userGesture.equals("石头") && computerGesture.equals("剪刀")) ||
                (userGesture.equals("剪刀") && computerGesture.equals("布")) ||
                (userGesture.equals("布") && computerGesture.equals("石头"))) {
            return "您获胜！";
        } else {
            return "电脑获胜！";
        }
    }

    // 更新分数
    private void updateScore(String result) {
        if (result.equals("您获胜！")) {
            userScore++;
        } else if (result.equals("电脑获胜！")) {
            computerScore++;
        }
        labelUserScore.setText("您的得分：" + userScore);
        labelComputerScore.setText("电脑得分：" + computerScore);
    }

    // 生成电脑的手势
    private String computerGesture() {
        String[] gestures = {"石头", "剪刀", "布"};
        int index = (int) (Math.random() * 3);
        return gestures[index];
    }

    // 重置游戏
    private void resetGame() {
        textUserName.setText("");
        labelSelectedOpponent.setText("您选择了对手：");
        labelComputerOutput.setText("电脑出举：");
        labelUserScore.setText("您的得分：0");
        labelComputerScore.setText("电脑得分：0");
        labelResult.setText("等待开始...");
        cName = null;
        userScore = 0;
        computerScore = 0;
        buttonStart.setEnabled(true);
        textUserName.setEditable(true);
        for (JButton button : gestureButtons) {
            button.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CaiQuanGUI gui = new CaiQuanGUI();
            gui.setVisible(true);
        });
    }
}
