package com.ilpbatch4.utility;

public class Z_pattern {

	public static void main(String[] args) {
		int input=4;
		z_pattern(input);

	}

	private static void z_pattern(int input) {
		for(int i=0;i<input;i++)
		{ 
			for(int j=0;j<input;j++)
			{
				if (i==0 || i==input-1||j==input-1-i){
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
			System.out.println();
			}
		}
}

