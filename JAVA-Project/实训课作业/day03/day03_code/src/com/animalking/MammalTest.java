package com.animalking;

public class MammalTest {
    public static void main(String[] args) {
        System.out.println("=============================");
        Gog dog = new Gog("旺财");
        dog.makeSound();
        dog.eat("dog food");
        dog.move();
        System.out.println("=============================");

        Elephant elephant = new Elephant("大胖");
        elephant.makeSound();
        elephant.eat("fruits");
        elephant.move();
        System.out.println("=============================");

        Lion lion = new Lion("狮王");
        lion.makeSound();
        lion.eat("meat");
        lion.move();
        System.out.println("=============================");
    }
}
