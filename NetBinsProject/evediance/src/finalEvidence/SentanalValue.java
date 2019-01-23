
package finalEvidence;

import java.util.Scanner;


public class SentanalValue {
    public static void main(String[] args) {
        sum();
}
    public static void sum(){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; ; i++) {
            System.out.print("Enter Number :");
            int n = input.nextInt();
            if(n>0){
                sum += n;
            }else{
                break;
            }
        }
        System.out.println("Sum :"+sum);
    }
    }
