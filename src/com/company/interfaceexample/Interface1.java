package com.company.interfaceexample;

import static com.company.interfaceexample.Test.testing;

public class Interface1 implements InterfaceBeforeEight{

    @Override
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Interface1 i1 = new Interface1();
        i1.print();
        testing();
    }
}
