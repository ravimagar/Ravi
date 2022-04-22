package com.company.constructor;

public class ConstructorTest {

    int a;


     ConstructorTest(){
        System.out.println("Hello I am default constructor");
    }

    ConstructorTest(int a, int b){
        System.out.println("Hello I am Parameterized constructor " + (a+b));
    }

    public static void main(String[] args) {
        ConstructorTest ct = new ConstructorTest();
        System.out.println(ct.a);
        ConstructorTest ct2 = new ConstructorTest(10,20);
        ConstructorTest ct3 = new ConstructorTest(20,30);
    }
}
