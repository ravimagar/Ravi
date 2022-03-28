package com.company.interfaceexample;

public class Interface2 implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        Interface2 i2 = new Interface2();
        i2.print();
        i2.show();
    }
}
