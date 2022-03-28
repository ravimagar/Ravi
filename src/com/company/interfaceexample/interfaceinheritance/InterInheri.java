package com.company.interfaceexample.interfaceinheritance;

public class InterInheri implements Shows {

    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        InterInheri ii = new InterInheri();
        ii.print();
        ii.show();
    }
}
