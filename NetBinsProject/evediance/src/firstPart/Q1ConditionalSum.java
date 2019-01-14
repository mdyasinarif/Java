
package firstPart;

import java.util.Scanner;


public class Q1ConditionalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 0 to stop the sum");
        System.out.print("Enter Degites: ");
        
        double num = input.nextDouble();
        double sum = 0;
        
        
         while ( num != 0) {  
            
            num = input.nextDouble();
            sum += num;
  
        }
        
        System.out.print("Sum is : " + sum);
    }
}
