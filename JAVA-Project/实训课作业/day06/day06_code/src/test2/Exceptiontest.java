package test2;

import javax.swing.JOptionPane;

public class Exceptiontest {
    public static void main(String[] args) {
        String[] word = {"good", "bad", "ok", "base"};
        try {
            String s = JOptionPane.showInputDialog("请输入一个数：");
            int n = Integer.parseInt(s);
            System.out.println(word[n]);
            System.out.println("word 数组元素已正常输出！");
        } catch (NumberFormatException e) {
            System.out.println("要求输入的是整数");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组访问越界");
        } finally {
            System.out.println("无论word数组元素已正常输出与否，程序执行到此！");
        }
    }
}
