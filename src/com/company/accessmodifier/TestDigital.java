package com.company.accessmodifier;


 public class TestDigital {

     public int a = 10;
     public void test(){
        System.out.println("helllooo");
    }

    public static void main(String[] args) {
        System.out.println("hiiiiii");
        TestDigital t5 = new TestDigital();
        System.out.println(t5.a);
        t5.test();
    }
}
