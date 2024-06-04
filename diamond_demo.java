package com.ilpbatch4.utility;
 
public class diamond_demo {
 
	public static void main(String[] args) {
		int input = 5;
		displayPattern(input);
	}
 
	private static void displayPattern(int input) {
		int columns = 1;
		int start = 0;
		int middle =(input+1)/2;
		int space = input/2;
		for(int i = 1; i<=input; i++)
		{
			for(int j = 1;j<=space;j++)
			{
				System.out.print(" ");
			}
			if(i<middle)
			{
				start = i;
				space = space - 1;
			}
			else
			{
				start = input + 1 - i;
				space = space + 1;
			}
			for(int j = 1;j<=columns;j++)
			{
				int mid = (columns+1)/2;
				System.out.print(start);
				if( j < mid)
				{
					start--;
				}
				else
				{
					start++;
				}
			}
			if(i<middle)
			{
				columns += 2;
			}
			else
			{
				columns -= 2;
			}
			System.out.println("");
		}
	}
 
}