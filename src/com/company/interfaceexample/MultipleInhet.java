package com.company.interfaceexample;

public class MultipleInhet implements Test{

    @Override
    public void show() {

    }

    public void privateMethod(){
        System.out.println();
    }

    public static void main(String[] args) {
        MultipleInhet m = new MultipleInhet();
        m.checkDefaultMethod();
        Test.testing();
        m.privateMethod();
    }
}
