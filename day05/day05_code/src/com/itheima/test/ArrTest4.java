package com.itheima.test;

import java.util.Random;

public class ArrTest4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            arr[i] = r.nextInt(100)+1;
        }
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum = " + sum);
        System.out.println("Average value = " + sum/10);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < sum/10)count++;
        }
        System.out.println("The count = " + count);
    }
}
