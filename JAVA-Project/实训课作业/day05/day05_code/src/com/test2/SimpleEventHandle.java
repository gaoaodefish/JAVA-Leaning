package com.test2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleEventHandle {

    public static void main(String[] args) {
        // 创建 JFrame 实例作为主窗体
        JFrame frame = new JFrame("Button Action Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // 创建 JButton 实例
        JButton button = new JButton("Click Me!");
        button.setActionCommand("Hello"); // 设置按钮的动作命令

        // 创建按钮监听器实例
        ButtonHandler handler = new ButtonHandler();
        button.addActionListener(handler); // 将监听器添加到按钮

        // 将按钮添加到窗体
        frame.getContentPane().add(button);

        // 显示窗体
        frame.setVisible(true);
    }

    static class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            // 显示消息对话框，内容为按钮的动作命令
            JOptionPane.showMessageDialog(null, String.format("You pressed: %s", event.getActionCommand()));
        }
    }
}
