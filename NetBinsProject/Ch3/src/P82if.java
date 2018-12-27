
import java.util.Scanner;


public class P82if {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number :");
         double score = input.nextDouble();
         
         if (score>=90.00) {
             System.out.println("A");
        } else {
             if (score>=80.00) {
                 System.out.println("B");
             } else {
                 if (score>=70.00) {
                     System.out.println("C");
                 } else {
                     if (score>=60.00) {
                         System.out.println("D");
                     } else {
                         System.out.println("F");
                     }
                 }
             }
        }
    }
    
}
