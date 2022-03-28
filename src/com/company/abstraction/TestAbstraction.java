package com.company.abstraction;

public class TestAbstraction {
    public static void main(String args[]) {
//        Bike obj = new Hero();
        Shape s = new Circle();//In a real scenario, object is provided through method, e.g., getShape() method
        Shape r = new Rectangle();
//        obj.run();
//        obj.changeGear();
        s.draw();
        r.draw();
    }
}
