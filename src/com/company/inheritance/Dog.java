package com.company.inheritance;

public class Dog extends Animal{
    void bark() {
        System.out.println("barking...");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        d.hunt();
        d.run();
    }
}
