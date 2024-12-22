package test4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {
    public static void main(String[] args) {
        try {
            // 创建文件对象
            File file = new File("data4.txt");

            // 创建 DataOutputStream 用于写入数据
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));

            // 创建 DataInputStream 用于读取数据
            DataInputStream dis = new DataInputStream(new FileInputStream(file));

            // 写入数据到文件
            dos.writeUTF("张三丰"); // 以UTF编码的数据格式输出姓名
            dos.writeDouble(2500.0); // 以 double 的数据格式输出薪水
            dos.writeUTF("李四军"); // 再次以UTF编码的数据格式输出姓名
            dos.writeDouble(3500.0); // 再次以 double 的数据格式输出薪水

            // 刷新并关闭输出流
            dos.flush();
            dos.close();

            // 读取文件中的数据并打印
            System.out.println("姓名\t薪水");
            String name = dis.readUTF(); // 读取姓名
            double salary = dis.readDouble(); // 读取薪水
            System.out.println(name + "\t" + salary);

            name = dis.readUTF(); // 再次读取姓名
            salary = dis.readDouble(); // 再次读取薪水
            System.out.println(name + "\t" + salary);

            // 关闭输入流
            dis.close();
        } catch (IOException e) {
            System.out.println("文件读写异常");
        }
    }
}

