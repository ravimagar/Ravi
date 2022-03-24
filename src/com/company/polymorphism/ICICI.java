package com.company.polymorphism;

public class ICICI extends Bank{
    float getRateOfInterest(){return 7.3f;}

    public static void main(String[] args) {
        ICICI ic = new ICICI();
        System.out.println("Rate of interest " + ic.getRateOfInterest());
    }
}
