package com.company.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String args[]) {
        // Creating LinkedHashSet and
        // adding elements
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("Digital");
        lhs.add("Partner");
        lhs.add("Digital");
        lhs.add("very");
        lhs.add("good");
        lhs.add("Institute we have");

        // Traversing elements
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}