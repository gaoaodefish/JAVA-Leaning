package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest4 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100);
        System.out.println("猜数字游戏");
        boolean start = true;
        do
        {
            System.out.println("Please enter a integer 0-100");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num > number)
            {
                System.out.println("The number of input was the bigger than this number.");
            }
            else if(num < number)
            {
                System.out.println("The number of input was the smaller than this number.");
            }
            else
            {
                start = false;
            }
        }while(start);
        System.out.println("The answer was correct");
    }
}
