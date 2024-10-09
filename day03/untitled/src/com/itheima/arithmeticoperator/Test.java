package com.itheima.arithmeticoperator;
import java.util.Scanner;//导包

public class Test {
    public static void main(String[] args) {
        //输入一个数，去出每一位的值，并打印出每一位的值
        Scanner sc = new Scanner(System.in);//创建对象
        System.out.println("Please input one number->");//引导
        int i;
        System.out.println(i = sc.nextInt());//输入数字

        System.out.println(i%10);//个位
        System.out.println(i/10%10);//十位....
        System.out.println(i/100%10);
        System.out.println(i/1000%10);
        System.out.println(i/10000%10);
    }
}
