package evedencePractice;

import java.util.Scanner;

public class SentinelValue {
	public static void main(String[] args) {
		sentinelSum();
	}
	
	public static void sentinelSum() {
		Scanner sc = new Scanner(System.in);
		double value = 0;
		double sum = 0;
		
		while(value!=-1){
			sum+=value;
			System.out.print("Enter number:");
			value = sc.nextInt();
			
		} 
		System.out.println(sum);
	}
}
