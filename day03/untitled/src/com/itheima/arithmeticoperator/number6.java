package com.itheima.arithmeticoperator;
import java.util.Scanner;

public class number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//创建对象

        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean c = ((a + b)%6 == 0 || a == 6 || b == 6);
        System.out.println(c);
    }
}
