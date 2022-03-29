package com.company.abstraction;

public class Hero extends Bike{

    Hero(int b){
        super(b);
        System.out.println("Test");
    }
    void run(){
        System.out.println("Running Safely");
    }

    public static void main(String[] args) {
        Hero b = new Hero(300);
        b.run();
    }


}
