package org.example;

import java.util.Scanner;

public class T3_ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti Inaltimea");
        int H = s.nextInt();
        System.out.println("Introduceti ridicarea ziua");
        int zi = s.nextInt();
        System.out.println("Introduceti coborirea noaptea");
        int nte = s.nextInt();
        int K = 0;
        int D;
        while (H > nte) {
            D = zi - nte;
            H = H - D;
            K++;

        }
        System.out.println("Melcul sa ridicat in " + K + " zile");
    }
}


