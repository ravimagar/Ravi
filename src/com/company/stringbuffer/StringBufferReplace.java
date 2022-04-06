package com.company.stringbuffer;

public class StringBufferReplace {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(3, 5, "Java");
        System.out.println(sb);//prints HJavalo
    }
}