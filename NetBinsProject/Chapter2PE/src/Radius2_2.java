


import java.util.Scanner;


public class Radius2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Redius and length : ");
        double redius = input.nextDouble();
        double length = input.nextDouble();
        final double PI = 3.1416; 
        double aria = redius*redius*PI;
        System.out.println("Enter the aria : "+aria);
        double volume = aria * length;
        System.out.println("The volume : "+volume);
                
    }
    
}
