package evedencePractice;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		isPrime();
	}
	
	public static void isPrime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		boolean flag = true;
		
		int number = sc.nextInt();
		if(number ==0 ) {
			System.out.println("Number should be greater than 0");
			return;
		}
		if(number==1) {
			System.out.println("Number is prime");
			return;
		}else {
			for(int i=2;i<number/2;i++) {
				if(number%i==0) {
					flag = false;
					break;
				}
			}
		}
		
		if(flag) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not prime");
		}
		
	}
}
