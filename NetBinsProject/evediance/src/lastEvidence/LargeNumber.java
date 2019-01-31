
package lastEvidence;

import java.util.Scanner;


public class LargeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1,x2,x3;
        System.out.print("Enter Three nymber");
        x1 = input.nextInt();
        x2 = input.nextInt();
        x3 = input.nextInt();
        
        int max = 0;
        if (x1 > x2) {
            max = x1;
        } else if(x2 > x1) {
            max = x2;
        }
        if (x3 > max) {
            max = x3;
        }
        System.out.println("Max "+max);
    }
}
