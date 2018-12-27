/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.p61;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Interest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate 7.25% :");

        double annualInterestRate = input.nextDouble();
        double monthelyInterestRate = annualInterestRate / (12 * 100);

        System.out.print("Enter number of years as an integer : ");
        int numOfYears = input.nextInt();
        System.out.print("Enter loan amount : ");
        int loanAmount = input.nextInt();
        double monthelyPayment = loanAmount * monthelyInterestRate / (1 - 1 / Math.pow(1 + monthelyInterestRate, numOfYears * 12));
        double totalPayment = monthelyPayment * numOfYears * 12;
        System.out.println("The monthely Payment is $" + (int) (monthelyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + (int) (totalPayment * 100) / 100.0);
    }

}
