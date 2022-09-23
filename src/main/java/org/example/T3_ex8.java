package org.example;

import java.util.Scanner;

public class T3_ex8 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Write first number  :");
        int i = a.nextInt();
        System.out.print("Write second number :");
        int b = a.nextInt();
        System.out.print("Write third number  :");
        int c = a.nextInt();
        boolean k = (i != b && i != c && b != c);
        System.out.println(k);
    }
}
