package lastEvidence;

import java.util.Scanner;

public class PassFail {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your number : ");
        int mark = input.nextInt();

        if (mark > 40) {
            if (mark > 40 && mark <= 50) {
                System.out.println("D");
            } else if (mark > 50 && mark <=60) {
                System.out.println("C");
            } else if (mark > 60 && mark <=70) {
                System.out.println("B");
            } else if (mark > 70 && mark <=79) {
                System.out.println("A-");
            } else if (mark >= 80) {
                System.out.println("A");
            } 
        }else {
                System.out.println("Your are fail");
            }
    }
}