package test5;

public class StringTest {
    public static void main(String[] args) {
        String s = "i am a student";
        int index = s.lastIndexOf(' ');
        int result = s.length() - index - 1;
        System.out.println("最后一个单词的长度为：" + result);
    }
}
