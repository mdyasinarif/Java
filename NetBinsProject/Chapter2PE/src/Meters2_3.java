
import java.util.Scanner;


public class Meters2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value for feet :");
        final double foot = 0.305;
        double value = input.nextDouble();
        double meter = value * foot;
        System.out.println(value+" feet is "+meter+"meters");
    }
    
}
