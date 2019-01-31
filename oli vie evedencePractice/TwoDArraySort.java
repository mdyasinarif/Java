package evedencePractice;

import java.util.Arrays;

public class TwoDArraySort {
	public static void main(String[] args) {
		int[][] arr = {{25, 22, 24}, {24, 15, 16}};
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+1+"th Second array");
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			
		}

	}
}
