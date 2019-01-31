package evedencePractice;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(findFact());
	}

	public static int findFact() {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(n>0) {
			for (int i = 1; i <= n; i++) {
				fact *= i;
			}
		}else {
			System.out.println("NUmber should be greater 0");
		}
		return fact;
	}
}
