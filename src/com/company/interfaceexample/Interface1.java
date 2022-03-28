package com.company.interfaceexample;

public class Interface1 implements InterfaceBeforeEight{

    @Override
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Interface1 i1 = new Interface1();
        i1.print();
    }
}
