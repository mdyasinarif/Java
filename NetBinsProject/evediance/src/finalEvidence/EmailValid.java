/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalEvidence;

import java.util.Scanner;

/**
 *
 * @author Md Yasin Arif
 */
public class EmailValid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Email : ");
        String email = input.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.indexOf(".");
        
        if (atpos > 0 && dotpos < email.length()-1 && atpos < dotpos -1 ) {
            System.out.println("Enail is Valid");
        } else {
            System.out.println("Enail is Invalid");
        }
    }
}
