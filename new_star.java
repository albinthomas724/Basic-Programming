package com.ilpbatch4.utility;

import java.util.Scanner;

public class new_star {
    public static void main(String[] args) {
        int input=5;
        
        
        
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input - i; j++) {
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++) {
            System.out.print(i);
            if(m<i) {
            System.out.print("*");}}
            System.out.println();
            
      }       
      
    }
}
