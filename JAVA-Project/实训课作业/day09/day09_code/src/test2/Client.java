package test2;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String ipAddress = "192.168.239.9";
        int port = 5000;
        String message = "你是狗吧";

        try (Socket socket = new Socket(ipAddress, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            System.out.println("Connected to server at " + ipAddress + ":" + port);

            // 发送消息
            out.println(message);

            // 读取服务器响应（可选）
            String response = in.readLine();
            System.out.println("Server response: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}