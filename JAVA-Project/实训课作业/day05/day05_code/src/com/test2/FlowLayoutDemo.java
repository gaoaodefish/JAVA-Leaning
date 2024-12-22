package com.test2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutDemo {

    // 声明按钮
    JButton b1, b2, b3;

    // 构造方法
    public FlowLayoutDemo() {
        // 初始化按钮
        b1 = new JButton("继续");
        b2 = new JButton("取消");
        b3 = new JButton("确定");
    }

    // 显示窗口方法
    public void show() {
        // 创建 JFrame 容器
        JFrame f = new JFrame("FlowLayout 顺序布局");
        f.setSize(300, 240);  // 设置窗口大小

        // 设置布局管理器为 FlowLayout
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));

        // 将按钮添加到窗口
        f.add(b1);
        f.add(b2);
        f.add(b3);

        // 关闭窗口时退出程序
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                f.setVisible(false);  // 设置窗口不可见
                f.dispose();  // 释放窗口及子组件的屏幕资源
                System.exit(0);  // 退出程序
            }
        });

        f.setVisible(true);  // 显示窗口
    }

    // 主方法，启动程序
    public static void main(String[] args) {
        FlowLayoutDemo fl = new FlowLayoutDemo();  // 创建 FlowLayoutDemo 实例
        fl.show();  // 显示窗口
    }
}
