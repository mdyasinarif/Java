package evedencePractice;

import java.util.Scanner;

public class SumFrom1to10 {
	
	public static void main(String[] args) {
		System.out.println(sumFrom1to10());
	}
	
	
	public static int sumFrom1to10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter firsr num:");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum +=i;
		}
		return sum;
	}
}
