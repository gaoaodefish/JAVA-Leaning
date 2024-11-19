package com.itheima.test;

import java.sql.SQLOutput;

public class Test2 {
    public static void main(String[] args) {
        int a = 150;
        int b = 210;
        int c = 165;
        char max = a > b ? a > c ? 'a' : 'c' : b > c ? 'b' : 'c';
        System.out.println(max);
    }
}
