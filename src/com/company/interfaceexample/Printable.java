package com.company.interfaceexample;

public interface Printable extends Showable, Test {
    int a = 10;  //public static final
    int b = 20;
    int c = 30;
    void print();
}
