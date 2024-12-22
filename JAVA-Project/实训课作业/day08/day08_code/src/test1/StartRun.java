package test1;

public class StartRun implements Runnable {
    @Override
    public void run() {
        for (;;) {
            System.out.println("一边唱歌");
        }
    }

    public static void main(String[] args) {
        // 创建实现类对象
        Thread t1 = new Thread(new StartRun());

        // 创建代理类对象
        Thread t2 = new Thread(new StartRun());

        // 启动
        t1.start(); // 不保证立即运行，CPU调度
        t2.start(); // 不保证立即运行，CPU调度

        for (;;) {
            System.out.println("主线程中：一边刷牙");
        }
    }
}
