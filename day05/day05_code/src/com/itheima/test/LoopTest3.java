package com.itheima.test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a signless integer");
        int number = sc.nextInt();
        int point = 0;
        for(int i = 2; i < number; i++)
        {
            if(number%i == 0){
                point = 1;
                break;
            }
        }
        if(point == 1)System.out.println("不是质数");
        else System.out.println("是质数");
    }
}
