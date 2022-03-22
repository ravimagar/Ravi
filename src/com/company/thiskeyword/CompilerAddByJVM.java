package com.company.thiskeyword;

public class CompilerAddByJVM {
    void m() {
        System.out.println("M method calling");
    }

    void n(){
        m();
    }

    public static void main(String[] args) {
        CompilerAddByJVM cm = new CompilerAddByJVM();
        cm.n();
    }
}
