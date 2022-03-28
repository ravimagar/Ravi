package com.company.interfaceexample.java8example;

public interface Drawable {
    void draw();

    default void msg() {
        System.out.println("default method");
    }

    static int cube(int x) {
        return x * x * x;
    }
}
