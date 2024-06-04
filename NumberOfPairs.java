package com.ilpbatch4.utility;

import java.util.HashSet;
import java.util.Set;

public class NumberOfPairs {

	public static void main(String[] args) {
		int array[]= {10,5,3,11,4,6,1,14};
		int number=15;
		numberOfPairs(array,number);

	}

	private static void numberOfPairs(int[] array, int number) {
		Set<Integer> result=new HashSet<>();
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++) {
				if(array[i]+array[j]==number && !result.contains(array[j])) {
					result.add(array[j]);
					System.out.println(array[i]+" "+array[j]);}
			}
		}
		
	}

}
