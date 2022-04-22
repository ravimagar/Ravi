package com.company.abstraction;

public class SubClassExample extends Test {


    @Override
    void abstractMethod() {

    }

    public static void main(String[] args) {
        SubClassExample s = new SubClassExample();
        s.normalMethod();
        s.finalMethod();
    }
}
