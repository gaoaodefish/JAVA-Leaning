package test2;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo01 {
    public static void main(String[] args) {
        // 要写入的字符串
        String font = "输出流是用来写入数据的！";

        try {
            // 创建FileOutputStream对象，用于向文件"FOS例子的.txt"写入数据
            FileOutputStream fos = new FileOutputStream("FOS例子的.txt");

            // 将字符串转换为字节数组并写入文件
            fos.write(font.getBytes());

            // 关闭文件输出流，释放资源
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

