package firstPart;

import java.util.Scanner;

public class Q5CheckPrime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter positive number for check Prime :");
        int num = input.nextInt();
        
        int i,m=0,flag = 0;
        m = num/2;
        
        if (num == 0 || num == 1) {
            System.out.println(num +" is not prime");
        }else{
            for ( i = 2; i < m; i++) {
                if (num % i == 0) {
                    System.out.println(num+" is not prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num +" is prime");
            }
        
        }

    }

   
}
