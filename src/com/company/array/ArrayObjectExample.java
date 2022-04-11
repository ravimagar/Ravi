package com.company.array;

public class ArrayObjectExample {
    public int roll_no;
    public String name;

    ArrayObjectExample(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public static void main(String[] args) {
        ArrayObjectExample[] arr;
        arr = new ArrayObjectExample[5];
        arr[0] = new ArrayObjectExample(1, "aman");
        arr[1] = new ArrayObjectExample(2, "vaibhav");
        arr[2] = new ArrayObjectExample(3, "shikar");
        arr[3] = new ArrayObjectExample(4, "dharmesh");
        arr[4] = new ArrayObjectExample(5, "mohit");

        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : " +
                    arr[i].roll_no + " " + arr[i].name);
    }
}