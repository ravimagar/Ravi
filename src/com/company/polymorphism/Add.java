package com.company.polymorphism;

public class Add {
    static void adder(int a, int b){
        System.out.println("Addition of the two integer no " + (a+b));
    }

    static void adder(int a, int b, int c){
        System.out.println("Addition of the two integer no " + (a+b+c));
    }

    public static void main(String[] args) {
//        Add a = new Add();
//        a.adder(10, 20);
//        a.adder(10, 20, 30);
        Add.adder(10, 20);
        Add.adder(10, 20, 30);
    }
}
