package com.company.exceptionalhandling;

public class Test5 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(10/0);
            System.out.println(10/0);
            System.out.println(s.charAt(0));
        } finally {

        }
    }
}
