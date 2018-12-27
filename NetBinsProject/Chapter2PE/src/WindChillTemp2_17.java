
import java.util.Scanner;


public class WindChillTemp2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter tha value ta :");
        double ta = input.nextDouble();
        System.out.print("Enter tha value  v :");
        double v = input.nextDouble();
        double twc = 35.75+0.06215*ta-35.75*Math.pow(v, 0.16)+0.4275*Math.pow(ta, 0.16);
        System.out.println("The wind chill index is :"+twc);
    }
    
}
