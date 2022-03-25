package com.company.superkeyword;

public class Dog extends Animal {
    String color = "black";

    Dog(){
        super();
        System.out.println("Test");
    }

    void eat() {
        System.out.println("eating bread...");
    }
//
//    void bark() {
//        System.out.println("barking...");
//    }
//
    void work() {
        eat();
        super.eat();
//        bark();
    }

        void printColor () {
            System.out.println(color);//prints color of Dog class
            System.out.println(temp);//prints color of Dog class
            System.out.println(super.color);//prints color of Animal class
        }

    public static void main(String[] args) {
        Dog d = new Dog();
//        d.printColor();
//        d.work();
    }
    }