package com.company.stringbuilder;

public class StringBuilderReplaceExample {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.replace(1, 5, "Java");
        System.out.println(sb);//prints HJavalo
    }
}