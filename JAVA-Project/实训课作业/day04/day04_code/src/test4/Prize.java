package test4;

import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Prize {
    public static void award_result(int[] a, int n) {
        Random rd = new Random();
        Icon icon = new ImageIcon("caishen.gif");
        Icon iconhaha = new ImageIcon("haha.gif");
        int i, money, m = a.length;
        int count = 10;

        do {
            count--;
            int yu = 10 - count;
            String strcount = Integer.toString(count);
            String stryu = Integer.toString(yu);
            String str = "           准备第" + stryu + "抽奖";
            JOptionPane.showMessageDialog(null, "          单击 OK 开始", str, JOptionPane.INFORMATION_MESSAGE, icon);
            money = rd.nextInt(n) + 1;

            for (i = 0; i < m; i++) {
                if (a[i] == money) {
                    JOptionPane.showMessageDialog(null, "恭喜中奖!!! 奖金额为" + money, "抽奖", JOptionPane.INFORMATION_MESSAGE, iconhaha);
                    break;
                } else {
                    continue;
                }
            }

            if (count == 0) {
                JOptionPane.showMessageDialog(null, "谢谢光顾，祝您好运！\n这次完成抽奖全部，单击'确定'结束", "抽奖", JOptionPane.INFORMATION_MESSAGE, icon);
            } else {
                JOptionPane.showMessageDialog(null, "谢谢光顾，祝您下一次好运！\n这次完成抽奖，单击'确定'开始下一次", "抽奖", JOptionPane.INFORMATION_MESSAGE, icon);
            }
        } while (count > 0);
    }
}



