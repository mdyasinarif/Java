/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastEvidence;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EmailValid {

    public static void main(String[] args) {
        validEmail();
    }

    public static void validEmail() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter email : ");
        String email = input.nextLine();

        int atpos = email.indexOf("@");
        int dotpos = email.indexOf(".");
        if (atpos > 0 && dotpos < email.length() - 1 && atpos < dotpos - 1) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is Invalid");
        }
    }
}
