package com.code.test;

import java.util.Random;

public class DoubleColorBall {
    public static void main(String[] args) {
        int[] arr = new int[7];
        arr = randomNumber();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] randomNumber()
    {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = r.nextInt(33)+1;
        }
        arr[arr.length - 1] = r.nextInt(16) + 1;
        return arr;
    }
}