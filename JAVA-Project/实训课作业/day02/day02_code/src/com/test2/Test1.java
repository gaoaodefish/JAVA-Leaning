package com.test2;

public class Test1 {
    String id;
    int age;
    public Test1() {
    }

    public Test1(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public String getAge(int i) {
        return "age";
    }
    public void setAge(int age) {
        this.age = age;
    }
}
