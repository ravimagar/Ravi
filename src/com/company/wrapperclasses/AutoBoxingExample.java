package com.company.wrapperclasses;

import java.util.ArrayList;

public class AutoBoxingExample {

    public static void main(String[] args) {
        char ch = 'a';
        // Autoboxing- primitive to Character object conversion
        Character a = ch;
        System.out.println(a);
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        // Autoboxing because ArrayList stores only objects
//        arrayList.add(25);
//       // printing the values from object
//        System.out.println(arrayList.get(0));
    }
}