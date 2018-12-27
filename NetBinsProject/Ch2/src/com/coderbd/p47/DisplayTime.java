
package com.coderbd.p47;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter tha value :");
        int seconds = input.nextInt();
       
        int minutes = seconds/60;
        int hours = minutes%60;
         int reminderSEconds = seconds % 60;
        
        System.out.println(seconds+" second is "+hours+" hours "+minutes+" minutes and "+reminderSEconds+"Seconds");
    }
}
