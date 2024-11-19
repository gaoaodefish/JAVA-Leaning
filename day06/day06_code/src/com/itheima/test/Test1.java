package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        getLength(1.5,1.5);
    }

    public static void getLength(double length, double width){
        double result = length*2 + width*2;
        System.out.println(result);
    }
}
