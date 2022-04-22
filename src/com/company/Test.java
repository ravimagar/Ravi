package com.company;

public class Test {

    int a = 50;
    static int TEST_NAMING_CONVENTION = 10;


    void localMethod(){
        final int b = 10;
        int a = 30;
        System.out.println(a);
        System.out.println(b);
    }
    static void staticMethod(){
        int a = 10;
    }

    public static void main(String[] args) {
        Test te = new Test();
        System.out.println(te.a);
        te.localMethod();
    }
}
