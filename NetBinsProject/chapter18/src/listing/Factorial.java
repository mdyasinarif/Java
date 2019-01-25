
package listing;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter positive Number : ");
        int n = input.nextInt();
        System.out.println("The Factorial of "+n+" is "+factorial(n));
    }
    public static long factorial(int n ){
        if (n == 0) {
            return 1;
        } else {
            return n * factorial( n -1 );
        }
    }
}
