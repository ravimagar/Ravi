package com.company.inheritance;

public class Programmer extends Employee {
    int bonus = 100000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is " + p.salary);
        System.out.println("Bonus of Programmer salary is " + p.bonus);
    }
}
