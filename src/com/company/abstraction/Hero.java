package com.company.abstraction;

public class Hero extends Bike{
    void run(){
        System.out.println("Running Safely");
    }

    public static void main(String[] args) {
        Hero b = new Hero();
        b.run();
    }
}
