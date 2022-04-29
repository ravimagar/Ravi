package com.company.interviewprogram;

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int no = sc.nextInt();
        for (int i = 2; i <= no; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
