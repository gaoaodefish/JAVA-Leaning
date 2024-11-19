package com.itheima.test;

public class ArrTest3 {
    public static void main(String[] args) {
        int[] arr = {33,5,22,44,55};
        int max = arr[0];
        for(int j:arr)
        {
            if(j > max)
            {
                max = j;
            }
        }
        System.out.println(max);
    }
}
