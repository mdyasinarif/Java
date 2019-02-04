package lastEvidence;

import java.util.Scanner;

public class PassFail {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your number : ");
        int mark = input.nextInt();

        if (mark < 100) {
            if (mark >= 80) {
                System.out.println("You Got A+");
            }else if (mark >=70){
                System.out.println("You Got A");
            }else if (mark >=60){
                System.out.println("You Got A-");
            }else if (mark >=50){
                System.out.println("You Got B");
            }else if (mark >=40){
                System.out.println("You Got C");
            }else if (mark >=33){
                System.out.println("You Got D");
            }else if (mark <33){
                System.out.println("You Got F");
            }
        } else {
            System.out.println("Invalid Number");
        }
    }
}