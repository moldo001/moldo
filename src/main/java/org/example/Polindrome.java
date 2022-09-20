package org.example;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        System.out.println(isPolindrom(b));

    }

    private static boolean isPolindrom(String b) {
 StringBuffer c =new StringBuffer(b).reverse();
         boolean answer = true;
         for(int count=0;count<b.length();count++)
         if(b.charAt(count) != c.charAt(count))
             answer =false;

        return answer;
    }



}
