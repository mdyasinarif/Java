
import java.util.Scanner;

public class P98Lotery {

    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 100);
        int saving = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Your Number :");

            int guess = input.nextInt();

            int lotteryDigity1 = lottery / 10;
            int lotteryDigity2 = lottery % 10;

            int guessDigity1 = guess / 10;
            int guessDigity2 = guess % 10;

            System.out.println("The Lottery Number :" + lottery);

            int firstPrice = 10000;
            int secondPrice = 3000;
            int thirdPrice = 1000;
            int panisment = 500;

            if (guess == lottery) {
                System.out.println("Exact match : You will Win :" + firstPrice);
            } else if (guessDigity2 == lotteryDigity1 && guessDigity1 == lotteryDigity2) {
                System.out.println("Exact match : You will Win :" + secondPrice);

            } else if (guessDigity1 == lotteryDigity1 || guessDigity1 == lotteryDigity2 || guessDigity2 == lotteryDigity1 || guessDigity2 == lotteryDigity2) {
                System.out.println("Match one digit: You win :" + thirdPrice);
                saving += thirdPrice;
            } else {
                System.out.println("Sorry ,You have panished:");

            }
            if (saving == firstPrice) {
                saving += firstPrice;
            } else if (saving == secondPrice) {
                saving += secondPrice;
            } else {
                saving -= panisment;
            }
            System.out.println("Your Accumulated Amount is :" + saving);
        }
    }
}
