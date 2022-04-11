package com.company.digital;

public class ThreeArrayExa {
    public static void main(String args[]) {
        int[][][] marks; //declaration of array
        marks = new int[2][2][2];//initiation of array


//initiate elements
        marks[0][0][0] = 25;
        marks[0][0][1] = 15;
        marks[0][1][0] = 20;
        marks[0][1][1] = 05;
        marks[1][0][0] = 10;
        marks[1][0][1] = 13;
        marks[1][1][0] = 12;
        marks[1][1][1] = 30;
//Display elements from array using for loop
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                for (int k = 0; k <= 1; k++) {
                    System.out.println(marks[i][j][k]);
                }

            }
        }
    }
}