package com.itheima.methoddemo;

public class MethodDemo4 {
    public static void main(String[] args) {
        getSum(10,10.);
    }

    public static void getSum(int num1, int num2)
    {
        int result = num1 +num2;
        System.out.println(result);
    }
    public static void getSum(double num1, double num2)
    {
        double result = num1 +num2;
        System.out.println(result);
    }
}
