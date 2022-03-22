package com.company.digital;

public class LanguageFundamentals {
    int x;          //instance variable
    String s;
    static int y ;
    static String a;

    public void check() {
        int x = 50; //Local Variable
        String s ="ganesh";
        x =60;
        System.out.println("Access static variable in instance method ");
        System.out.println("Local Variable " + x);
    }

    public static void statMethodCheck() {
        System.out.println("Static Method Calling");
    }

    static {
        int x = 20;
        System.out.println("Static Block Calling");
    }

    public static void main(String[] args) {
        LanguageFundamentals t = new LanguageFundamentals();
        t.check();
//        statMethodCheck();
//        System.out.println("Instance Variable " + t.x);
//        ;System.out.println("Instance Variable " + t.s);
//        System.out.println("Static Variable " + t.y);
//        System.out.println("Static Variable " + LanguageFundamentals.y);
//        System.out.println("Static Variable " + y);
//    }
    }
}
