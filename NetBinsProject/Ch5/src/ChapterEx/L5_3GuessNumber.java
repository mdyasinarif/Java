
package ChapterEx;

import java.util.Scanner;


public class L5_3GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = (int)(Math.random()*101);
        System.out.println("Guess a Magic number between 0 to 100");
        
        int guess = -1;
        while (guess != number) {            
            System.out.print("Enter Your guess :");
            guess = input.nextInt();
            
            if(guess == number)
                System.out.println("Yes the Number is "+number);
            else if(guess > number)
                System.out.println("Your guess is too High");
            else 
                System.out.println("Your guess is too Low");
        }
        
    }
}
