package com.itheima.test;

public class ArrTest1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int j : arr) {
            if (j % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
