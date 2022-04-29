package com.company.exceptionalhandling;


public class Test {

    void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("student is not adult");
        } else {
            System.out.println("student is adult");
        }
    }

    void check(int age) throws Exception {
        validateAge(age);
    }


    public static void main(String[] args) throws Exception {

        Test t = new Test();
        try {
            t.check(17);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
