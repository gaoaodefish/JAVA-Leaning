package test6;

import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        // 创建扫描器对象以读取用户输入
        Scanner scanner = new Scanner(System.in);

        // 读取第一个二进制字符串
        System.out.print("请输入第一个二进制字符串: ");
        String a = scanner.nextLine();

        // 读取第二个二进制字符串
        System.out.print("请输入第二个二进制字符串: ");
        String b = scanner.nextLine();

        // 调用方法计算二进制字符串的和
        String result = addBinary(a, b);

        // 输出结果
        System.out.println("结果: " + result);

        // 关闭扫描器
        scanner.close();
    }

    public static String addBinary(String a, String b) {
        // 将二进制字符串转换为整数
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);

        // 计算两个整数的和
        int total = num1 + num2;

        // 将结果转换回二进制字符串并返回
        return Integer.toBinaryString(total);
    }
}
