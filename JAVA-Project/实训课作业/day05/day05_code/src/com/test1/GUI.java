package com.test1;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("Frame with panel");
        f1.getContentPane().setBackground(Color.LIGHT_GRAY);
        JPanel p1 = new JPanel();
        p1.setBackground(Color.PINK);
        JButton b1 = new JButton("请点击我");
        p1.add(b1);
        f1.getContentPane().add(p1, BorderLayout.WEST);
        f1.setSize(300,400);
        f1.setVisible(true);
    }
}
