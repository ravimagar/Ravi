package com.company.loops;

public class NestedForExample {
    public static void main(String[] args) {
                //loop of i
        for (int i = 1; i <= 3; i++) {  //3 times
                //loop of j
            for (int j = 1; j <= 3; j++) { //9 time
                System.out.println(i + " " + j);
            }//end of i
        }//end of j
    }
}