package com.company.collection;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Test {
    public static void main(String args[]) throws IOException {
        FileReader file = new FileReader("C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Desktop\\publish_events\\MorningBatch.properties");
        Properties p = new Properties();
        p.load(file);

        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("Institute"));
        file.close();
    }
}
