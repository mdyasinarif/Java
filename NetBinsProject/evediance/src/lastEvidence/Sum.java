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
public class Sum {
    public static void main(String[] args) {
        sum();
    }
    public static void sum(){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum : "+sum);
    }
}
