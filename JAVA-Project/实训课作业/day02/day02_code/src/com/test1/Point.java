package com.test1;

public class Point {
    int x, y;
    String name = "一个坐标点";

    public Point() {
    }

    public Point(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int X, int Y) {
        x = X;
        y = Y;
    }

    Point newPoint(String name) {
        Point p = new Point(-x, -y, name);
        return p;
    }

    boolean equal(int x, int y){
        if(this.x==x && this.y==y)return true;
        else return false;
    }

    void print(){
        System.out.println(name+": x="+x+" y="+y);
    }
}
