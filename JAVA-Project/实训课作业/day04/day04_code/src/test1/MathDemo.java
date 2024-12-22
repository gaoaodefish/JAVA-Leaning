package test1;

import java.util.Random;
import java.lang.Math;

class MathDemo {
    public static void main(String[] args) {
        Random r1 = new Random(1234567890L);
        Random r2 = new Random(1234567890L);

        boolean b = r1.nextBoolean(); //随机数不为0时取真值
        int i1 = r1.nextInt(100); //产生大于等于0小于100的随机数
        int i2 = r2.nextInt(100); //同上
        double d1 = r1.nextDouble(); //产生大于等于0.0小于1.0的随机数
        double d2 = r2.nextDouble(); //同上
        double d3 = Math.sin(Math.toRadians(30.0)); //求30度的正弦值
        double d4 = Math.log(Math.E); //求自然常数e的对数值
        double d5 = Math.round(33.6F); //四舍五入到最接近的整数

        System.out.println("b的随机数不为0时" + b);
        System.out.println("i1的随机数为" + i1);
        System.out.println("i2的随机数为" + i2);
        System.out.println("d1的随机数为" + d1);
        System.out.println("d2的随机数为" + d2);
        System.out.println("30度的正弦值为：" + d3);
        System.out.println("e的对数值：" + d4);
        System.out.println("33.6F四舍五入后的值：" + d5);
    }
}
