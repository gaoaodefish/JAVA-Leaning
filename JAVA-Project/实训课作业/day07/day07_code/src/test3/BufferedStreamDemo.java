package test3;

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) {
        // 定义文件路径
        String inputFile = "data3.txt";
        String outputFile = "output3.txt";

        try {
            // 创建文件输入流，用于读取数据
            FileInputStream fis = new FileInputStream(inputFile);
            // 创建文件输出流，用于写入数据
            FileOutputStream fos = new FileOutputStream(outputFile);

            // 使用缓冲流包装普通字节流
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int data;
            while ((data = bis.read()) != -1) { // 读取单个字节直到文件末尾
                bos.write(data); // 写入单个字节
            }

            // 刷新缓冲区，确保所有数据都写入文件
            bos.flush();

            // 关闭流
            bis.close();
            bos.close();
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

