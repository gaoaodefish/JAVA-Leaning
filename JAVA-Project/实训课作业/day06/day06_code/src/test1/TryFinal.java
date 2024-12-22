package test1;

public class TryFinal {
    public static void main(String[] args) {
        try {
            int n = 10;
            System.out.println(n / 6);  // ⑤ 发生异常的位置
        } catch (ArithmeticException e) {
            System.out.println("异常是: " + e.getMessage());  // 捕获异常
            return;  // ① 提前退出
        } finally {
            System.out.println("无论如何程序执行到此！");  // ③ finally 总会执行
        }
    }
}
