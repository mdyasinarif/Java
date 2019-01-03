
import java.util.Scanner;

public class P89ComputeAndInterpeBIM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter you weight :");
        double weight = input.nextDouble();

        System.out.print("Enter you hieght :");
        double hieght = input.nextDouble();

        final double KILOGRANS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInKilogran = weight * KILOGRANS_PER_POUND;
        double hieghtInMETERS = hieght * METERS_PER_INCH;
        double bmi = weightInKilogran / Math.pow(hieghtInMETERS, 2);
        
        System.out.println("BIM is "+bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");   
        } 
        else if (bmi < 25) {
            System.out.println("Normal");   
        } 
        else if (bmi < 30) {
            System.out.println("Overweight");   
        }
        else {
            System.out.println("Obese");
        }
    }
}
