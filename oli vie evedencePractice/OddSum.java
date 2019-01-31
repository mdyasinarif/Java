package evedencePractice;

import java.util.Scanner;

public class OddSum {
	public static void main(String[] args) {
		System.out.println(oddSum());
	}

	public static int oddSum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter firsr num:");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		return sum;
	}
}
