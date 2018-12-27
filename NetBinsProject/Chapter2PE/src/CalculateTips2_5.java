
import java.util.Scanner;


public class CalculateTips2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Subtotal and gratuity rate :");
        double Subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = Subtotal*gratuityRate/100;
        double total = gratuity+Subtotal;
        System.out.println("The gratuity is $"+gratuity+" and total is $"+total);
    }
}
