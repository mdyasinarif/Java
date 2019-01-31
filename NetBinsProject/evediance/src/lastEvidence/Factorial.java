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
public class Factorial {
    public static void main(String[] args) {
        factorial();
    }
    public static void factorial(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ente number : ");
        int n = input.nextInt();
        
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        System.out.println("Number "+n+ " Factorian is "+fact);
    }
}
