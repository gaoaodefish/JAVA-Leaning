package com.code.test1;

public class UserTest1 {
    public static void main(String[] args) {
        User u = new User("zhangsan", "123456", "123@gmail.com", "nan", 19);

        System.out.println(u.getUsername());
        System.out.println(u.getPassword());
        System.out.println(u.getEmail());
        System.out.println(u.getGender());
        System.out.println(u.getAge());
    }
}
