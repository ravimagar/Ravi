package com.company.accessmodifier;

public class ExampleOfPrivate {
    int data = 40;
    void msg(){
        System.out.println("Hello private method is calling");
    }

    public static void main(String[] args) {
        ExampleOfPrivate ep = new ExampleOfPrivate();
        System.out.println(ep.data);
        ep.msg();
    }
}
