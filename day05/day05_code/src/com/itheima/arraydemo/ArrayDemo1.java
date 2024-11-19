package com.itheima.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int len = arr.length;
        System.out.println(len);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
