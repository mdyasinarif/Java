
import java.util.Scanner;


public class Exercise_03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the exchange rate from USD to Tk :");
        double  rate = input.nextDouble();
        
        System.out.print("Enter  0 to convert $ to Tk and 1 tk to $ :");
        int option = input.nextInt();
        
        double amount;
        
        switch (option) {
            case 0:
                System.out.println("Enter the $ amount :");
                amount = input.nextDouble();
                System.out.println("$ "+amount+" is "+(amount*rate)+" Tk");
                break;
            case 1:
                System.out.println("Enter the TK amount :");
                amount = input.nextDouble();
                System.out.println(amount+" Tk is $ "+((int)((amount*100)/ rate)) / 100.00);
                break;
            default:
                System.out.println("Incorrect input");
        }
    }
}
