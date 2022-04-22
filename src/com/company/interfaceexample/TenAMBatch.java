package com.company.interfaceexample;

public class TenAMBatch implements Test, Test12{

    @Override
    public void interfaceAbstractMethod() {
        System.out.println("Common implementation of the both interface");
    }

    @Override
    public void defaultMethodInInterface() {
        Test.super.defaultMethodInInterface();
    }

    public static void main(String[] args) {
        TenAMBatch t = new TenAMBatch();
        t.interfaceAbstractMethod();
        t.defaultMethodInInterface();
        Test.staticMethodExample();
    }
}
