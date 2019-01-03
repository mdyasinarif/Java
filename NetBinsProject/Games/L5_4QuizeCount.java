package ChapterEx;

import java.util.Scanner;

public class L5_4QuizeCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_Q = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";

        while (count < NUMBER_OF_Q) {
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);

            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.print("What is " + num1 + " - " + num2 + " ? :");
            int answer = input.nextInt();

            if (num1 - num2 == answer) {
                System.out.println("You are correct");
                correctCount++;
            } else 
                System.out.println("Your answer is wrong.\n" + num1 + " - " + num2 + " = " + (num1 - num2));
                count++;
                output += "\n" + num1 + " - " + num2 + " = " + (answer) + ((num1 - num2 == answer) ? " Correct" : " worng");
            
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + "Seconds\n" + output);
    }
}
