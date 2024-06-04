package com.ilpbatch4.utility;

public class SumOfFactorial {

	public static void main(String[] args) {
		int input = 4;
		factorialseries(input);

	}

	private static void factorialseries(int input) {
		float sum = 0;
		for (int i = 1; i <= input; i++) {

			float factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial = factorial * j;
			}
			sum = (i / factorial) + sum;

		}
		System.out.println("result=" + sum);

	}

}
