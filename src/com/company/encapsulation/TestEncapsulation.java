package com.company.encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {

        //creating instance of Account class
//        Account acc = new Account();
//        //setting values through setter methods
//        acc.setAcc_no(7560504000L);
//        acc.setName("Sonoo Jaiswal");
//        acc.setEmail("sonoojaiswal@javatpoint.com");
//        acc.setAmount(500000f);
//        //getting values through getter methods
//        System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
//
        Test t = new Test();
       int b = t.getIntegerValue();
       String name = t.getStringMethod();
        System.out.println(b);
        System.out.println(name);

        t.setName("jadhav");
    }
}