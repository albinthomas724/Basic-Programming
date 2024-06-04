package com.ilpbatch4.utility;
import java.util.*;

public class Ascending_number {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[4];
        array[0] = in.nextInt();
        array[1] = in.nextInt();
        array[2] = in.nextInt();
        array[3] = in.nextInt();

        ascending(array);

    }

    private static void ascending(int[] arr) {

        int n = arr.length;
        for (int i=0;i<n-1;i++)
            for (int j=0;j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }


        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
