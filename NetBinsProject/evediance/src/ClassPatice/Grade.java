package ClassPatice;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Marks:");
        int num = input.nextInt();

        if (num > 100) {
            System.out.println("Invalid Number");
        } else if (num >= 80) {
            System.out.println("A+");
        } else if (num >= 70) {
            System.out.println("B+");
        } else if (num >= 60) {
            System.out.println("C+");
        } else if (num >= 50) {
            System.out.println("D+");
        } else if (num >= 40) {
            System.out.println("F");
        }
    }
}
