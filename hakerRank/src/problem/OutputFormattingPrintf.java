/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class OutputFormattingPrintf {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1,x);
               
                //Complete this line
            }
            System.out.println("================================");

    }
}
