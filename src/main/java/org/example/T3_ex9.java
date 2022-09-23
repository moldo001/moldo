package org.example;

import java.util.Scanner;

public class T3_ex9 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Write first number  :");
        int i = a.nextInt();
        System.out.print("Write second number :");
        int b = a.nextInt();
        System.out.print("Write third number  :");
        int c = a.nextInt();
       // boolean k;
        if(i>0 && b<=0 && c<=0){
            boolean k = true;
        System.out.println(k);}
            else if(i<=0 && b>0 && c<=0){
            boolean k = true;
            System.out.println(k);}
         else if(i<=0 && b<=0 && c>0){
            boolean k = true;
            System.out.println(k);}
         else  {boolean k = false;
        System.out.println(k);
    }}
}
