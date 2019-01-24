
package finalEvidence;

import java.util.Scanner;


public class PrimNumber {
    public static void main(String[] args) {
        isPrime();
        }
    public static void isPrime(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = input.nextInt();
        
        int i ;
        for ( i = 2; i < num; i++) {
            if (num % i == 0) 
                break;
            }
        if (i == num) {
            System.out.println(num+" is prime");
        } else {
            System.out.println(num+" is not prime");
        }
    }
    }

