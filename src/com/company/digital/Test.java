package com.company.digital;


import com.company.array.AccessArrayUsingForLoop;
import com.company.array.ArrayObjectExample;
import com.company.array.ArraysClassObjectExample;


public class Test {
    String s = "ganesh";
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        printArray(new int[]{10,22,44,66});//passing anonymous array to method
    }
    AccessArrayUsingForLoop a = new AccessArrayUsingForLoop();
    ArrayObjectExample ao = new ArrayObjectExample(10, "ganesh");
    ArraysClassObjectExample ae = new ArraysClassObjectExample();
    Test t = new Test();
}
