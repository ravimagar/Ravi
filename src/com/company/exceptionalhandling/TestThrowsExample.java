package com.company.exceptionalhandling;

import java.io.IOException;

public class TestThrowsExample {


    void m() throws IOException {
        throw new IOException("device error");//checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]) {
        TestThrowsExample obj = new TestThrowsExample();
        obj.p();
        System.out.println("normal flow...");
    }
}