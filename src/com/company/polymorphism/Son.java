package com.company.polymorphism;

public class Son extends FatherMother{

//    void marriage(int a, int b){
//        System.out.println("You must have to do son child marriage" + (a+b));
//    }
    public static void main(String[] args) {
        Son s = new Son();
        s.marriage(10, 20);
    }
}
