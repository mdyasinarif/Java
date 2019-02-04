/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idbexam;

import lastEvidence.*;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PrimNumber {

    public static void main(String[] args) {
        isPrime();
    }

    public static void isPrime() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = input.nextInt();
        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                break;
            }
        }
            if (i == num) {
                System.out.println(num + " Is Prime");

            } else {
                System.out.println(num + "  Is Not Prime");
            }
        }
    }

