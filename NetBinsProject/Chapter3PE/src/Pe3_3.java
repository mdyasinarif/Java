
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Md Yasin Arif
 */
public class Pe3_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a,b,c,d,e,f :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
   
        
        
        
        if(a*d - b-c == 0){
            System.out.println("the equation is no solution");
        }else{
            double x = (e*d - b*f) / (a*d -b*c);
            double y = (a*f - e*c) / (a*d -b*c);
            System.out.println("x is "+x+ " and y is "+y);
        }

    }
}
