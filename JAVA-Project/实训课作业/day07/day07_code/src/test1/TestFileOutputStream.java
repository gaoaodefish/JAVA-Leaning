package test1;

import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class TestFileOutputStream {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            FileOutputStream fos = new FileOutputStream(file);
            // 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
            String content = "This is a sample of using FileOutputStream";
            fos.write(content.getBytes()); // 将字符串转换为字节数组并写入文件
            fos.close(); // 关闭文件输出流
        } catch (IOException e) {
            System.out.println("文件读写异常");
        }
    }
}

