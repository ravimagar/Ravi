package com.company.inheritance;

public class SingleInheritance {
    public static void main(String args[]) {
        BabyDog d = new BabyDog();
        d.bark();
        d.weep();
        d.bark();
        d.eat();

        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}