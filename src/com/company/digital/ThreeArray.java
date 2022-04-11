package com.company.digital;

public class ThreeArray {

    public static void main(String args[]) {
        int[][][] arr = {
                {
                        {34, 67, 43},
                        {576, 697, 423},
                        {576, 587, 90}
                },
                {
                        {39, 47, 33},
                        {376, 987, 453},
                        {57, 69, 42}
                },
        };

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 2; k++) {
                    System.out.println(arr[i][j][k]);
                }
            }
        }
    }

}