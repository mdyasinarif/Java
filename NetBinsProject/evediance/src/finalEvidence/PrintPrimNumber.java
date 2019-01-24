
package finalEvidence;

import java.util.Scanner;


public class PrintPrimNumber {
    public static void main(String[] args) {
        printPrime();
        }
    public static void printPrime(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = input.nextInt();
        int n = 0;
        int i = 0;
        String primeNumber = "";
        for ( i = 1; i <= num; i++) {
            int count = 0;
            for (n = i; n >= 1;n--) {
                if (i % n == 0) {
                    count ++;
                }
            }
            if (count == 2) {
                primeNumber += i + " ";
            }
        }
        
        System.out.println(primeNumber);
    }
    }

