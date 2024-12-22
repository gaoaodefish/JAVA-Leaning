package com.animalking;

public class Elephant extends Mammal{
    public Elephant (String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(super.name+"叫声：hang hang!");
    }

    public void eat(String food){
        System.out.println(super.name+"eat: "+food);
    }

    public void move(){
        System.out.println(super.name+"移动方式：running");
    }
}
