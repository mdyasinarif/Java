package ProgramingExerciss;

import java.util.Scanner;

public class E4_15PhoneKeyPad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        
        ch = Character.toUpperCase(ch);
        
        int number = 0;
        if (Character.isLetter(ch)) {
            if(ch >='W')
                number = 9;
            if(ch >='T')
                number = 8;
            else if(ch >='P')
                number = 7;
            else if(ch >='M')
                number = 6;
            else if(ch >='J')
                number = 5;
            else if(ch >='G')
                number = 4;
            else if(ch >='D')
                number = 3;
            else if(ch >='A')
                number = 2;
            System.out.println("The Number is "+number);
        } else {
            System.out.println("Invalid Character");
        }

    }
}
