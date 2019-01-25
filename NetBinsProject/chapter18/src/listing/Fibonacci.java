
package listing;

import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an index for a fibonacci :");
        int index = input.nextInt();
        System.out.println("The fibonacci number at "+index+" is "+fibonacci(index));
    }
    public static long fibonacci(int index){
        if (index == 0) {
            return 0;
        } else if(index == 1){
            return 1;
        }else{
            return fibonacci(index -1) + fibonacci(index -2);
        }
    
    }
}
