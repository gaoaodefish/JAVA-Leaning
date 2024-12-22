package test3;

public class StringFunctionTest {
    public static void main(String[] args)
    {
        StringFunction s=new StringFunction(); //创建StringFunction类对象
        String str="this is a book.this is good book."; //定义字符串
        s.search(str,"book"); //执行对象的查找方法查找“book”出现的次数
        str=s.replace(str,"good","a good"); //执行对象的查找方法以“a good”替换“good”
        System.out.println(str);
    }
}
