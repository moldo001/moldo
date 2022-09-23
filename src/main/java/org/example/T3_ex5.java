package org.example;

import java.util.Scanner;

public class T3_ex5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("introduceti distanta in km");
        double D = a.nextDouble();
        System.out.println("introduceti timpul in ore");
        double T = a.nextDouble();
        double V =(D/T);
        System.out.println(V);
    }
}