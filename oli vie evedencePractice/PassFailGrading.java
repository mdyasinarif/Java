package evedencePractice;

import java.util.Scanner;

public class PassFailGrading {
	public static void main(String[] args) {
		grading();
	}
	
	public static void grading() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number:");
		int mark = sc.nextInt();
		if(mark>40) {
			if(mark>40 && mark<=50) {
				System.out.println("You got D!!");
			}else if(mark>50 && mark<=60) {
				System.out.println("You got C!!");
			}else if(mark>60 && mark<=70) {
				System.out.println("You got B!!");
			}else if(mark>70 && mark<=79) {
				System.out.println("You got A!!");
			}else if(mark>=80) {
				System.out.println("You got A+!!");
			}
		}else {
			System.out.println("You have failed!!");
		}
	}
}
