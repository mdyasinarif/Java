package ClassPatice;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        isPrime();
    }

    public static void isPrime() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numbr : ");

        int n = sc.nextInt();
        int i;
        for ( i = 2; i < n; i++) {
            if (n % i == 0) {
                break;
            } 
           
        }
         if (i == n) {
                System.out.println(n+" is Prime");
            } else {
                 System.out.println(n+" is not Prime");
            }

    }
}
