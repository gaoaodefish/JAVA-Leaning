package test3;

// 自定义异常类
class MyException extends Exception {
    public String toString() {
        return "异常啦";
    }
}

public class CustomExceptionDemo {
    // 声明可能抛出自定义异常的方法
    public static void method() throws MyException {
        throw new MyException(); // 抛出自定义异常
    }

    public static void main(String[] args) {
        try {
            method(); // 调用声明异常的方法
        } catch (MyException e) {
            System.out.println(e); // 捕获并处理自定义异常
            return; // 终止程序执行
        }
        System.out.println("这里要执行"); // 如果没有异常，执行此语句
    }
}
