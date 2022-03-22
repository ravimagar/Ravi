package com.company.thiskeyword;

public class ThisMethod {
    ThisMethod(){
        System.out.println("default constructor");
    }

    ThisMethod(int x){
        this();
        System.out.println("Parameterized Constructor " + x);
    }

    void test(String test){
        System.out.println("method " + test);
    }

    public static void main(String[] args) {
        ThisMethod tm = new ThisMethod(10);
        tm.test("Ganesh");
        tm.test("Digital");
        tm.test("Partner");
        tm.test("Checking");
    }
}
