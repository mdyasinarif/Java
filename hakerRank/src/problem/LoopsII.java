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
public class LoopsII {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
//            for (int j = 1; j <= n; j++) {
//               a += (int)(Math.pow(b, j));
//               System.out.print(a+" ");    
//            }
            int res = a + (int) Math.pow(2, 0) * b;
            System.out.print(res + " ");
            for (int j = 1; j < n; j++) {
                res +=  (int) Math.pow(2, j) * b;
                System.out.print(res + " ");
            }
             System.out.println();
        }
       
        in.close();
    }

}
