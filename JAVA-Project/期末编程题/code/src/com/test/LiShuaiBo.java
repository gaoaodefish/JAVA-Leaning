package com.test;
import java.util.Scanner;

public class LiShuaiBo {
    public static void main(String[] args) {
        int x, y, max;
        System.out.print("输入第一个数:");
        x = new Scanner(System.in).nextInt();
        System.out.print("输入第二个数:");
        y = new Scanner(System.in).nextInt();
        max = x > y ? x : y;
        System.out.println("最大数是：" + max);
    }
}
