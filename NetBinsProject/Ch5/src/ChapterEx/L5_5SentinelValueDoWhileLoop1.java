package ChapterEx;

import java.util.Scanner;

public class L5_5SentinelValueDoWhileLoop1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("For Stop the number please enter 0 ");
        
        int data ;
        int sum = 0;
        
        do{
            System.out.print("Enter Number :");
            data = input.nextInt();
            sum += data;
        } while (data != 0);
        System.out.println("The Sum is :" + sum);
    }
}
