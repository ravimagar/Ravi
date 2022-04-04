package com.company.stringexamples;

public class CompareToExample {
    String s1 = "hello";
    String s2 = "hello";
    String s3 = "meklo";
    String s4 = "hemlo";
    String s5 = "flag";

    public static void main(String args[]) {
        CompareToExample ce = new CompareToExample();
        System.out.println(ce.s1.compareTo(ce.s2));//0 because both are equal
        System.out.println(ce.s3.compareTo(ce.s1));//-5 because "h" is 5 times lower than "m"
        System.out.println(ce.s1.compareTo(ce.s4));//-1 because "l" is 1 times lower than "m"
        System.out.println(ce.s1.compareTo(ce.s5));//2 because "h" is 2 times greater than "f"
    }
}