package com.company.stringbuffer;

public class StringBufferDelete {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Digital");
        sb.delete(1, 5);
        System.out.println(sb);//prints Hlo
    }
}
