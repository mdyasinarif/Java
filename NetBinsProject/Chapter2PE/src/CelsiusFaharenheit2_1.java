
import java.util.Scanner;


public class CelsiusFaharenheit2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Degree of Celsius : ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0/5) * celsius +32;
        System.out.println("Result : "+fahrenheit);
        
    }
    
}
