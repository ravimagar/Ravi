package com.company.interviewprogram;

public class StringReverse {
    public static void main(String[] args) {
        String s = "DigitalPartner";
        char ch = 0;
        String reve = "";
        for (int i = s.length()-1; i >= 0; i--) {
            ch = s.charAt(i);
            reve = reve + ch;
        }
        System.out.println("Reverse String " + reve);
    }
}
