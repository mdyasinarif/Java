/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sections.Exerciss;

import java.util.Scanner;

/**
 *
 * @author Md Yasin Arif
 */
public class Pe6_18password {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password : ");
        String password = input.nextLine();

        System.out.println((isValidPassword(password) ? "Valid" : "Invalid") + "password");
    }

    public static boolean isValidPassword(String password) {
        final int LENGTH_OF_PASS = 8;
        final int MIM_NIM_OF_DIGIT = 2;

        boolean validPassword = isLengthValid(password, LENGTH_OF_PASS)
                && isOnlyLetterAndDigit(password)
                && hasNDigits(password, MIM_NIM_OF_DIGIT);
        return validPassword;

    }

    public static boolean isLengthValid(String password, int validLength) {
        return password.length() >= validLength;
    }

    public static boolean isOnlyLetterAndDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }

        }
        return true;
    }

    public static boolean hasNDigits(String password, int n) {
        int numOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numOfDigits++;
            }
            if (numOfDigits >= n) {
                return true;
            }
        }
        return false;
    }

}
