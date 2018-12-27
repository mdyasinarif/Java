
import java.util.Scanner;


public class Population2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year :");
        int year = input.nextInt();
        
        long population = (312032486+((365*24*60*60/7)-(365*24*60*60/13)+(365*24*60*60/45))*year);
        System.out.println("The Population is "+year+ " is "+population);
    }
    
}
