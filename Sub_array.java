package com.ilpbatch4.utility;

public class Sub_array {

	public static void main(String[] args) {
		int A[]= {4,2,6,5,8,1};
		int number=19;
		find_subarray(A,number);
		int sum=0;
		

	}

	private static void find_subarray(int[] a,int number) {
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				sum=sum+a[j];
				if(sum==number)
				{
					System.out.println("i="+i+" j="+j);
				}
				else if(sum>number)
				{
					break;
				}
			}
		}
		if(sum==0) {
			System.out.println("Not found");
		}
		
	}

}
