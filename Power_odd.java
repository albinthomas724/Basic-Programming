package com.ilpbatch4.utility;
import java.lang.Math;

public class Power_odd {

	public static void main(String[] args) {
		
		int n=6;
		power(n);		
	}

	private static void power(int n) {
		double sum=1;
		int flag=0;
		int j=1;
		for(int i=3;i<=n;i=i+2)
		{ 	j=j+1;
			if(flag==0)
			{
				sum=sum-Math.pow(i, j);
				flag=1;
			}
			else if(flag==1)
			{
				sum=sum+Math.pow(i, j);
				flag=0;
			}
		}
		System.out.println(sum);
		
	}

}
