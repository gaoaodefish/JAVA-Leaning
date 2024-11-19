package com.itheima.test;

public class ArrTest5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for (int i = 0; i < arr.length/2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        for(int j : arr)
        {
            System.out.print(j);
        }
    }
}
