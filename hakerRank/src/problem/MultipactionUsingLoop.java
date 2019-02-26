/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.util.Scanner;

/**
 *
 * @author Md Yasin Arif
 */
public class MultipactionUsingLoop {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= 10; i++) {
            
            System.out.printf("%d X %d = %d%n",N,i,N*i);
        }
       // anouther way
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(N+" x "+i+" = "+N*i);
//        }
        scanner.close();
    }
    
}
