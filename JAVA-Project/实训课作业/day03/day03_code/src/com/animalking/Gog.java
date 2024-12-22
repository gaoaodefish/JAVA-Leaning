package com.animalking;

public class Gog extends Mammal{
    public Gog(String name){
        super(name);
    }

    public void makeSound(){
        System.out.println(super.name+"叫声：wang wang!!");
    }

    public void eat(String food){
        System.out.println(super.name+"吃"+food);
    }

    public void move(){
        System.out.println(super.name+"移动方式：四条腿跑");
    }
}
