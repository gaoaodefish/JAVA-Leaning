package com.test1;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("a",100);
        Role r2 = new Role("b",100);

        while(true){
            r1.attack(r2);
            if(r2.getBlood() == 0)
            {
                System.out.println(r1.name+" K.O "+r2.name);
                break;
            }
            r2.attack(r1);
            if(r1.getBlood() == 0)
            {
                System.out.println(r2.name+" K.O "+r1.name);
                break;
            }
        }
    }
}
