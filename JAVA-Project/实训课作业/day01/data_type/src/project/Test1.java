package project;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数：");
        int b = sc.nextInt();
        int max = a > b ? a : b;
        System.out.println("最大值是：" + max);
    }
}
