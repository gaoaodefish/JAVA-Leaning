package com.test4;

public class StudentTest {
    public static void main(String[] args) {
        Student[] stu = new Student[3];

        Student s1 = new Student("001", "zhuangsan", 18);
        Student s2 = new Student("002", "lisi", 18);
        Student s3 = new Student("003", "wangwu", 18);
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;

        Student s4 = new Student("004", "zhaoliu", 18);
        boolean flag = true;
        for (int i = 0; i < stu.length; i++) {
            Student student = stu[i];
            if(student.getID().equals(s4.getID())){
                flag = false;
                break;
            }
        }

        if(flag){
            Student[] stu1 = new Student[stu.length+1];
            int i;
            for (i = 0; i < stu.length; i++) {
                Student student = stu[i];
                stu1[i] = student;
            }
            stu1[i] = s4;

            for (int i1 = 0; i1 < stu1.length; i1++) {
                Student student = stu1[i1];
                System.out.println(student.getID()+","+student.getName()+","+student.getAge());
            }
        }
        else System.out.println("error, 学号重复");
    }
}
