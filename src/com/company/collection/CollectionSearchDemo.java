package com.company.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionSearchDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("z");
        al.add("a");
        al.add("y");
        al.add("k");
        al.add("g");
        al.add("t");
        System.out.println("Before Sorting " + al);
        Collections.sort(al);
        System.out.println("After Sorting " + al);
    }
}
