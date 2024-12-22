package com.test;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        Random r = new Random(1);
        for (int i = 0; i < 5; i++) {
            System.out.println(r.nextInt(5));
        }
    }
}
