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
public class Pe6_5Sort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows :");
        int numberOfRows = input.nextInt();
        displaypattern(numberOfRows);
    }

    public static void displaypattern(int n) {
        int padding = n - 1;
        for (int r = 1; r <= n; r++) {
            for (int p = 0; p < padding; p++) {
                System.out.println("  ");
            }
            for (int i = r; i > 0; i--) {
                System.out.println(i + " ");
            }
            System.out.println();
            padding--;
        }

    }

}
