package ProgramingExerciss;

import java.util.Scanner;

public class E4_9Unicode {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an UNICODE code: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println((int) ch);

    }
}
