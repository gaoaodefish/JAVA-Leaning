package com.test2;

public class CommodityTest {
    public static void main(String[] args) {
        Commodity[] cm = new Commodity[3];

        Commodity s1 = new Commodity("001", "手机", 2000, 100);
        Commodity s2 = new Commodity("002", "保温杯", 100, 100);
        Commodity s3 = new Commodity("003", "辣条", 2, 100);

        cm[0] = s1;
        cm[1] = s2;
        cm[2] = s3;

        for (int i = 0; i < cm.length; i++) {
            System.out.println(cm[i].ID);
            System.out.println(cm[i].name);
            System.out.println(cm[i].price);
            System.out.println(cm[i].repertory);
        }
    }
}
