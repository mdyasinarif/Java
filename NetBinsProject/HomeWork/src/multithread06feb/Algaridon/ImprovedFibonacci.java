
package multithread06feb.Algaridon;

import java.util.Scanner;


public class ImprovedFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Index the Fibonacci Number : ");
        int index = sc.nextInt();
        System.out.println("Fibonacci number at in"+index+" is "+fib(index));
    }
    public static long fib(long n){
        long f0 = 0;
        long f1 = 1;
        long f2 = 1;
        if (n == 0) 
            return f0;
         else if(n == 1)
            return f1;
        else if(n == 2)
            return f2;
        
        for (int i = 3; i <= n; i++) {
            f0 = f1;
            f1 = f2;
            f2 = f0+f1;
        }
        return f2;
    }
}
