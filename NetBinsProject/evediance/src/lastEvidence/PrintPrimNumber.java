
package lastEvidence;

import java.util.Scanner;


public class PrintPrimNumber {
    public static void main(String[] args) {
        printPrimNumber();
    }
    public static void printPrimNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ");
        int num = input.nextInt();
        
        String print = "";
        for (int i = 0; i <= num; i++) {
            int count = 0;
            for (int j = i; j >=1; j--) {
                if (i % j == 0) {
                    count ++;
                }
            }
            if(count == 2){
                print += i + " ";
            }
        }
        System.out.println(print);
    }
}
