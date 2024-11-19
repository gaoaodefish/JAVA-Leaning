package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int max = getMaxValue(arr);
        System.out.println("Max value is " + max);
    }

    public static int getMaxValue(int[] arr)
    {
        int max = arr[0];
        for(int j:arr)
        {
            if(j > max)
            {
                max = j;
            }
        }
        return max;
    }
}
