package com.company.tokens.literal;

public class Test {
    public static void main(String[] args) {
        int b = 20, c= 20;
        String s1 = "Ganesh";
        String s2 = "Jadhav";
        String s3 = "Ganesh";
        String s4 = new String("Digital");
        String s5 = new String("Digital");
        System.out.println(b==c);
        System.out.println(s1.equals(s3));
        System.out.println(s4==s5);
        System.out.println(s1==s3);
        System.out.println(s4.equals(s5));
        System.out.println("He said \"Java is fun unlimited");
    }
}
