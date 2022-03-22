package com.company.inheritance;

public class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        c.hunt();
        c.run();
    }

}
