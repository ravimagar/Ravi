package com.company.collection;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesClassExample {
    public static void main(String[] args) throws Exception {

        // create a reader object on the properties file
        FileReader reader = new FileReader("C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Desktop\\publish_events\\test.properties");

        // create properties object
        Properties p = new Properties();

        // Add a wrapper around reader object
        p.load(reader);

        // access properties data
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
    }
}
