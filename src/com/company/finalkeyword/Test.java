package com.company.finalkeyword;

final class Test {

    final int a;
    final static int b;

    Test(){
        a = 20;
    }

    static {
        b = 30;
    }

    final void finalMethod(){
        System.out.println("Final method I am having");
    }

    public static void main(String[] args) {
        Test t = new Test();
    }
}
