package com.company.constructor;

public class ParameterizedConstructor {
    int a;
    String name;

    //creating a parameterized constructor
    ParameterizedConstructor(int i, String n){
        a = i;
        name = n;
    }
    void display(){
        System.out.println("Parametrized Constructor values " + a + " " + name);
    }

    public static void main(String[] args) {
        ParameterizedConstructor pc1 = new ParameterizedConstructor(333, "Ganesh");
        ParameterizedConstructor pc2 = new ParameterizedConstructor(444, "Partner");
        pc1.display();
        pc2.display();
    }
}
