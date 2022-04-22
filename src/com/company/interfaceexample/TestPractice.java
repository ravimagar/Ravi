package com.company.interfaceexample;

public class TestPractice implements Printable, Showable{

    @Override
    public void show() {

    }

    @Override
    public void print() {

    }

    @Override
    public void addAbstract() {
    }

    public static void main(String[] args) {
        TestPractice t = new TestPractice();
        t.addAbstract();

    }

}
