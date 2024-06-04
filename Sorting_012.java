package com.ilpbatch4.utility;

public class Sorting_012 {

	public static void main(String[] args) {
		int array[]= {0,1,2,0,0,1,1,2};
		sort_012(array);

	}

	private static void sort_012(int[] arr) {
		 int n = arr.length; 
	        for (int i = 0; i < n - 1; i++) { 
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) { 
	                    int temp = arr[j]; 
	                    arr[j] = arr[j + 1]; 
	                    arr[j + 1] = temp; 
	                } 
		
	}
	}
	        for (int i = 0; i < n; ++i) { 
	            System.out.print(arr[i] + " ");}
	        
	        System.out.println(); 
	}

}
