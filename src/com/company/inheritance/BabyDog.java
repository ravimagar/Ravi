package com.company.inheritance;

public class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }

    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.bark();
        bd.eat();
        bd.hunt();
        bd.run();
    }
}
