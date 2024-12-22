import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double s;//接收面积大小
       Scanner in = new Scanner(System.in);//创建一个输入
       Area area = new Area();//创建对象
        System.out.println("输入圆球半径->");//打印输出
       s = area.Area(in.nextDouble());//输入圆球半径
        System.out.println("面积" + s);//打印输出

        System.out.println("输入圆锥底面积，高->");//打印输出
       s = area.Area(in.nextDouble(), in.nextDouble());//输入圆锥底面积，高
        System.out.println("面积" + s);//打印输出

        System.out.println("输入长方体，length,width,height->");//打印输出
       s = area.Area(in.nextDouble(),in.nextDouble(),in.nextDouble());//输入长方体，length,width,height
        System.out.println("面积" + s);//打印输出
    }
}

class Area
{
    static double Area(double r)
    {
        return 3/4.0 * Math.PI * r * r * r;
    }

    static double Area(double r, double h)
    {
        return 1/3.0 * Math.PI * r * r * h;
    }

    static double Area(double l, double w, double h)
    {
        return l * w * h;
    }
}