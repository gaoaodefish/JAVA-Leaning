package com.animalking;

interface Animal{
    void makeSound();
    void eat(String food);
}

public abstract class Mammal implements Animal{
    String name;

    public Mammal(String name) {
        this.name = name;
    }

    public abstract void move();
}
