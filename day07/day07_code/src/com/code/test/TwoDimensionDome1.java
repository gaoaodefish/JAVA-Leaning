package com.code.test;

public class TwoDimensionDome1 {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        int allSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println(sum);
            allSum = allSum + sum;
        }
        System.out.println("ALL RESULT = " + allSum);
    }
}
