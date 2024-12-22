package test4;

public class MusicPlay implements Runnable {
    // 静态变量，用于统计总歌曲数
    private static int songNumber = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { // 假设每个线程唱10首歌
            synchronized (MusicPlay.class) { // 同步代码块
                songNumber++; // 安全地增加歌曲数
            }
            System.out.println(Thread.currentThread().getName() + "在唱自己的第" + (i + 1) + "首歌");
            try {
                Thread.sleep(180); // 模拟唱歌时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // 创建实现类对象
        MusicPlay sr1 = new MusicPlay();
        // 创建代理类对象
        Thread t1 = new Thread(sr1, "周杰伦");
        t1.setPriority(10);
        // 创建代理类对象
        Thread t2 = new Thread(sr1, "邓紫棋");
        t2.setPriority(1);
        t1.start();
        t2.start();

        // 主线程也唱10首歌
        for (int i = 0; i < 10; i++) {
            synchronized (MusicPlay.class) { // 同步代码块
                songNumber++; // 安全地增加歌曲数
            }
            System.out.println("      在自己的唱第" + (i + 1) + "首歌");
            try {
                Thread.sleep(100); // 模拟唱歌时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 等待所有线程完成
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 输出总歌曲数
        System.out.println("演唱会的总歌曲数：" + songNumber);
    }
}

