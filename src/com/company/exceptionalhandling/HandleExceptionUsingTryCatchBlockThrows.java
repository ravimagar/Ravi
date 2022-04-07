package com.company.exceptionalhandling;

import java.io.IOException;

public class HandleExceptionUsingTryCatchBlockThrows {
    void method() throws IOException {
        throw new IOException("device error");
    }
}

class TestThrows2 {
    public static void main(String args[]) {
        try {
            HandleExceptionUsingTryCatchBlockThrows m = new HandleExceptionUsingTryCatchBlockThrows();
            m.method();
        } catch (Exception e) {
            System.out.println("exception handled");
        }

        System.out.println("normal flow...");
    }
}