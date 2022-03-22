package com.company.polymorphism;

public class PolyMophism extends Morphy{
    void check(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Morphy pm = new PolyMophism();
        PolyMophism psm = new PolyMophism();
        pm.test();
        psm.check();
    }
}
