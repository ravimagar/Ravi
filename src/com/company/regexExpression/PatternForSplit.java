package com.company.regexExpression;

public class PatternForSplit {
    public static void main(String[] args) {
        {
            String str = "digitalPartner@for@digital";
            String[] arrOfStr = str.split("@", 2);

            for (String a : arrOfStr)
                System.out.println(a);
        }
    }
}