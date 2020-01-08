package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here

       String Hello = "Hello";
        System.out.println(Hello);

        String myString = "Mela";
        System.out.println(myString);

        float x= 3;
        float y= 4;
        float sum = x+y;
        System.out.println("Rezultatul 3+4 este " + sum);

        float quotient = x/y;
        System.out.println("Rezultatul 3/4 este " + quotient);

        int a = -5;
        int b = 8;
        int c = 6;
        int d = b*c;
        int e = a+d;

        System.out.println("Rezultatul -5+8*6 este " + e);

        int f = 55;
        int g = 9;
        System.out.println("Rezultatul (55+9)%9 este " + (f+g) % g);

        float i = 20;
        float j = -3;
        float k = 5;
        System.out.println("Rezultatul 20+ -3*5/8 este " + (i+((j*k)/b)));

        int p = 15;
        int q = 3;
        int r = 2;
        int s = p/q;
        int t = s*r;
        float u = k+t-b;
        System.out.println("Rezultatul 5+15/3*2-8 %3 este " + u % q);

        System.out.println("Rezultatul 5+15/3*2-8 %3 este " + (k+(r*(p/q))-b) %q);







    }
}
