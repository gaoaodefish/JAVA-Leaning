package dzxx.dz23;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Fs extends Thread{
    public static void main(String[] args) throws IOException {
        System.out.println("这是网络编程样例");
        InetAddress ip = InetAddress.getByName("192.168.1.1");
        boolean reachable = ip.isReachable(5000);

        if(reachable){
            System.out.println("到达");
        }
        else{
            System.out.println("无法到达");
        }
    }
}

//public class Fs extends Thread{
//    public void run(){
//        for(int i = 0; i<10; i++){
//            System.out.print(i);
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        System.out.println("这是多线程样例");
//        Fs xc1 = new Fs();
//        xc1.start();
//        Fs xc2 = new Fs();
//        xc2.start();
//        Fs xc3 = new Fs();
//        xc3.start();
//    }
//}

//package dzxx.dz23;
//import java.io.*;
//
//public class Fs{
//    public static void main(String[] args) throws IOException {
//        System.out.println("文件操作样例");
//        File file = new File("D:\\name");
//        file.mkdir();
//        System.out.println("文件创建成功");
////        file.delete();
////        System.out.println("文件删除成功");
//        file = new File("D:\\name","hello.txt");
//        try {
//            FileWriter writer = new FileWriter(file);
//            writer.write("HelloJavaWorld");
//            writer.flush();
////            writer.append("123456789");
////            writer.flush();
//            writer.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            FileInputStream in = new FileInputStream(file);
//            int n = 0;
//            int size = in.available();
//            byte[] b = new byte[size];
//            while((n = in.read(b, 0, 3)) != -1)
//            {
//                String str = new String(b, 0, n);
//                System.out.print(str);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}

//import java.lang.reflect.Method;
//
//public class Fs{
//    public static void main(String[] args) {
//        System.out.println("fanSe");
//        Class<?> test = MyClass.class;
//        Method[] myFf = test.getMethods();
//        for(Method method:myFf)
//        {
//            System.out.println("GGFFm:" + method.getName());
//        }
//    }
//}
//
//class MyClass{
//    public void fangFa1(){
//
//    }
//    public void fangFa2(){
//
//    }
//    public void fangFa3(){
//
//    }
//}

/*
 *
 *
 *
 //import java.sql.SQLOutput;
//
//public class Fs {
//    public static void main(String[] args) {
//        System.out.println("zheshifanseyangli");
////        Yuan yuan = new Yuan();
//        Class<?> yuan = null;
//        Class<?> yuan2 = null;
//        Class<?> yuan3 = null;
//        try {
//            yuan = Class.forName("dzxx.dz23.Yuan");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        yuan2 = new Yuan().getClass();
//
//        yuan3 = Yuan.class;
//
//        System.out.println("leidemingchengshi:" + yuan.getName());
//        System.out.println("leidemingchengshi:" + yuan2.getName());
//        System.out.println("leidemingchengshi:" + yuan2.getName());
//    }
//}
//
//class Yuan{
//
//}
 * ******/