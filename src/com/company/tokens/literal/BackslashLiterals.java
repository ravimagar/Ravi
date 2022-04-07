package com.company.tokens.literal;

public class BackslashLiterals {
    public static void main(String args[]) {
        //it inserts a Tab Space
        String str = "Ganesh\tJadhav";
        System.out.println(str);
        //it inserts a New Line
        String str1 = "the best way\nto communicate \nan idea \nis to act it out";
        System.out.println(str1);
        //it insert a backslash
        String str2 = "And\\Or";
        System.out.println(str2);
        //it insert a Carriage
//        \r (carriage return) is what it sounds like if you're familiar with old-fashioned manual typewriters:
//        It moves the "carriage" (the roll the paper is fed through) back to the beginning of the line.
//        On a terminal (or similar),
//        it moves the output point back to the beginning of the line, without moving down a line (usually).
        String str3 = "Carriage\rReturn";
        System.out.println(str3);
        //it prints a single quote
        String str4 = "Wall Street\'s";
        System.out.println(str4);
        //it prints double quote
        //String str5 = "New\'Twilight'Line";
        String str5 = "'GaneshJadhav'";
        System.out.println(str5);
    }
}