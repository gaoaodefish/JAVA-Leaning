import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphic extends JFrame {

    // 定义GUI组件
    private JTextField lengthField;  // 输入矩形长的文本框
    private JTextField widthField;   // 输入矩形宽的文本框
    private JTextField perimeterField;  // 显示矩形周长的文本框
    private JTextField areaField;       // 显示矩形面积的文本框

    // 构造函数名应与类名相同
    public Graphic() {
        // 设置窗口标题
        setTitle("矩形面积和周长计算工具");

        // 创建面板，用于放置组件
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));  // 设置网格布局：5行2列，组件之间的间隔为10px

        // 添加组件到面板

        // 标签和输入框：矩形的长
        panel.add(new JLabel("请输入矩形的长:"));
        lengthField = new JTextField();  // 用于输入长
        panel.add(lengthField);

        // 标签和输入框：矩形的宽
        panel.add(new JLabel("请输入矩形的宽:"));
        widthField = new JTextField();   // 用于输入宽
        panel.add(widthField);

        // 计算按钮
        JButton calculateButton = new JButton("计算");
        panel.add(calculateButton);

        // 清空按钮
        JButton clearButton = new JButton("清空");
        panel.add(clearButton);

        // 标签和显示框：矩形的周长
        panel.add(new JLabel("矩形的周长:"));
        perimeterField = new JTextField();  // 用于显示周长
        perimeterField.setEditable(false);  // 使其不可编辑
        panel.add(perimeterField);

        // 标签和显示框：矩形的面积
        panel.add(new JLabel("矩形的面积:"));
        areaField = new JTextField();  // 用于显示面积
        areaField.setEditable(false);  // 使其不可编辑
        panel.add(areaField);

        // 将面板添加到主窗口
        add(panel);

        // 设置窗口的大小
        setSize(400, 300);

        // 使窗口居中
        setLocationRelativeTo(null);

        // 设置关闭操作
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 使窗口可见
        setVisible(true);

        // 添加“计算”按钮的事件监听器
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();  // 调用计算方法
            }
        });

        // 添加“清空”按钮的事件监听器
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();  // 调用清空方法
            }
        });
    }

    // 计算矩形周长和面积的方法
    private void calculate() {
        try {
            // 获取用户输入的长和宽，并将其转换为double类型
            double length = Double.parseDouble(lengthField.getText());
            double width = Double.parseDouble(widthField.getText());

            // 计算周长和面积
            double perimeter = 2 * (length + width);
            double area = length * width;

            // 将计算结果显示在文本框中
            perimeterField.setText(String.format("%.2f", perimeter));
            areaField.setText(String.format("%.2f", area));
        } catch (NumberFormatException ex) {
            // 如果输入不是有效数字，弹出错误对话框
            JOptionPane.showMessageDialog(this, "请输入有效的数字", "输入错误", JOptionPane.ERROR_MESSAGE);
        }
    }

    // 清空所有输入和输出文本框的方法
    private void clearFields() {
        lengthField.setText("");
        widthField.setText("");
        perimeterField.setText("");
        areaField.setText("");
    }

    public static void main(String[] args) {
        // 创建并运行计算器程序
        new Graphic();  // 这里调用的是修正后的构造函数
    }
}


//public class Graphic extends JFrame {
//    JPanel panel;
//    JLabel bq = new JLabel("这是标签");
//    public Graphic(){
//        this.setSize(400,600);
//        this.setLocation(800,300);
//        this.setVisible(true);
//        this.setTitle("Calculator");
//        panel = new JPanel();
//        panel.setBackground(Color.PINK);
//        panel.setBorder(BorderFactory.createTitledBorder("这是面板边界"));
//        this.add(panel);
//        panel.add(bq);
//        bq.setFont(new Font("隶书",3,35));
//    }
//    public static void main(String[] args) {
//        System.out.println("Graphic_use_interface");
//        Graphic graphic = new Graphic();
//    }
//}
