package com.company.tokens.literal;

public class TestAfterNoonBatch {

    public static void main(String[] args) {
        String s1 = new String("Ganesh");
        String s2 = new String("Ganesh");

        System.out.println(s1==s2);       //comparing the address of the Object
        System.out.println(s1.equals(s2));  //comparing the string data
        TestAfterNoonBatch af = new TestAfterNoonBatch();
    }
}
