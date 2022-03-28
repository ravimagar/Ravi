package com.company.interfaceexample.java8example;

public class TestInterfaceDefault {

    final int a;

    TestInterfaceDefault(){
        a =10;
    }
    public static void main(String args[]) {
        Drawable d = new Rectangle();
        d.draw();
        d.msg();
        System.out.println(Drawable.cube(3));
    }
}