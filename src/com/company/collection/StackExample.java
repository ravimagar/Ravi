package com.company.collection;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    public static void main(String args[]) {
        Stack<String> stack = new Stack<String>();
        stack.push("Ganesh");
        stack.push("Jadhav");
        stack.push("For");
        stack.push("null");
        stack.push("Digital");
        stack.push("Ganesh");
        stack.push("Partner");
        stack.push("null");

        // Iterator for the stack
        Iterator<String> itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        stack.pop();

        // Iterator for the stack
        itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
