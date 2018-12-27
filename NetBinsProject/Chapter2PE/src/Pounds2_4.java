
import java.util.Scanner;


public class Pounds2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value for pound :");
        final double pound = 0.454;
        double value = input.nextDouble();
        double kg = value * pound;
        System.out.println(value+" pound is "+kg+"kg");
    }
    
}
