
import java.util.Scanner;

public class Exercise_03_17RockPaperSessior {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 0-Seissor, 1-Rock, 2-Paper :");
        int user = input.nextInt();

        int computer = (int) (Math.random() * 3);
        System.out.print("The computer is ");

        switch (computer) {
            case 0:
                System.out.print(" Seissor");
                break;
            case 1:
                System.out.print(" Rock");
                break;
            case 2:
                System.out.print(" Paper");
                break;
        }
        System.out.println("");
        System.out.print("You are ");
        switch (user) {
            case 0:
                System.out.print(" Seissor");
                break;
            case 1:
                System.out.print(" Rock");
                break;
            case 2:
                System.out.print(" Paper");
                break;
        }
        if (computer == user) {
            System.out.println(" . too, Draw");
        } else {
            boolean win = (user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1);
            if (win) {
                System.out.println(" . You won");
            } else {
                System.out.println(" . You Loss");
            }

        }
    }
}
