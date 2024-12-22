package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {
    public static void main(String[] args) {
        try {
            File file = new File("事先准备的.txt");
            FileInputStream fis = new FileInputStream(file);
            // 以 file 为数据来源创建输入法 fis
            int i;
            // 流 fs 调用 read()方法输入数据，fs.read()读取一个字节的数据以 int 型的值赋值给 i,读到文件结尾符(-1)为止
            while ((i = fis.read()) != -1) {
                System.out.print((char) i); // 又将 i 转换为 ASCII 字符输出
            }
            fis.close(); // 关闭文件输入流
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            System.out.println("文件读写异常");
        }
    }
}
