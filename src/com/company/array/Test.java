package com.company.array;

public class Test {
    public static void main(String[] args) {
        int[][] x = new int[][]{{1, 2, 3}, {3, 4, 5}, {5,6,7}};
        for (int i = 0; i <=2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(x[i][j] + " " );
            }
            System.out.println();
        }
    }
}
