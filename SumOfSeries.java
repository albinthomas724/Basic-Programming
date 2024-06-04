package com.ilpbatch4.utility;

public class SumOfSeries {

	public static void main(String[] args) {
		int sum=1;
		int n=9;
		int flag=0;
		for(int i=3;i<=n;i=i+2)
		{ 	
			if(flag==0)
			{
				sum=sum-i;
				flag=1;
			}
			else if(flag==1)
			{
				sum=sum+i;
				flag=0;
			}
			
			
		}
		System.out.println(sum);
			

	}

}
