package com.company.wrapperclasses;

public class FloatToIntegerConversion {
    public static void main(String[] args) {
        Float floatWrap = Float.valueOf(45.158f);
        int floatToInt = floatWrap.intValue();
        System.out.println(floatToInt);
        Integer five = Integer.valueOf("101", 2); //If you want to convert binary number to the integer
        System.out.println(five);
    }
}