package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        //'+'
        System.out.println(3 + 2);
        //'-'
        System.out.println(5 - 3);
        //'*'
        System.out.println(2 * 2);

        //如果在计算中带有小数，计算结果可能不精确
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
        System.out.println(1.1 + 1.1);

        //'/'
        //1.整数参与计算，结果只能得到整数
        //2.小数参与计算，结果有可能是不精确的，如果我们需要精确计算，那么就需要用到后面的知识点
        System.out.println(10 / 2);
        System.out.println(10 / 3);
        System.out.println(10.0 / 3);
        //'%'
        System.out.println(10 % 2);
        System.out.println(10 % 3);

        //三元运算符
        int number1 = 10;
        int number2 = 20;
        int max = number1 > number2 ? number1 : number2;

        System.out.println(max);
    }
}
