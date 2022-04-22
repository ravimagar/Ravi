package com.company.array;


import com.company.accessmodifier.TestDigital;

public class Test {
    public static void main(String[] args) {
//        int [] x = new int [5];
//        x[0] = 1;
//        x[1] = 'a';
//        Byte b = 20;
//        x[2] = b;
//        Short s = 30;
//        x[3] = s;
//        x[4] = 10.5f;
//        x[5] = 10l;

//        int a = 10, b= 20, c = 30, d = 50, e = 60, f = 70;
//        int[] x;
//        int []y;
//        int z[];
        int[] g = new int[3];
        g[0] = 1;
        g[1] = 2;
        g[2] =3;
//        g[3] = 4;
        for (int i =0; i<=g.length-1; i++){
            System.out.println(g[i]);
        }
//        for (int i : g){
//            System.out.println(i);
//        }

//        int[] arrray = new int[]{10, 20, 30, 40, 4, 5, 6, 9, 6, 9};
//        System.out.println(arrray.length);
        TestDigital td = new TestDigital();
        td.test();
        System.out.println(td.a);
    }
}