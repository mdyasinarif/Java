package evedencePractice;

import java.util.stream.IntStream;

public class TwoDArraySum {
	public static void main(String[] args) {
		int[][] arr = {{25, 22, 24}, {24, 15, 16}};
		int sum=0;
		for(int a[]:arr) {
			sum += IntStream.of(a).sum();
		}
		System.out.println(sum);
	}
}
