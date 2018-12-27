
import java.util.Scanner;
import jdk.nashorn.internal.ir.Symbol;




public class FutureIvValue2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment Amount :");
        double invAmount = input.nextDouble();
        
         System.out.println("Enter interest Rate :");
         double interestRate = input.nextDouble();
         interestRate = interestRate/1200;
         
        System.out.println("Enter years :");
        double years = input.nextDouble();
        
        double futureInvestmentAmount = invAmount*Math.pow(1+interestRate,years*12);
        System.out.println("futureInvestmentAmount :"+futureInvestmentAmount);
                
    }
    
}
