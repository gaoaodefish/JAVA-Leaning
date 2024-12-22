package test3;
public class StringFunction {
    // 查找统计方法
    public int search(String str, String s) {
        int count = 0;
        int index = str.indexOf(s); // 使用 indexOf() 函数查找子串
        while (index != -1) {
            count++;
            index = str.indexOf(s, index + 1); // 查找下一个出现的子串
        }
        if (count > 0)
            System.out.println(s + "在字符串中出现了" + count + "次！！");
        else
            System.out.println("在字符串中没有找到" + s + "！！！");
        return count; // 返回计数
    }

    // 替换方法
    public String replace(String str, String s1, String s2) {
        int n = search(str, s1); // 查找子串获取计数
        if (n > 0) {
            str = str.replaceAll(s1, s2); // 若存在以新串替换旧串
            System.out.println("由" + n + "处被替换！！");
        }
        return str; // 返回替换后的新串
    }
}
