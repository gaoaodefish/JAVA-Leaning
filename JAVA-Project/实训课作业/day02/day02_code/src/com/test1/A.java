package com.test1;

public class A {
    public static void main(String[] args) {
        Point p = new Point();
        p.print();
        p.move(50,50);
        System.out.println("*******移动后*******");
        System.out.println("直接访问x，y的坐标");
        System.out.println("x="+p.x+" y="+p.y);
        System.out.println("通过方法访问x,y的坐标");
        System.out.println("x="+p.getX()+" y="+p.getY());
        p.newPoint("一个新的坐标点").print();
        new Point(10,15,"另一个新的坐标点").print();
    }
}
