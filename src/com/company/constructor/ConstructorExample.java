package com.company.constructor;

public class ConstructorExample {

    String s;
    int a;

    ConstructorExample(int a, int b){
        System.out.println(a-b);
        System.out.println(a+b);
        System.out.println(a/b);
        System.out.println(a%b);
    }

    ConstructorExample(){
        System.out.println("Hey I am default constructor");
    }

    public static void main(String[] args) {
        ConstructorExample ce1 = new ConstructorExample(10,20);
        ConstructorExample ce2 = new ConstructorExample(20,20);
        ConstructorExample ce3 = new ConstructorExample(30,20);
        ConstructorExample ce4 = new ConstructorExample(40,20);
        ConstructorExample ce5 = new ConstructorExample();
        System.out.println(ce5.s);

    }
}
