package com.company.collection;

import java.util.LinkedList;

public class LinkListExample {
    public static void main(String[] args)
    {

        // Declaring the LinkedList
        LinkedList ll = new LinkedList();
//        LinkedList<Integer> ll = new LinkedList<Integer>();

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++) {
            ll.add(i);
        }
        // Printing elements
        System.out.println(ll);

        // Remove element at index 3
        ll.remove(3);
        ll.addFirst(132);
        ll.addLast(122);

        // Displaying the List
        // after deletion
        System.out.println(ll);

        // Printing elements one by one
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
    }
}