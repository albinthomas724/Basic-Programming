package com.ilpbatch4.utility;

public class SumOfPower {

	public static void main(String[] args) {
		int input=4;
		int number1=0;
		int number2=1;
		cube_fibnocci( input,number1,number2);
		
			

	}

	private static void cube_fibnocci(int input,int number1, int number2) {
		int sum=0;
		int cube=0;
		for(int i=1;i<=input;i++)
		{ 	
			sum=number1+number2;
			number1=number2;
			number2=sum;
			
			cube=cube+(sum*sum*sum);
		}
		System.out.println("result="+cube);
		
	}

}
