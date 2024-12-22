package test5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class BallAnimation extends JPanel implements ActionListener {
    private final int PANEL_WIDTH = 800;
    private final int PANEL_HEIGHT = 600;
    private final int BALL_COUNT = 10; // 可以调整球的数量
    private final int BALL_SIZE = 30; // 可以调整球的大小
    private final Timer timer;
    private final Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.CYAN, Color.MAGENTA, Color.ORANGE};
    private Ball[] balls;
    private Image backgroundImage; // 背景图片

    public BallAnimation() {
        // 初始化球数组
        balls = new Ball[BALL_COUNT];
        for (int i = 0; i < BALL_COUNT; i++) {
            // 创建球对象，随机位置和颜色
            balls[i] = new Ball(new Random().nextInt(PANEL_WIDTH), new Random().nextInt(PANEL_HEIGHT), BALL_SIZE, colors[i % colors.length]);
        }
        // 设置定时器，每10毫秒触发一次actionPerformed方法
        timer = new Timer(10, this);
        timer.start();

        // 加载背景图片
        loadBackgroundImage("images/timg.gif");
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // 绘制背景图片
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
        // 绘制所有球
        for (Ball ball : balls) {
            g.setColor(ball.getColor());
            g.fillOval(ball.getX(), ball.getY(), ball.getSize(), ball.getSize());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 移动所有球
        for (Ball ball : balls) {
            ball.move();
        }
        // 重新绘制面板
        repaint();
    }

    // 加载背景图片的方法
    private void loadBackgroundImage(String path) {
        ImageIcon icon = new ImageIcon(path);
        backgroundImage = icon.getImage();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ball Animation with Fullscreen Background");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new BallAnimation());
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}

class Ball {
    private int x, y;
    private int size;
    private Color color;
    private int xSpeed, ySpeed;

    public Ball(int startX, int startY, int size, Color color) {
        this.x = startX;
        this.y = startY;
        this.size = size;
        this.color = color;
        // 随机速度，范围-2到2
        this.xSpeed = new Random().nextInt(5) - 2;
        this.ySpeed = new Random().nextInt(5) - 2;
    }

    public void move() {
        // 更新球的位置
        x += xSpeed;
        y += ySpeed;
        // 如果球碰到边界，反弹
        if (x <= 0 || x >= 800 - size) xSpeed = -xSpeed;
        if (y <= 0 || y >= 600 - size) ySpeed = -ySpeed;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getSize() { return size; }
    public Color getColor() { return color; }
}
