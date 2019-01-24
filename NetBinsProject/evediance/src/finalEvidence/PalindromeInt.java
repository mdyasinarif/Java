
package finalEvidence;

import java.util.Scanner;


public class PalindromeInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three digit integer: ");
        int n = input.nextInt();
        int digit1 = (int)(n /100);
        int remaining = n % 100;
        int digit3 = (int)(remaining % 10);
        
        System.out.println(n+((digit1 == digit3)? " is a palindome":" is not a palindome"));
    }
}
