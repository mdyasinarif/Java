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
public class Pe6_6Pattarn {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers :");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        displaySortedNumbers(number1, number2, number3);
    }

    public static void displaySortedNumbers(int num1, int num2, int num3) {
        int temp;
        if (num2 < num1 && num2 < num3) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        } else if (num3 < num1 && num3 < num2) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        } else if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;

        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
