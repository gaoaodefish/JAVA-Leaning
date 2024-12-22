package test5;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        // 测试示例
        String[] romanNumbers = {"III", "IV", "IX", "LVIII", "MCMXCIV"};
        for (String roman : romanNumbers) {
            System.out.println("输入: " + roman + " -> 输出: " + romanToInt(roman));
        }
    }

    public static int romanToInt(String s) {
        // 定义罗马数字与整数的映射
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // 从右向左遍历字符串
        for (int i = s.length() - 1; i >= 0; i--) {
            char romanChar = s.charAt(i);
            int value = romanValues.get(romanChar);

            // 如果当前值小于前一个值，则减去该值；否则加上该值
            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }
            prevValue = value;
        }

        return total;
    }
}
