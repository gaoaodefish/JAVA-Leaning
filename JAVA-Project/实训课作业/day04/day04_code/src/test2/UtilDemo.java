package test2;

import com.sun.jdi.ShortType;

import java.util.*;
import java.text.*;

public class UtilDemo {
    public static void main(String[] args) {
        Date today = new Date(); // 当前日期和时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒a EEEEE");
        System.out.println("当前日期和时间：" + sdf.format(today));

        long hms = today.getTime(); // 当前时间的毫秒数
        System.out.println("当前时间的毫秒数=" + hms);

        Date tomorrow = new Date(hms + 24 * 60 * 60 * 1000);
        System.out.println("明天是" + sdf.format(tomorrow));

        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR); // 年份
        int month = now.get(Calendar.MONTH) + 1; // 月份
        int day = now.get(Calendar.DATE); // 日期
        System.out.printf("今天是%4d年%2d月%2d日", year, month, day);

        int week = now.get(Calendar.DAY_OF_WEEK); // 星期
        String weekstr = "";
        switch (week) {
            case Calendar.SUNDAY:
                weekstr = "星期日";
                break;
            case Calendar.MONDAY:
                weekstr = "星期一";
                break;
            case Calendar.TUESDAY:
                weekstr = "星期二";
                break;
            case Calendar.WEDNESDAY:
                weekstr = "星期三";
                break;
            case Calendar.THURSDAY:
                weekstr = "星期四";
                break;
            case Calendar.FRIDAY:
                weekstr = "星期五";
                break;
            case Calendar.SATURDAY:
                weekstr = "星期六";
                break;
        }
        System.out.println(weekstr);
    }
}
