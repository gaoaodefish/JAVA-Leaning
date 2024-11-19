package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        int result = getSame((byte) 1,(byte) 2);
        if(result == 1)
            System.out.println("The two number were same");
        else
            System.out.println("The two number weren't same");

    }

    public static int getSame(byte num1, byte num2){
        if(num1 == num2) return 1;
        else return 0;
    }
    public static int getSame(short num1, short num2){
        if(num1 == num2) return 1;
        else return 0;
    }
    public static int getSame(int num1, int num2){
        if(num1 == num2) return 1;
        else return 0;
    }
    public static int getSame(long num1, long num2){
        if(num1 == num2) return 1;
        else return 0;
    }
}
