package test1;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        Random r1 = new Random(1);
        Random r2 = new Random(1);
        r1.nextBoolean();
        System.out.println(r1.nextInt(10));
        System.out.println(r2.nextInt(10));
    }
}
