package com.test2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SimpleEventHandle1 {
    public static void main(String[] args) {
        // 创建 JFrame 实例作为主窗体
        JFrame frame = new JFrame("Change Background Color");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout()); // 设置布局管理器为FlowLayout

        // 创建 JButton 实例
        JButton button = new JButton("Change Color");

        // 创建事件监听器
        ActionListener colorChangeListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 生成随机颜色
                Random rand = new Random();
                int r = rand.nextInt(256); // 0-255
                int g = rand.nextInt(256); // 0-255
                int b = rand.nextInt(256); // 0-255
                Color randomColor = new Color(r, g, b);

                // 改变窗体背景色
                frame.getContentPane().setBackground(randomColor);
                frame.repaint(); // 重新绘制窗体以应用新颜色
            }
        };

        // 为按钮添加事件监听器
        button.addActionListener(colorChangeListener);

        // 将按钮添加到窗体
        frame.getContentPane().add(button);

        // 显示窗体
        frame.setVisible(true);
    }
}