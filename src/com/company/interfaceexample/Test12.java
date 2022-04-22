package com.company.interfaceexample;

public interface Test12{
    void interfaceAbstractMethod();

    default void defaultMethodInInterface(){
        System.out.println("Default Method of Test12 Interface");
    }
}
