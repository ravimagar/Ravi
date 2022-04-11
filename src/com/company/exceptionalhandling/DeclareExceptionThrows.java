package com.company.exceptionalhandling;

import java.io.IOException;

public class DeclareExceptionThrows {
    void method()throws IOException, ArithmeticException{
        System.out.println("device operation performed");
    }
}
class TestThrows3{
    public static void main(String args[]) throws IOException, ArithmeticException {//declare exception
        DeclareExceptionThrows m=new DeclareExceptionThrows();
        m.method();
        System.out.println("normal flow...");
    }
}