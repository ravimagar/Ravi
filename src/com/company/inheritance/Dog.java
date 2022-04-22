package com.company.inheritance;

public class Dog extends Animal{
    void bark() {
        System.out.println("barking...");
    }

    void speak(){
        System.out.println("Dog is speaking");
    }

    void eat()
    {
        System.out.println("eating...");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        d.hunt();
        d.run();
    }
}
