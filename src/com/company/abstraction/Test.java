package com.company.abstraction;

public class Test extends AbstractClassTest {
    Test() {
        super(20);
        System.out.println("Test Class Constructor");
    }

    public static void main(String[] args) {
        Test obj = new Test();
    }
}
