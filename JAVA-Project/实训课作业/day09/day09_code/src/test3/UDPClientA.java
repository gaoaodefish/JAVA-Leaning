package test3;

import java.net.*;

public class UDPClientA {
    public static void main(String[] args) throws Exception {
        // 创建数据数组，包含发送的数据信息
        byte[] data = "Hello, Server!".getBytes();

        // 定义服务器的地址、端口号
        InetAddress address = InetAddress.getByName("baidu.com");
        int port = 8000;

        // 新建DatagramPacket对象
        DatagramPacket packet = new DatagramPacket(data, data.length, address, port);

        // 创建DatagramSocket对象
        DatagramSocket socket = new DatagramSocket();

        // 向服务器发送数据
        socket.send(packet);

        // 关闭资源
        socket.close();
    }
}

