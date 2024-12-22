package test1;

import java.io.IOException;
import java.net.InetAddress;

public class MainClass {
    public static void main(String[] args) throws IOException {
        // 获取百度的IP地址并输出
        InetAddress ip = InetAddress.getByName("www.baidu.com");
        System.out.println("百度的IP地址：" + ip.getHostAddress());

        // 判断百度地址是否3秒内能到达
        if (ip.isReachable(3000)) {
            System.out.println("百度在3秒内到达了！");
        } else {
            System.out.println("百度在3秒内无法到达！");
        }

        // 获取本机的IP地址并输出
        InetAddress lc = InetAddress.getLocalHost();
        System.out.println("本机的IP地址：" + lc.getHostAddress());

        // 获取新浪的IP地址并输出
        InetAddress sinaIp = InetAddress.getByName("www.sina.com.cn");
        System.out.println("新浪的IP地址：" + sinaIp.getHostAddress());

        // 判断新浪地址是否3秒内能到达
        if (sinaIp.isReachable(3000)) {
            System.out.println("新浪在3秒内到达了！");
        } else {
            System.out.println("新浪在3秒内无法到达！");
        }
    }
}
