package com.company.stringmanupulation;

public class StringManupulation {



    public static void main(String[] args) {

        String s1 = "DigitalPartner";  //String Constant pool
        String s2 = "DigitalPartner"; //String Constant pool
        s2 = "Gihshs";

        String s3 = new String("Welcome");  // Heap Memory
        String s4 = new String("Welcome"); // Heap Memory

        StringManupulation sm = new StringManupulation();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
