package com.animalking;

public class Lion extends Mammal{
    public Lion(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(super.name+"叫声：aow aow!");
    }

    @Override
    public void eat(String food) {
        System.out.println(super.name+"eat: " + food);
    }

    @Override
    public void move() {
        System.out.println(super.name+"移动方式：running running!!!!!!");
    }
}
