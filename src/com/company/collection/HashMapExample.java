package com.company.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapExample {
    public static void main(String args[]) {
        // Creating HashMap and
        // adding elements
        HashSet<String> h = new HashSet<>();
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Digital Institute");
        hm.put(2, "For");
        hm.put(3, "Automation");
        hm.put(1, "Digital Institute");

        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));

        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
