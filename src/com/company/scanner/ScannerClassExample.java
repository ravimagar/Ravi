package com.company.scanner;

import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String name = sc.nextLine();

        System.out.println("Enter the character");
        char gender = sc.next().charAt(0);

        System.out.println("Enter the Integer");
        int age = sc.nextInt();

        System.out.println("Enter the long value");
        long mobileNo = sc.nextLong();

        System.out.println("Enter the double value");
        double cgpa = sc.nextDouble();

        // Print the values to check if the input was correctly obtained.
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("CGPA: " + cgpa);
    }
}