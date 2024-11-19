package com.itheima.test;

public class test2 {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int count = 0;
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            count++;
        }
        System.out.println("商：" + count + '.' + dividend);
    }
}
