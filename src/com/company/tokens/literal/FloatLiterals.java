package com.company.tokens.literal;

public class FloatLiterals {
    public static void main(String[] args) {
        // decimal-form literal
        double a = 101.230;
        // It also acts as decimal literal
        double b = 0123.222;
        // Hexa-decimal form (error)
//        float c = 0x123.222;

        System.out.println(a);
        System.out.println(b);
//        System.out.println(c);
    }
}