
import java.util.Scanner;


public class SumTheDigits2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number between 0 to 1000 :");
        int number = input.nextInt();
        
        int lessThenTen = number % 10;
        number /=10;
        
        int ten = number % 10;
        number /=10;
        
        int hundread = number % 10;
        number /=10;
        
        System.out.println("The sum of digits : "+(hundread+ten+lessThenTen));
    }
    
}
