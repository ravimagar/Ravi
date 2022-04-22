package com.company.encapsulation;

public class Test {
    private int a = 10;
    private String s = "ganesh";
    private int c;
    private String studentName;

    public int getIntegerValue(){
        return a;
    }

    public String getStringMethod(){
        return s;
    }

    public void setName(String name){
        this.studentName = name;
        System.out.println(studentName);
    }

}