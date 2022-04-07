package com.company.regexExpression;

public class PatternForSplit {
    public static void main(String[] args) {
        {
            String str = "digital#partner#for#digital";
            String[] arrOfStr = str.split("#", 3);

            for (String a : arrOfStr)
                System.out.println(a);
        }
    }
}