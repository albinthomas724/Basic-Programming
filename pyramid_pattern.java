package com.ilpbatch4.utility;

public class pyramid_pattern {
    public static void printPyramid(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=((2 * i)/2);j++){
                System.out.print(((char)(64+j)));
                         }
            for(int j=1;j<=((2 * i)/2);j++){
                System.out.print(j);
                         }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid(4);
    }
}
