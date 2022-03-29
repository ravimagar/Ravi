package com.company.abstraction;

public class Suzuki extends Bike{

    Suzuki(int a) {
        super(a);
    }

    @Override
    void run() {

    }

    public static void main(String[] args) {
        Suzuki s = new Suzuki(4000);
    }
}
