package com.company.constructor;


import com.company.digital.*;
import com.company.digital.studysubpackage.SubClassExample;

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
        SubClassExample sb = new SubClassExample();
        AsciiValueAtoZ a = new AsciiValueAtoZ();
    }
}
