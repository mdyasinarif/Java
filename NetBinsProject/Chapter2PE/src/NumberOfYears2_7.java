
import java.util.Scanner;


public class NumberOfYears2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Minutes :");
        int minutes = input.nextInt();
        
        int years = minutes / (60*24*365);
        int days = (minutes % (60*24*365))/(60*24);
        
        
        
        System.out.println(years+" years "+days+" days");
        
    }
}
