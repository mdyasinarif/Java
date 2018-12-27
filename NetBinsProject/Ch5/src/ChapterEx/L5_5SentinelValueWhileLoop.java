package ChapterEx;

import java.util.Scanner;

public class L5_5SentinelValueWhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("For Stop the number please enter 0 ");
        System.out.print("Enter Number :");
        int data = input.nextInt();

        int sum = 0;
        while (data != 0) {
            sum += data;
            System.out.print("Enter Number :");
            data = input.nextInt();
        }
        System.out.println("The Sum is :" + sum);
    }
}
