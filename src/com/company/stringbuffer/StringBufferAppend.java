package com.company.stringbuffer;

public class StringBufferAppend {
    public static void main(String args[]) {
//        String s = "Hii";
//        s = s + " HelloTest";
//        String t = "Hii";
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");//now original string is changed
        System.out.println(sb);//prints Hello Java
//        System.out.println(s);
//        System.out.println(s==t);
    }
}