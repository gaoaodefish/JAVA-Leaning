package com.interFace;

interface myInterface {
    int add(int x, int y);
    int minus(int x, int y);
    int divide(int x, int y);
    int multiply(int x, int y);
}
class myClass implements myInterface {
    int sum;
    public int add(int x, int y) {
        sum = x + y;
        return sum;
    }

    public int minus(int x, int y){
        sum = x - y;
        return sum;
    }

    public int divide(int x, int y){
        if(y != 0){
            return x/y;
        }
        return 255;
    }

    public int multiply(int x, int y){
        return x*y;
    }
}

class yourClass implements myInterface {
    int sub;
    @Override
    public int add(int x, int y) {
        sub = x - y;
        return sub;
    }

    public int minus(int x, int y){
     return 0;
    }

    public int divide(int x, int y){
        return 0;
    }

    public int multiply(int x, int y){
        return 0;
    }

    public int getSub() {
        return sub;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        myClass mc = new myClass();
        mc.add(5, 3);
        System.out.println("In myClass sum=" + mc.sum);
        System.out.println("In myClass sum=" + mc.minus(8,2));
        int value = mc.divide(8,2);
        if(value == 255){
            System.out.println("Error，除数不能为 0");
        }
        else
            System.out.println("In myClass sum=" + value);
        System.out.println("In myClass sum=" + mc.multiply(8,2));

//        yourClass yc = new yourClass();
//        yc.add(5, 3);
//        System.out.println("In yourClass sub=" + yc.getSub());
    }
}
