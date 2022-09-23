package org.example;

import java.util.Scanner;

public class T3_ex7 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Whrite number: ");
        int i = a.nextInt();
        boolean b = (0 < i && i < 10);

        System.out.println(b);
    }
}
