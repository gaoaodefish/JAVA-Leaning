package com.itheima.test;

import java.util.Random;

public class ArrTest6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int value = r.nextInt(arr.length);
            int tmp = arr[i];
            arr[i] = arr[value];
            arr[value] = tmp;
        }
        for(int j : arr)
        {
            System.out.print(j);
        }
    }
}
