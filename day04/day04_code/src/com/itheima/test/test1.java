package com.itheima.test;

public class test1 {
    public static void main(String[] args) {
        int x = 121;
        int start = x;
        int num = 0;
        while(x != 0)
        {
            num = num*10 + x%10;
            x = x/10;
        }
        System.out.println(start == num);
    }
}
