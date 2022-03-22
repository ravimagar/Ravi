package com.company.constructor;

public class PrivateConstructor {

        private PrivateConstructor() {
    }

    public void display() {
        System.out.println("Hello Private Constructor");
    }

    public static void main(String[] args) {
        PrivateConstructor pc1 = new PrivateConstructor();
        pc1.display();
    }
}

