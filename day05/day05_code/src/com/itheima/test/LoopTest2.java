package com.itheima.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int i = 1;
        while(i * i < in)i++;
        i--;
        System.out.println(i);
    }
}
