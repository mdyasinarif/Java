
package multithread06feb.Algaridon;

import java.util.Scanner;


public class Gcd {
    public static int gcd(int m, int n){
    int gcd = 1;
        if (m % n == 0) {
            return n;
        }
        for (int k = n / 2; k >=1; k--) {
            if (m % k == 0 && n % k == 0) {
                break;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer : ");
        int m = sc.nextInt();
        System.out.print("Enter first integer : ");
        int n = sc.nextInt();
        System.out.println("The greatest common divisor for "+m+" and "+n+" is "+gcd(m,n));
    }
    
}
