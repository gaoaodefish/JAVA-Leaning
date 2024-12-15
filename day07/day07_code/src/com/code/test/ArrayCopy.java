package com.code.test;

public class ArrayCopy {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4};
        int [] arrResult = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arrResult[i] = arr[i];
        }
        for(int j : arrResult){
            System.out.println(j);
        }
    }
}
