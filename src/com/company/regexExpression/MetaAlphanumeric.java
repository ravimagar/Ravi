package com.company.regexExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaAlphanumeric {
    public static void main(String args[]) {
        String REGEX = "[a-z&&[^bc]]";
        String INPUT = "dbcabcabc";
//        System.out.println(Pattern.matches("[a-z&&bc]{2}", "bc"));//true
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)

        Pattern  pattern = Pattern.compile(REGEX);

        // get a matcher object
        Matcher matcher = pattern.matcher(INPUT);

        while(matcher.find()) {
            System.out.println("Match String start(): "+matcher.start());
        }
    }
}