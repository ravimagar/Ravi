package com.company.interfaceexample;

public interface Test{

    int a = 10;
    void interfaceAbstractMethod();
//    void newMethod();

    default void defaultMethodInInterface(){
        System.out.println("Default Method of Test Interface");
    }

    static void staticMethodExample(){

    }

    private void privateMethodExample(){
        System.out.println("private method example");
    }

    static void main(String[] args) {
        System.out.println("Hello I am interface main method");
    }
}
