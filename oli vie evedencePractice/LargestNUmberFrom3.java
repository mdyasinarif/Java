package evedencePractice;

import java.util.Scanner;

public class LargestNUmberFrom3 {
	public static void main(String[] args) {
		System.out.println(largestNum());
	}
	
	public static int largestNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter firsr num:");
		int num1 = sc.nextInt();
		System.out.print("Enter Second num:");
		int num2 = sc.nextInt();
		System.out.print("Enter Third num:");
		int num3 = sc.nextInt();
		
		int max = num1;
		
		if(num1<num2) {
			max =  num2;
		}else if(max<num3){
			max = num3;
		}
		return max;
	}
}
