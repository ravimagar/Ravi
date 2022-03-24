package com.company.polymorphism;

public class MethodOverloadingByChangingArgs {
    void adder1(int a, int b){
        System.out.println("Addition of the two integer no " + (a+b));
    }

    void adder2(double a, double b, double c){
        System.out.println("Addition of the two integer no " + (a+b+c));
    }

    public static void main(String[] args) {
        MethodOverloadingByChangingArgs a = new MethodOverloadingByChangingArgs();
        a.adder1(10, 20);
        a.adder2(10.5, 20.4, 30.5);
    }
}
