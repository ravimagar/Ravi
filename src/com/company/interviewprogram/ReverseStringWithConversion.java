package com.company.interviewprogram;

import java.util.ArrayList;

public class ReverseStringWithConversion {
    public static void main(String[] args) {
        String s = "Ganesh Arun Jadhav";
        String[] array = s.split(" ");
        ArrayList<String> list = new ArrayList<>();
        String[] array2;
        StringBuffer sb = new StringBuffer(s);
        for (int i = array.length - 1; i >= 0; i--) {
            if (Character.isUpperCase(s.charAt(i))) {
                sb.setCharAt(i, Character.toLowerCase(s.charAt(i)));
            } else {
                sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }
            System.out.print(sb.charAt(i));
        }
    }
}