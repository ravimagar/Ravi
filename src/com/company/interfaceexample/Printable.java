package com.company.interfaceexample;

public interface Printable  {
    int a = 10;  //public static final
    int b = 20;
    int c = 30;
    void print();
    default void addAbstract(){
        System.out.println("Hi I am default method");
    }
}
