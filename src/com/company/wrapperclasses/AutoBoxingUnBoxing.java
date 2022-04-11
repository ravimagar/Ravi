package com.company.wrapperclasses;

public class AutoBoxingUnBoxing {
    public static void main(String args[]) {
        byte a = 1;
        int b = 10;
        float c = 18.6f;
        double d = 250.5;
        char e = 'a';
        Byte byteObj = a;
        Integer intObj = b;
        Float floatObj = c;
        Double doubleObj = d;
        Character charObj = e;

        System.out.println("Values of Wrapper objects (printing as objects)");
        System.out.println("Byte object byteObj:  " + byteObj);
        System.out.println("Integer object intObj:  " + intObj);
        System.out.println("Float object floatObj:  " + floatObj);
        System.out.println("Double object doubleObj:  " + doubleObj);
        System.out.println("Character object charObj:  " + charObj);
        byte bv = byteObj;
        int iv = intObj;
        float fv = floatObj;
        double dv = doubleObj;
        char cv = charObj;

        System.out.println("Unwrapped values (printing as data types)");
        System.out.println("byte value, bv: " + bv);
        System.out.println("int value, iv: " + iv);
        System.out.println("float value, fv: " + fv);
        System.out.println("double value, dv: " + dv);
        System.out.println("char value, cv: " + cv);
    }
}