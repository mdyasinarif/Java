/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        String ans = "";
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if ((N % 2 == 1) ||((N % 2 == 0) &&(N>=6 && N<=20)) ) {
            ans ="Weird";
        } else {
                ans = "Not Weird";   
        }
            System.out.println(ans);
        }
}