
package finalEvidence;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        factorial();
    }
    public static void factorial(){
    Scanner input = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = input.nextInt();
        int fact = 1;
        
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        System.out.println("Number  "+n + " Factorial is "+fact);
    }
}
