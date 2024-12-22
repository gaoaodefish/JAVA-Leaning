//import java.util.ArrayList;
//import java.util.List;
//
//public class Main{
//    public static void main(String[] args) {
//        List<String> a=new ArrayList<>();
//        a.add("aaa");
//        a.add("bbb");
//        System.out.println(a.get(0));
//        System.out.println(a.get(1));
//    }
//}
//
//class Ret<E>{
//    public void ret(E a, E b)
//    {
//        String str;
//        str = a;
//
//    }
//}

//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("泛型示例");
//        List<? extends DongWu> a = new ArrayList<>();
//        a.add(new Gou());
//        a.add(new Mao());
//        a.add(new DongWu());
//        a.add(new ShengWu());
//
//    }
//}
//
class ShengWu{

}

class DongWu extends ShengWu{

}

class ZhiWu extends ShengWu{

}

class Gou extends DongWu{

}

class Mao extends DongWu{

}

class Hua extends ZhiWu{

}

class Tree extends ZhiWu{

}

//public class Main
//{
//    public static void main(String[] args)
//    {
//        System.out.println("泛型示例");
//        BanJi<String> bj = new BanJi<String>();
//        BanJi<Integer> bj1 = new BanJi<>();
//        bj.stu = "灰太狼大王";
//        bj1.stu = 1;
//        System.out.println(bj.stu);
//        System.out.println(bj1.getInof());
//    }
//}
////这是泛型类的设计样例
//class BanJi<T>
//{
//    T stu;
//    public void setInfo(T stu)
//    {
//            this.stu = stu;
//    }
//    public T getInof()
//    {
//        return stu;
//    }
//}

//import java.util.ArrayList;
//import java.util.List;

//public class Main {
//    public static void main(String[] args) {
//        List<Integer> integerList = new ArrayList<>();
//        integerList.add(1);
//        integerList.add(2);
//        integerList.add(3);
//        int i=0;
//        int num = 0;
//        for(i = 0; i < integerList.size(); i++)
//        {
//            num += integerList.get(i);
//        }
//        System.out.println("sum = " + num);
//    }
//}


//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//        System.out.println("\t宿舍人员管理系统");
//        ArrayList<String> ry = new ArrayList<String>();//创建对象
//        //初始人员
//        //"小一","小二","小三","小四","小五","小六"
//        ry.add("小一");
//        ry.add("小二");
//        ry.add("小三");
//        ry.add("小四");
//        ry.add("小五");
//        ry.add("小六");
//        boolean start = true;
//        do{
//            //选择方式打印, 可视化
//            System.out.println();
//            System.out.println("1.查询已有成员");
//            System.out.println("2.修改已有成员");
//            System.out.println("3.添加成员");
//            System.out.println("4.删除成员");
//            System.out.println("5.退出程序");
//            //输入选择 0-4
//            Scanner in = new Scanner(System.in);
//            int num = in.nextInt();
//            System.out.println();
//            Iterator iterator = ry.iterator();
//            switch(num)
//            {
//                case 1:
//                    while(iterator.hasNext()){
//                        Object object = iterator.next();
//                        System.out.println(object);
//                    }
//                    break;
//                case 2:
//                    int i = 0;
//                    while(iterator.hasNext()){
//                        i++;
//                        Object object = iterator.next();
//                        System.out.println(i + ". " + object);
//                    }
//                    System.out.println("请输入你要修改的 成员编号 和 修改内容：");
//                    Scanner scanner = new Scanner(System.in);
//                    ry.set(in.nextInt() - 1,scanner.nextLine());
//                    break;
//                case 3:
//                    Scanner s = new Scanner(System.in);
//                    ry.add(s.nextLine());
//                    break;
//                case 4:
//                    Scanner s1 = new Scanner(System.in);
//                    ry.remove(s1.nextInt()-1);
//                    break;
//                case 5:
//                    System.out.println("The end!!!");
//                    start = false;
//                    break;
//                default:
//                    System.out.println("Error");
//                    System.out.println("Please enter again.");
//                    break;
//            }
//        }while(start);
//    }
//}


//import java.time.Duration;
//import java.time.LocalTime;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.Locale;

//public class Main {
//    public static void main(String[] args) {
////        System.out.println("System class(common)");
////        int result = (int)(Math.random()*38 + 1);
////        System.out.println("同学号码(1~38)：\t" + result);
////
//////        Date date1 = new Date();
//////        System.out.println(date1);
//////        Date date2 = new Date(System.currentTimeMillis() + 5000);
//////        System.out.println(date2);
//////        Calendar calendar = Calendar.getInstance();
//////        int year = calendar.get(Calendar.YEAR);
//////        int month = calendar.get(Calendar.MONTH) + 1;
//////        System.out.println("日期：");
//////        System.out.println(year + "年" + month + "月");
//////
//////        LocalTime start = LocalTime.now();
//////        LocalTime end = LocalTime.of(12, 0, 0);
//////        Duration duration = Duration.between(start, end);
//////        System.out.println("时间差：" + duration.toHours());
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        System.out.println("集合使用->");
//        ArrayList<String> zy = new ArrayList<String>();//创建对象
//        zy.add("电子");//添加一个元素
//        zy.add("物联网");
//        zy.add("通信");
//        zy.add("网络");
//        zy.add("电气");
//        zy.add("集成电路");
//        System.out.println(zy);
//        System.out.println("专业总数是：" + zy.size());//求集合长度
//        System.out.println("第二个专业是：" + zy.get(1));//求集合中的其中一个元素
//        zy.remove(4);
//        System.out.println(zy);
//        zy.set(1, "智能产品设计");//修改集合其中一个元素的 value
//        System.out.println(zy);
//
//        Iterator myiterator = zy.iterator();//便利器——创建对象
//        while(myiterator.hasNext()){
//            Object myobject = myiterator.next();//对象类——创建对象
//            System.out.println(myobject);
//        }
//        zy.clear();//清空集合内的数据
//        System.out.println(zy);
//
//        Collection c1 = new ArrayList();
//        c1.add(1);
//        c1.add(2);
//        c1.add(3);
//        c1.add("asd");
//        c1.add("a");
//        System.out.println(c1);
//        zy.addAll(c1);
//        System.out.println(zy);
//
//        Collection c2 = new ArrayList();
//        c2.add(1);
//        c2.add(2);
//        c2.add(3);
//        c2.add("asd");
//        c2.add("asd");
//        System.out.println(c2);
//        c1.addAll(c2);
//        System.out.println(c1);
//        c1.removeAll(c2);
//        System.out.println(c1);
//
//        boolean c = c2.contains(5);
//        System.out.println(c);
//    }
//}