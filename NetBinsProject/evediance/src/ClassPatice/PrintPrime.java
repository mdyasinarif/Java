package ClassPatice;

import java.util.Scanner;

public class PrintPrime {

    public static void main(String[] args) {
        printPrime();
    }

    public static void printPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        
       int n = sc.nextInt();
       String p = "";
       
        for (int i = 0; i <= n; i++) {
            int count = 0;
            for (int j = i; j >=1; j--) {
                if (i % j == 0) {
                    count ++;
                }    
            }
            if (count == 2) {
                p += i+ " ";
            }
        }
        System.out.println(p);
}
}