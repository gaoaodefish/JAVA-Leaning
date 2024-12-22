package com.user;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号：");
        String name = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();

        User u = new User("Make", "123456");

        if(u.getName().equals(name) && u.getPassword().equals(password)){
            System.out.println("*************************");
            System.out.println("登录成功");
        }
        else{
            System.out.println("*************************");
            System.out.println("登录失败");
        }
    }
}
