package project;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入浮点数
        double result = sc.nextDouble();
        //输出平方
        System.out.println("平方" + result*result);
        //输出立方
        System.out.println("立方" + result*result*result);
    }
}
