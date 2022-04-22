package com.company.abstraction;

abstract class EveningBatch {

    int i;
    int a;
    int b;
    int c;

    EveningBatch(int i, int a, int b, int c){
        this.i=i;
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("Abstract class constrator " + i +" "+ a +" "+ b +" "+ c);
    }

    static void abstractClassStaticMethod(){
        System.out.println("Abstarct class static method");
    }

    void test(){
        System.out.println("I am concreate Method");
    }

    final void finalTestMethod(){
        System.out.println("I am final Method");
    }

    abstract void testAbstractMethod();

    public static void main(String[] args) {
        abstractClassStaticMethod();
    }
}
