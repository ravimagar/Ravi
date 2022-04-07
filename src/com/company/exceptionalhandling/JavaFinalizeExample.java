package com.company.exceptionalhandling;

public class JavaFinalizeExample {
    public static void main(String[] args) {
        JavaFinalizeExample obj = new JavaFinalizeExample();
        System.out.println(obj.hashCode());
        obj = null;
        // calling garbage collector
        System.gc();
        System.out.println("end of garbage collection");

    }
    @Override
    protected void finalize() {
        System.out.println("finalize method called");
    }
}