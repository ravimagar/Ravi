package com.company.interfaceexample;

public interface Test {
    int i = 10;
    void show();

    default void checkDefaultMethod() {
        System.out.println("Hello Default Method Refactoring");
        System.out.println("hiiiiiiiii");
    }

    static void testing() {
        System.out.println("Hello Static Method");
    }

    private void privateMethod(){
        System.out.println("Private Method Calling");
    }
}
