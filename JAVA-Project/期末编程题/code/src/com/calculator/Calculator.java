package com.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private JTextArea history;
    private StringBuilder currentInput = new StringBuilder();
    private Stack<String> historyStack = new Stack<>();
    private boolean resetDisplay = false;
    private boolean allowDot = true;

    public Calculator() {
        setTitle("Calculator ");
        setSize(400, 600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        display.setForeground(Color.BLACK);
        add(display, BorderLayout.NORTH);

        history = new JTextArea(5, 20);
        history.setFont(new Font("Arial", Font.PLAIN, 18));
        history.setEditable(false);
        history.setBackground(Color.LIGHT_GRAY);
        add(new JScrollPane(history), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 4));

        String[] buttons = {
                "7", "8", "9", "/", "√",
                "4", "5", "6", "*", "%",
                "1", "2", "3", "-", "^",
                "0", ".", "±", "+", "C",
                "M+", "M-", "CE", "←", "="
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("C")) {
            currentInput.setLength(0);
            display.setText("");
        } else if (command.equals("CE")) {
            currentInput.setLength(0);
            history.setText("");
            display.setText("");
        } else if (command.equals("←")) {
            if (currentInput.length() > 0) {
                currentInput.setLength(currentInput.length() - 1);
                display.setText(currentInput.toString());
            }
        } else if (command.equals("=")) {
            try {
                double result = evaluate(currentInput.toString());
                display.setText(String.format("%.2f", result));
                history.append(currentInput.toString() + " = " + result + "\n");
                historyStack.push(currentInput.toString() + " = " + result);
                currentInput.setLength(0);
                resetDisplay = true;
            } catch (Exception ex) {
                display.setText("错误");
                currentInput.setLength(0);
            }
        } else if (command.equals("±")) {
            if (currentInput.length() > 0 && currentInput.charAt(0) != '-') {
                currentInput.insert(0, "-");
            } else if (currentInput.length() > 0 && currentInput.charAt(0) == '-') {
                currentInput.deleteCharAt(0);
            }
            display.setText(currentInput.toString());
        } else if (command.equals(".")) {
            if (allowDot) {
                currentInput.append(".");
                display.setText(currentInput.toString());
                allowDot = false;
            }
        } else {
            if (resetDisplay) {
                currentInput.setLength(0);
                resetDisplay = false;
            }
            currentInput.append(command);
            display.setText(currentInput.toString());
        }
    }

    private double evaluate(String expression) throws Exception {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() throws Exception {
                nextChar();
                double x = parseExpression();
                if (pos < expression.length()) throw new Exception("Unexpected: " + (char)ch);
                return x;
            }

            double parseExpression() throws Exception {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // 加法
                    else if (eat('-')) x -= parseTerm(); // 减法
                    else return x;
                }
            }

            double parseTerm() throws Exception {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // 乘法
                    else if (eat('/')) x /= parseFactor(); // 除法
                    else if (eat('%')) x %= parseFactor(); // 取模
                    else return x;
                }
            }

            double parseFactor() throws Exception {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();

                double x;
                int startPos = this.pos;
                if (eat('(')) { // 括号
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // 数字
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(expression.substring(startPos, this.pos));
                } else if (ch == '√') { // 平方根
                    nextChar();
                    x = Math.sqrt(parseFactor());
                } else if (ch == '^') { // 幂运算
                    nextChar();
                    x = Math.pow(parseFactor(), parseFactor());
                } else {
                    throw new Exception("Unexpected: " + (char)ch);
                }

                return x;
            }
        }.parse();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calc = new Calculator();
            calc.setVisible(true);
        });
    }
}
