
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class L12_4QuotientWithException {
    public static  int quotient(int number1, int number2){
        if (number2 == 0) {
            throw new ArithmeticException("to do");
            
        }
        return number1 / number2;  
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        
        try {
            int result = quotient(number1, number2);
            System.out.println(number1+" / "+number2 + " is "+result);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("Execution continues ...");
    }
}
