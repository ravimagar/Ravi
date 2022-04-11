package com.company.casting;

public class Upcasting {
    public static void main(String[] args) {
        Parent p = new Child();
        p.name = "DigitalPartner";
        System.out.println(p.name);
        p.method();

        Child c = (Child)p;
        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();
    }
}
