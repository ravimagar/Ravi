package com.company.abstraction;

class EveningClassMainTest extends EveningBatch{
    EveningClassMainTest(int i, int a, int b, int c){
        super(i, a, b, c);
        System.out.println("Hello");
    }

    void testAbstractMethod() {

    }

    public static void main(String[] args) {
        EveningClassMainTest e1 = new EveningClassMainTest(12, 20, 30, 40);
        EveningClassMainTest e2 = new EveningClassMainTest(13, 21, 34, 43);
        EveningClassMainTest e3 = new EveningClassMainTest(13, 24, 35, 45);
        EveningClassMainTest e4 = new EveningClassMainTest(12, 20, 32, 46);



    }
}
