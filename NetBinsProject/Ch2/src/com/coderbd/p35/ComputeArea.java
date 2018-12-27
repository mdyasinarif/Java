
package com.coderbd.p35;

public class ComputeArea {
    static double redius = 20;
    static double area;
    public static void main(String[] args) {
        System.out.println("area by Defualt :"+ area);
        area = redius * redius * 3.1416;
        System.out.println("Area :"+area);
    }
}
