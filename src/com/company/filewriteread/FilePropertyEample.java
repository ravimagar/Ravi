package com.company.filewriteread;

import java.io.File;

public class FilePropertyEample {
    public static void main(String[] args)
    {

        // accept file name or directory name through
        // command line args
//        String fname ="C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Desktop\\publish_events\\test.properties";

        // pass the filename or directory name to File
        // object
        File f = new File("C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Desktop\\publish_events", "hello.text");

        // apply File class methods on File object
        System.out.println("File name :" + f.getName());
        System.out.println("Path: " + f.getPath());
        System.out.println("Absolute path:"
                + f.getAbsolutePath());
        System.out.println("Parent:" + f.getParent());
        System.out.println("Exists :" + f.exists());

        if (f.exists()) {
            System.out.println("Is writable:"
                    + f.canWrite());
            System.out.println("Is readable" + f.canRead());
            System.out.println("Is a directory:"
                    + f.isDirectory());
            System.out.println("File Size in bytes "
                    + f.length());
        }
    }
}