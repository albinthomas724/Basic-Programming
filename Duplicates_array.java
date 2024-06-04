package com.ilpbatch4.utility;
import java.util.*;

public class Duplicates_array {

	public static void main(String[] args) {
		int[] array= {3,3,1,9,4,5,5,1,3};
		duplicate_numbers(array);

	}

	private static void duplicate_numbers(int[] array) {
		Set<Integer> result=new HashSet<>();
		for(int i=0;i<array.length;i++)
		{
			int flag=0;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j] && !result.contains(array[j]))
				{
					result.add(array[j]);
					System.out.println(array[j]);
					break;
				}

										
			}
			
		
	}

}
}
