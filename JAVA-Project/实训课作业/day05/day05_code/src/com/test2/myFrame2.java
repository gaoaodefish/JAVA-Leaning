package com.test2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// 定义 myFrame2 类并实现 ActionListener 接口
public class myFrame2 extends JFrame implements ActionListener {
    JLabel res;             // 显示结果的标签
    JTextField f1, f2;      // 两个输入框用于输入整数

    // 构造方法，设置界面布局
    public myFrame2() {
        // 创建两个文本框，用于输入整数
        f1 = new JTextField(20);
        f2 = new JTextField(20);

        // 创建两个按钮，分别用于加法和乘法
        JButton b1 = new JButton("+");
        JButton b2 = new JButton("*");

        // 创建标签用于显示结果
        res = new JLabel(" 运算结果 ");

        // 设置窗口的布局为 3 行 2 列的网格布局
        this.setLayout(new GridLayout(3, 2));

        // 将组件添加到窗体中
        this.add(f1);        // 文本框1
        this.add(f2);        // 文本框2
        this.add(b1);        // 按钮 "+"
        this.add(b2);        // 按钮 "*"
        this.add(res);       // 标签显示结果

        // 为按钮添加事件监听
        b1.addActionListener(this); // 监听 "+" 按钮
        b2.addActionListener(this); // 监听 "*" 按钮
    }

    // 事件处理方法
    public void actionPerformed(ActionEvent e) {
        // 获取两个文本框中的整数值
        int x1 = Integer.parseInt(f1.getText());
        int x2 = Integer.parseInt(f2.getText());

        // 判断事件源是哪个按钮，并执行对应的运算
        if (e.getActionCommand().equals("+")) {
            res.setText("" + (x1 + x2));  // 执行加法
        } else {
            res.setText("" + (x1 * x2));  // 执行乘法
        }
    }

    // 主方法，运行程序
    public static void main(String[] args) {
        myFrame2 frame = new myFrame2();
        frame.setSize(300, 200);    // 设置窗口大小
        frame.setVisible(true);     // 设置窗口可见
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭窗口时退出程序
    }
}

