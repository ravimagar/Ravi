package com.company.importpakages;

//import com.company.digital.*;
//import com.company.digital.LanguageFundamentals;
import com.company.digital.MainTest;
import com.company.digital.studysubpackage.SubClassExample;

public class ImportPackageExample {
    public static void main(String[] args) {
        com.company.digital.LanguageFundamentals h = new com.company.digital.LanguageFundamentals();
        com.company.inheritance.LanguageFundamentals h1 = new com.company.inheritance.LanguageFundamentals();
        MainTest m = new MainTest();
        SubClassExample se = new SubClassExample();
        m.testCheck();
        h.check();

    }
}
