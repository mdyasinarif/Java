/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sections.Exerciss;

import java.util.Scanner;

/**
 *
 * @author Md Yasin Arif
 */
public class Pe6_4Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter int Number :");
        int number = input.nextInt();
        
        System.out.println("Reverse number is :"+reverse(number));
    }
   public static int  reverse(int number ){
       String reverse = "";
       String n = number + "";
       
       for (int i = n.length()-1; i>= 0 ; i--) {
           reverse += n.charAt(i);
       }
       return Integer.parseInt(reverse);
   }
}
