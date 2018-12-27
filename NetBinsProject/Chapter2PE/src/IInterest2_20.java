
import java.util.Scanner;


public class IInterest2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter tha amount or interet Rate :");
        double amount = input.nextDouble();
        double annualInterestRate = input.nextDouble();
        
        double interest = amount*(annualInterestRate/12*100);
        System.out.println("The interest is :"+interest);
    }
    
}
