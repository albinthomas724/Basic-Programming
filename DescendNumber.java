package com.ilpbatch4.utility;
import java.util.*;

public class DescendNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int input1=in.nextInt();
		int input2=in.nextInt();
		int input3=in.nextInt();
		descend1(input1,input2,input3);
	}


	public static void descend1(int input1, int input2, int input3) {
	    int temp;
	    if (input1 < input2) {
	        temp = input2;
	        input2 = input1;
	        input1 = temp;
	    }
	    if (input2 < input3) {
	        temp = input3;
	        input3 = input2;
	        input2 = temp;
	        if (input1 < input2) {
	            temp = input2;
	            input2 = input1;
	            input1 = temp;
	        }
	    }
	    System.out.println(input1 + " " + input2 + " " + input3);
	}
}



