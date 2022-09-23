package org.example;

import java.io.IOException;
import java.util.Scanner;

public class T3_ex3 {
    public static void main(String[] args) throws IOException {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();

        int k;
        int suma=0;
        while (n > 0) {
            k = (n % 10);
            suma = suma + k;
            n = (n / 10);
        }
                System.out.println(suma);
            }
        }
