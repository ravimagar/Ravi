package com.company.loops;

public class ContinueExample {
    public static void main(String[] args) {
        //for loop
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                //using continue statement
                continue;   //it will skip the rest statement
            }
            System.out.println(i);
        }
    }
}