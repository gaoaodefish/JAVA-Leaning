package project;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println("个位"+ value%10);
        System.out.println("十位"+ value/10%10);
        System.out.println("百位"+ value/100%10);
    }
}
