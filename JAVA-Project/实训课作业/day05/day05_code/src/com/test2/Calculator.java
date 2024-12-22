package com.test2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    // 定义按键数组，用于存储数字和运算符
    private final String[] keys = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", ".", "0", "=", "+"};
    private JButton[] buttons = new JButton[keys.length];
    private JButton resetButton = new JButton("CE"); // 复位按键
    private JTextField resultDisplay = new JTextField("0"); // 显示结果的文本框

    private boolean isFirstDigit = true; // 标志第一个数字
    private String operator = "="; // 运算符
    private double result = 0; // 运算结果

    // 构造方法，设置窗口布局和组件
    public Calculator() {
        super("简易计算器");

        // 创建按键面板，使用 4 行 4 列的网格布局
        JPanel panelButton = new JPanel(new GridLayout(4, 4));
        for (int i = 0; i < keys.length; i++) {
            buttons[i] = new JButton(keys[i]);
            buttons[i].setFont(new Font("宋体", Font.BOLD, 20)); // 设置按键字体
            panelButton.add(buttons[i]);
            buttons[i].addActionListener(this); // 为每个按键注册事件监听
        }

        // 创建显示结果的面板
        JPanel panelResult = new JPanel(new BorderLayout());
        panelResult.add(resultDisplay, BorderLayout.CENTER); // 显示框位于中心
        panelResult.add(resetButton, BorderLayout.EAST); // 复位按钮位于右侧
        resultDisplay.setFont(new Font("宋体", Font.PLAIN, 20)); // 设置结果显示框字体
        resultDisplay.setHorizontalAlignment(JTextField.RIGHT); // 设置显示框文本靠右

        // 注册复位按钮的监听事件
        resetButton.addActionListener(this);

        // 设置窗口的布局和添加组件
        setLayout(new BorderLayout());
        add(panelResult, BorderLayout.NORTH); // 结果面板位于北部
        add(panelButton, BorderLayout.CENTER); // 按钮面板位于中部

        // 设置窗口大小、默认关闭操作和可见性
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // 事件处理方法
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand(); // 获取按键的命令字符串

        // 处理复位按钮
        if (command.equals("CE")) {
            handleReset();
        }
        // 处理数字和小数点
        else if ("0123456789.".indexOf(command) >= 0) {
            handleDigit(command);
        }
        // 处理运算符
        else {
            handleOperator(command);
        }
    }

    // 复位方法，清除结果并重置标志位
    private void handleReset() {
        resultDisplay.setText("0");
        isFirstDigit = true;
        operator = "=";
        result = 0;
    }

    // 处理数字输入
    private void handleDigit(String digit) {
        if (isFirstDigit) {
            resultDisplay.setText(digit); // 如果是第一个数字，则直接显示
        } else {
            resultDisplay.setText(resultDisplay.getText() + digit); // 否则追加数字
        }
        isFirstDigit = false;
    }

    // 处理运算符
    private void handleOperator(String command) {
        double input = Double.parseDouble(resultDisplay.getText()); // 将显示框的文本转换为数字

        // 根据当前的运算符执行对应的计算
        switch (operator) {
            case "+": result += input; break;
            case "-": result -= input; break;
            case "*": result *= input; break;
            case "/": result /= input; break;
            case "=": result = input; break;
        }

        resultDisplay.setText("" + result); // 显示结果
        operator = command; // 更新运算符
        isFirstDigit = true; // 标志下一个数字为新输入
    }

    // 主方法，运行程序
    public static void main(String[] args) {
        new Calculator();
    }
}
