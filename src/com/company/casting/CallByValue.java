package com.company.casting;

public class CallByValue {
    int data = 50;

    void change(int data) {
        data = data + 100;  //changes will be in the local variable only
        System.out.println(data);
    }

    public static void main(String args[]) {
        CallByValue cv = new CallByValue();
        System.out.println("before change " + cv.data);
        cv.change(500);
        System.out.println("after change " + cv.data);

    }
}