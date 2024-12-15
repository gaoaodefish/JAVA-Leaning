package com.code.test;

import java.util.Random;

public class Verification {
    public static void main(String[] args) {
        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            if(r.nextInt(2) == 0)
            {
                result = result + (char)r.nextInt(65,65+26);
            }
            else
            {
                result = result + (char)r.nextInt(97,97+26);
            }
        }
        result = result + r.nextInt(10);
        System.out.println(result);
    }
}

//public class Verification {
//    public static void main(String[] args) {
//        char[] arr = new char[52];
//        for (int i = 0; i < arr.length; i= i + 2) {
//            arr[i] = (char) ('A' + i/2);
//            arr[i+1] = (char) ('a' + i/2);
//        }
//
//        char[] verificationCode = new char[4];
//        Random r = new Random();
//        for (int i = 0; i < verificationCode.length; i++) {
//            int num = r.nextInt(52);
//            verificationCode[i] = arr[num];
//        }
//        int lowVerification = r.nextInt(10);
//
//        for(int j:verificationCode){
//            System.out.print((char)j);
//        }
//        System.out.println(lowVerification);
//        System.out.println(r.nextInt(20,22));
//    }
//}
