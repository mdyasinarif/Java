
package com.coderbd.p43;

import java.util.Scanner;

public class ComputeAreaWithConstrant {
    public static void main(String[] args) {
        Scanner ca = new Scanner(System.in);
        System.out.print("Enter Redius : ");
        final double pi = 3.1416;
        double redius = ca.nextDouble();
        double area = redius * redius * pi ;
        System.out.print("Result : "+area);
        
    }
}
