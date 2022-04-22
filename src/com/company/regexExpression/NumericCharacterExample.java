package com.company.regexExpression;

import java.util.regex.Pattern;

public class NumericCharacterExample {
    public static void main(String args[]) {
        System.out.println("by character classes and quantifiers ...");
        System.out.println(Pattern.matches("[6789][0-9]{9}", "88579535271"));//true
        System.out.println(Pattern.matches("[0-9]{9}", "995303894"));//true
//
//        System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)
//          System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7953038949"));//false (starts from 6)
//        System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true
//
//        System.out.println("by metacharacters ...");
//        System.out.println(Pattern.matches("[789]{1}\\d{9}", "853038949"));//true
//        System.out.println(Pattern.matches("[789]{1}\\d{9}", "333"));//false (starts from 3)

        System.out.println(Pattern.matches("[a-zA-Z0-0-9]{15}", "ganesh2"));

    }
}