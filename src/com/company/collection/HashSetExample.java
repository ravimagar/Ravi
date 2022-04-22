package com.company.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String args[]) {
        // Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();
        hs.add("Digital");
        hs.add("Partner");
        hs.add("Digital");
        hs.add("very");
        hs.add("good");
        hs.add("Institute we have");
        hs.add(null);
        hs.add(null);
        System.out.println(hs.add("Digital"));

        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}