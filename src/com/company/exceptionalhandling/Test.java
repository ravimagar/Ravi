package com.company.exceptionalhandling;


public class Test {

    void throwKeywordMethod(int age) throws Exception {
        if(age>18){
            System.out.println("this student is adult");
        }
        else {
            throw new Exception("This student is not adult");
        }
    }

    void callingMethod(int a) throws Exception {
        throwKeywordMethod(a);
    }

    public static void main(String[] args) throws Exception {

        Test t = new Test();
        try {
            t.callingMethod(11);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
