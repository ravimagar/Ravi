package com.company.superkeyword;

public class Dog extends Animal {
    String color = "black";

    Dog(){
        super();
        System.out.println("Hi");
    }

    void eat() {
        System.out.println("eating child class...");
    }

    void printColor(){
        super.eat();
        System.out.println(color);
        System.out.println(super.color);
    }

        public static void main(String[] args){
            Dog d = new Dog();
            d.printColor();
            System.out.println(d.color);
        }
    }
