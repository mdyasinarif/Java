
import java.util.Scanner;


public class CostOfDriving2_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the driving Destence:");
        double distence = input.nextDouble();
        
        System.out.println("Enter the miles per gallon:");
        double miles = input.nextDouble();
        
        
        
        System.out.println("Enter price per gallon:");
        double pricePerGallon  = input.nextDouble();
        
        double costOfDriving = (distence/miles)*pricePerGallon;
        System.out.println("The cost of Driving"+costOfDriving);
    }
}
