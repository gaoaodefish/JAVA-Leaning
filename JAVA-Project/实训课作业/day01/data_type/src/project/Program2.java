package project;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入半径
        double radius  = sc.nextDouble();
        //计算
        double result = area(radius);
        //打印输出
        System.out.printf("Area is: %.2f", result);
    }
    //方法-----用来计算圆的面积
    public static double area(double radius){
        return radius*radius*Math.PI;
    }
}
