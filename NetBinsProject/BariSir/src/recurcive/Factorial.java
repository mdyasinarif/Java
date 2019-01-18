
package recurcive;

import java.util.Scanner;


public class Factorial {
    public static  int factorial(int n){
        
        if(n == 0){
            return 1;// when 1 then  stop recurcisve call 
        }
        return n * factorial(n-1);// method bordy part a inhoya loop ar moto call korba
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = input.nextInt();
        System.out.println("Factorial "+num+" is "+factorial(num));
    }
}

