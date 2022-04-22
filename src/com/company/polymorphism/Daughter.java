package com.company.polymorphism;

public class Daughter extends FatherMother{

//    void marriage(int a, int b){
//        System.out.println("Child class method" + (a+b));
//    }

    public static void methodOverridingExample(){
        System.out.println("My child class static method");
    }


    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.marriage(30,40);

        methodOverridingExample();
    }
}
