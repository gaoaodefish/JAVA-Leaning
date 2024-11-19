package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        int[]arr = {0,1,2,3,4,5,6,7,8,9};
        int[]arr1 = new int[10];
        int from = 5;
        int to =9;
        for (int i = from; i < to; i++) {
            arr1[i-from] = copyOfRange(arr, from + i - from, to);
        }

        for(int j:arr1)
        {
            System.out.println(j);
        }
    }

    public static int copyOfRange(int[]arr, int from, int to)
    {
        return arr[from];
    }
}
