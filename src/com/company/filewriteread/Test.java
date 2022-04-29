package com.company.filewriteread;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Desktop\\publish_events\\gj.txt");
        int re;
        while ((re = fr.read())!=-1)
        {
            System.out.print((char)re);
        }
        fr.close();
    }
}
