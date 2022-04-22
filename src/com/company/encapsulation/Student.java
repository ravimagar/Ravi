package com.company.encapsulation;

public class Student {
    //private data member
    private String name = "test" ;

    //getter method for name
    public String getName() {
        return name;
    }

    //setter method for name
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
    }
}
