package com.company.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String args[]) {
        // Creating TreeSet and
        // adding elements
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("Digital");
        ts.add("Partner");
        ts.add("Digital");
        ts.add("very");
        ts.add("good");
        ts.add("Institute we have");

        // Traversing elements
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}