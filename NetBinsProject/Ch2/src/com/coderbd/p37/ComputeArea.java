
package com.coderbd.p37;

import java.util.Scanner;


public class ComputeArea {
    public static void main(String[] args) {
        Scanner ca = new Scanner(System.in);
        System.out.println("Enter a number Redius :");
        double redius = ca.nextDouble();
        double area = redius * redius * 3.1416;
        System.out.println("The area of circle of redius :"+area);
    }
    
}
