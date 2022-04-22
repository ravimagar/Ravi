package com.company.inheritance;

public class Employee {
    float salary = 40000;

    public static void main(String[] args) {
        Cat c = new Cat();
        c.run();
        System.out.println(c.a);

        Animal a = new Animal();

        a.eat();
        a.hunt();

//        Cat e = new Animal();

        Cat d = (Cat)a;
        d.run();
    }
}
