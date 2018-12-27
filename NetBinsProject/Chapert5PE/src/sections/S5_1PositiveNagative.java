
package sections;

import java.util.Scanner;


public class S5_1PositiveNagative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int possitive = 0;
        int nagative = 0 ;
        int count = 0;
        double total = 0;
        System.out.println("Enter the integer Number and end if it is 0: ");
        int number = input.nextInt();
        
        if(number == 0){
            System.out.println("Invalid");
            System.exit(1);
        }
        while (number != 0) {            
            if(number>0)
                possitive++;
            else
                nagative++;
            total+=number;
            count++;
            number = input.nextInt();
        }
        double average = total / count;
        System.out.println("The number of possitive is :"+possitive);
        System.out.println("The number of nagative is :"+nagative);
        System.out.println("Total is :"+total);
        System.out.println("The average is :"+average);
    }
}
