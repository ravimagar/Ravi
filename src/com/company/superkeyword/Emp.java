package com.company.superkeyword;

public class Emp extends Person {
    double salary;

    Emp(int id, String name, double salary) {
        super(id, name);//reusing parent constructor
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        Emp em = new Emp(1, "Uday", 75000.15);
        em.display();
    }
}