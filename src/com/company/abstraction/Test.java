package com.company.abstraction;

abstract class Test {

    Test(){

    }

    abstract void abstractMethod();

    void normalMethod(){
        System.out.println("Normal Method");
    }

    final void finalMethod(){
        System.out.println("Hi I am final Method");
    }

    public static void main(String[] args) {

    }
}
