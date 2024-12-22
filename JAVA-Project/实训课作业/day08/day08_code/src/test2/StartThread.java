package test2;

public class StartThread extends Thread {
    // 线程入口点
    public StartThread(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (;;) {
            System.out.println(getName() + ":在唱歌");
            try {
                Thread.sleep(100); // 休眠100毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // 创建子类对象
        StartThread st1 = new StartThread("紫棋");
        StartThread st2 = new StartThread("敬腾");

        // 启动线程
        st1.start(); // 不保证立即运行, CPU调度
        st2.start();

        for (;;) {
            System.out.println("杰伦:在唱歌");
            try {
                Thread.sleep(100); // 休眠100毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
