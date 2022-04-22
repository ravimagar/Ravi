package com.company.polymorphism;

public class FatherMother {

   final void marriage(int a, int b){
        System.out.println("You must have to do marriage with our choice" + (a+b));
    }

    final void marriage(int a, int b, int c){
        System.out.println("You must have to do marriage with our choice" + (a+b+c));
    }

    public static void methodOverridingExample(){
        System.out.println("My parent class static method");
    }

    public void upcasting(){
        System.out.println("Upcasting example");
    }

    public static void main(String[] args) {

    }
}
