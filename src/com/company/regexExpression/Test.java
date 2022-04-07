package com.company.regexExpression;

public class Test {
    public static void main(String[] args) {
        String s2 = "**WE&L$COME$#WEL@$COME**";
        String[] arrofs2 = s2.split("$", 2);
        for (String c : arrofs2)
            System.out.println(c);
    }
}