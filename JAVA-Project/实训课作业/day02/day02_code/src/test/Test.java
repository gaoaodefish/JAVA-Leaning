package test;

import M01.Mankind;
import S01.Student;

public class Test {
    public static void main(String[] args) {
        Mankind p1 = new Mankind();
        p1.setData("王军", 2018066);
        p1.id = 2020002;
        p1.print();
        Student s1 = new Student();
        s1.setData("刘云", 2019005);
        s1.sit = "电气工程学院";
        s1.exp = "电子信息工程专业";
        s1.print();
        System.out.println(s1.name + ": " + s1.sit + ", " + s1.exp);
    }
}
