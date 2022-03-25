package com.company.finalkeyword;

public class LearnFinal {

    final int a = 10;
    final static int c;
    final int b = a;
//    public LearnFinal(int a) {
//        this.a = a;
//    }

    static {
            c = 20;
    }
//    void test(){
//        a = 30;
//        this.b = 20;
//    }

    public static void main(String[] args) {
        LearnFinal l = new LearnFinal();

    }
}
