package com.company.interfaceexample;

public interface EveningBatchInterface {

    int a = 10;

   void test();
    void show();

    default void defaultMethod() {
        System.out.println("Hello this is my default method");
    }

    static void main(String[] args) {
        System.out.println("Hello");
    }

    private void myPrivateInterfaceMethod(){
        System.out.println("private method");
    }
}
