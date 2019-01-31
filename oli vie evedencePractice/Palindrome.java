package evedencePractice;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		checkPalindrome();
	}
	
	public static void checkPalindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string:");
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		
		if(s.equals(sb.reverse().toString())) {
			System.out.println("String is a Palindrome");
		}else {
			System.out.println("String is not a Palindrome");
		}
		
	}
}
