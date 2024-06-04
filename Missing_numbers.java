package com.ilpbatch4.utility;

public class Missing_numbers {

	public static void main(String[] args) {
		int[] array= {3,3,1,9,4,5,5,1,3};
		missing_numbers(array);

	}

	private static void missing_numbers(int[] array) {
		for(int j=0;j<9;j++)
		{
			int flag=0;
			for(int num:array) {

				if(num==j)
				{
					flag=0;
					break;
				}
				else {
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println(j);
			}
		
	}

}
}
