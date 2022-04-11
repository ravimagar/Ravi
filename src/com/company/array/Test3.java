package com.company.array;

public class Test3 {
    int i =10;

//    Test3() {
//        System.out.println("Hello I am constructor");
//    }
    public void digital() {
        System.out.println(i);
        System.out.println("Method");
    }

    public static void partner(){
//        System.out.println(i);
    }

    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        Test3 t1 = new Test3();
        Test3 t2 = new Test3();
        Test3 t3 = new Test3();
        Test3 t4 = new Test3();
        Test3 t5 = new Test3();
        t1.digital();
//        System.out.println(t1.i);
    }
}
