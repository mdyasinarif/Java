
package classTest;

import java.util.Scanner;


public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = input.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        
    }
}
