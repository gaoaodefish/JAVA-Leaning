package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean a = getValue(arr,11);
        System.out.println(a);
    }

    public static boolean getValue(int[] arr, int num){
        for(int j:arr)
        {
            if(num == j)return true;
        }
        return false;
    }
}
