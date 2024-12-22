package com.Mypackage;
public class Person {
    private String name;
    private MyDate birth;
    public Person(String name, int year, int month, int day) {
        this.name = name;
        this.birth = new MyDate(year, month, day);
    }

    public int age() {
        return MyDate.thisyear() - birth.year();
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + birth);
        System.out.println("Age: " + age());
    }

    public static void main(String[] args) {
        Person p1 = new Person("张弛", 1990, 1, 1);
        p1.printInfo();
    }
}