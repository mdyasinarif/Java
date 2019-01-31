package evedencePractice;

import java.util.Arrays;

public class MinMaxFromArray {
	public static void main(String[] args) {
		findMinMax();
	}
	
	public static void findMinMax() {
		int[] arr = {10,2,14,15,14,18};
		Arrays.sort(arr);
		System.out.println("Minimum Number is:"+arr[0]);
		System.out.println("Minimum Number is:"+arr[arr.length-1]);

	}
}
