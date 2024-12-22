package test2;

import java.io.*;
import java.net.*;

public class Server {
    private static final int PORT = 12345; // 定义监听端口

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        DataOutputStream out = null;

        try {
            // 创建服务器套接字并绑定到指定端口
            serverSocket = new ServerSocket(PORT);
            System.out.println("Server started on port " + PORT);

            // 等待客户端连接
            clientSocket = serverSocket.accept();
            System.out.println("Client connected");

            // 获取输出流，用于向客户端发送数据
            out = new DataOutputStream(clientSocket.getOutputStream());

            // 向客户端发送数据
            out.writeUTF("Hello from Server!");
            System.out.println("Message sent to client");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (out != null) out.close();
                if (clientSocket != null) clientSocket.close();
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

