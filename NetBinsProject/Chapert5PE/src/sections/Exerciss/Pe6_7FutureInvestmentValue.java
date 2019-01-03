
package sections.Exerciss;

import java.util.Scanner;


public class Pe6_7FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_YRARS = 30;
        
        System.out.print("The amout invested :");
        double amount = input.nextDouble();
        
        System.out.print("Annual Interest rate :");
        double annualInterestRate  = input.nextDouble();
        double monthlyInterestRate = annualInterestRate /1200;
             
        System.out.println("Years   Future Value");
        for (int years = 1; years <= NUMBER_OF_YRARS; years++) {
            System.out.printf("%-10d",years);
            System.out.printf("%11.2f\n",futureInvestmentValue(amount, monthlyInterestRate, years));
        }
    }
    public static double futureInvestmentValue(double amount, double monthlyInterestRate, double years){
    
        return amount*Math.pow(1+monthlyInterestRate,years*12);
    
    
    }
}
