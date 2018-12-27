
import java.util.Scanner;
import javax.swing.text.html.HTML;


public class Monetaryunites2_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount :");
        
        int amount = input.nextInt();
        int remainingAmount  = amount;
        
        int noOfOneDoller = remainingAmount/100;
        remainingAmount %=100;
        
        int noOfQuater = remainingAmount/25;
        remainingAmount %=25;
        
        int noOfDimes = remainingAmount/10;
        remainingAmount %=10;
        
        int noOfNickels = remainingAmount/5;
        remainingAmount %=5;
        
        int noOfPennies = remainingAmount;
        
        System.out.println("Your amount "+amount/100.0+" consists of");
        System.out.println(" "+noOfOneDoller+" Dollers");
        System.out.println(" "+noOfQuater+" Quaters");
        System.out.println(" "+noOfDimes+" Dimes");
        System.out.println(" "+noOfNickels+" Nickels");
        System.out.println(" "+noOfPennies+" Pennies");
        
    }
            
            
            
            
    
}
