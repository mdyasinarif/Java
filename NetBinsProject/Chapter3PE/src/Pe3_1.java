
import java.util.Scanner;

public class Pe3_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a,b,c :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
     

    
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        System.out.println("discriminant: " + discriminant);
        if (discriminant > 0) {
            double r1 = -b + Math.pow(discriminant, 0.5) / 2 * a;
            double r2 = -b + Math.pow(discriminant, 0.5) / 2 * a;
            System.out.println("Two Root " + r1 + " and " + r2);

        } else if (discriminant == 0) {
            double r1 = -b + Math.pow(discriminant, 0.5) / 2 * a;

            System.out.println("One Root " + r1);

        } else {
            System.out.println("no real roots");

        }

       
    }

}
