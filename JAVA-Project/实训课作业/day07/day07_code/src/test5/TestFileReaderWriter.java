package test5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReaderWriter {
    public static void main(String[] args) {
        try {
            // 创建文件对象
            File file = new File("test5.txt");

            // 创建 FileWriter 用于写入数据
            FileWriter fw = new FileWriter(file);

            // 写入字符串到文件
            fw.write("Test使用FilerReader类和FileWriter类中国");

            // 刷新并关闭输出流
            fw.flush();
            fw.close();

            // 创建 FileReader 用于读取数据
            FileReader fr = new FileReader(file);

            // 使用 StringBuffer 来存储读取的内容
            StringBuffer sb = new StringBuffer();
            int i;

            // 逐字符读取文件内容并追加到 StringBuffer
            while ((i = fr.read()) != -1) {
                sb.append((char) i);
            }

            // 打印读取的内容
            System.out.println(sb.toString());

            // 关闭输入流
            fr.close();
        } catch (IOException e) {
            System.out.println("文件读写异常");
        }
    }
}

