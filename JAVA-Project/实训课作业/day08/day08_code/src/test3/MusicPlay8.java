package test3;

public class MusicPlay8 implements Runnable {
    static int songNumber = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { // 假设每个线程唱10首歌
            songNumber++;
            System.out.println(Thread.currentThread().getName() + "在唱自己的第" + i + "首歌");
            try {
                Thread.sleep(100); // 休眠100毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // 创建实现类对象
        MusicPlay8 sr1 = new MusicPlay8();

        // 创建代理类对象
        Thread t1 = new Thread(sr1);
        t1.setName("杰伦");
        t1.setPriority(Thread.MAX_PRIORITY); // 设置为最高优先级

        Thread t2 = new Thread(sr1);
        t2.setName("邓紫棋");
        t2.setPriority(Thread.MIN_PRIORITY); // 设置为最低优先级

        t1.start(); // 不保证立即运行, CPU调度
        t2.start();

        for (int i = 0; i < 10; i++) { // 主线程也唱10首歌
            System.out.println("      在自己的唱第" + (i + 1) + "首歌");
            try {
                Thread.sleep(100); // 休眠100毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
