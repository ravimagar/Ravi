package com.company.stringbuffer;

public class StringBufferInsert {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(0, "Java");//now original string is changed
        System.out.println(sb);//prints HJavaello
    }
}