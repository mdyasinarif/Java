
package ClassPatice;

import java.util.Scanner;


public class SeatinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int sum = 0;
        for (int i = 0; ; i++) {
            System.out.print("Enter number : ");
            int num = input.nextInt();
            if(num > 0)
                sum =+ num;
            else
                break;
        }
        System.out.println("Total : "+sum);
    }
}
