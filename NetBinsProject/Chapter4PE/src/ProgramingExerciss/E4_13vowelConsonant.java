package ProgramingExerciss;

import java.util.Scanner;

public class E4_13vowelConsonant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        if (Character.isLetter(ch)) {
            switch (Character.toUpperCase(ch)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Is vowel");

                    break;
                default:
                    System.out.println("Is Consonant");
            }
        } else {
            System.out.println("Invalid");
        }

    }
}
