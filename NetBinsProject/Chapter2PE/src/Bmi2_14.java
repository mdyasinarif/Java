
import java.util.Scanner;


public class Bmi2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double POUND_IN_KILOGRAN = 0.45359237;
        final double INCH_IN_METERS = 0.0254;
        
        System.out.print("Enter weight in pound :");
        double weight = input.nextFloat();
        weight *=POUND_IN_KILOGRAN;
        System.out.print("Enter hight in inches :");
        double hight = input.nextFloat();
        hight*=INCH_IN_METERS;
        double BIM = weight/ Math.pow(hight,2);
        System.out.println("BMI is :"+BIM);
    }
    
}
