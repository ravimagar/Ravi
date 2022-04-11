package com.company.casting;

public class CallByReference {
    int data = 50;

    void change(CallByReference cr) {
        cr.data = cr.data + 100;//changes will be in the instance variable
    }

    public static void main(String args[]) {
        CallByReference cr = new CallByReference();
        System.out.println("before change " + cr.data);
        cr.change(cr);//passing object
        System.out.println("after change " + cr.data);

    }
}