package com.company.constructor;

public class DefaultConstructor {
    int i;
    String s;

    void display(){
        System.out.println("Default constructor Vaules " + i);
        System.out.println("Default constructor Vaules " + s);
    }

    public static void main(String[] args) {
        DefaultConstructor dc = new DefaultConstructor();   //calling a default constructor
        dc.display();
    }
}
