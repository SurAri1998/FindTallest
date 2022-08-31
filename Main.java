package com.codingninja;
import java.util.Scanner;
public class Main {

    public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
        String p, q;
        int a, b;
        System.out.println("Enter first student's name");
        p = s.nextLine();
        System.out.println("Enter second student's name");
        q = s.nextLine();
        System.out.println("Enter " + p + "'s  height in cm: ");
        a = s.nextInt();
        System.out.println("Enter " + q + "'s height in cm");
        b = s.nextInt();
        if (a>b)
        {
            System.out.println("" + p + " is taller than " + q + "");
        }
        else if (a<b)
        {
            System.out.println("" + q + " is taller than " + p + "");
        }
        else{
            System.out.println("Both are of same height");
        }
    }

}
