package com.company.thiskeyword;

public class ProblemWithoutThis {
    int rollNumber;
    String name;
    float fee;

    ProblemWithoutThis(int rollNumber, String name, float fee) {
        rollNumber = rollNumber;
        name = name;
        fee = fee;
    }

    void display() {
        System.out.println(rollNumber + " " + name + " " + fee);
    }

    public static void main(String[] args) {
        ProblemWithoutThis s1 = new ProblemWithoutThis(111, "ankit", 5000f);
        ProblemWithoutThis s2 = new ProblemWithoutThis(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
}
