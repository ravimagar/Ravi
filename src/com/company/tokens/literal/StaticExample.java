package com.company.tokens.literal;

public class StaticExample {
//    int b =10;
//    public static int a;
//    public final int TEST_VARIABLE = 10;

    static int test(){
        int b = 10;
        int d = 10;
        return  b+d;
    }

     static public void main(String []args  ) {
        StaticExample se = new StaticExample();
//        System.out.println(se.b);
         int e = test();
         System.out.println(e);
    }
}
