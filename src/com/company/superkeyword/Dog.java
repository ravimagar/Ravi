package com.company.superkeyword;

public class Dog extends Animal {
    String color = "black";

    Dog(){
        super();
    }

//    void eat() {
//        System.out.println("eating bread...");
//    }
//
//    void bark() {
//        System.out.println("barking...");
//    }
//
//    void work() {
//        super.eat();
//        bark();
//    }

        void printColor () {
            System.out.println(color);//prints color of Dog class
            System.out.println(super.color);//prints color of Animal class
        }
    }