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
public class Ps6_17Matrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = input.nextInt();
        printMatrix(n);
    }

    public static void printMatrix(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                System.out.print((int) (Math.random() * 2));
            }
            System.out.println();
        }

    }
}
