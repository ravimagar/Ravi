package com.company.finalkeyword;

public class Bike {
    final int speedLimit;//final variable
    int b = 10;
    Bike(){
        speedLimit = 20;
    }
    int i = 10;
    void run() {
//        speedLimit = 400;
        int i = 30;
    }

    final void fast(){
        System.out.println("You are running fast....");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
}
