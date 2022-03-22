package com.company.thiskeyword;

public class SolutionWithThis {
    int rollNumber;
    String name;
    float fee;

    SolutionWithThis(int rollNumber, String name, float fee) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollNumber + " " + name + " " + fee);
    }
}

class TestThis2 {
    public static void main(String args[]) {
        SolutionWithThis s1 = new SolutionWithThis(111, "ankit", 5000f);
        SolutionWithThis s2 = new SolutionWithThis(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
}