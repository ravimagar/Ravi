package com.company.casting;

public class Parent2 extends Parent{

    Parent2(int a, int b){
        super(a, b);
        System.out.println("hiiii");
    }

    void test1234(){
        System.out.println(super.id);
        super.test();
    }
    public static void main(String[] args) {

        Parent2 p6 = new Parent2(10,20);
    }
}
