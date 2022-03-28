package com.company.abstraction;

abstract class Bike {
    Bike(int a) {
        System.out.println("bike is created " + a);
    }

    void changeGear() {
        System.out.println("gear changed");
    }

    abstract void run();
}
