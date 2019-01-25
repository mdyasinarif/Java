package listing;

import java.util.Scanner;

public class ToweOfHanoi {

    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = input.nextInt();
        System.out.println("The moves are : ");
        moveDisks(n, 'A', 'B', 'C');
        System.out.println("Total Moves : " + count);
    }

    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            count++;
        } else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Mode disk " + n + " from " + fromTower + " to " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
            count++;
        }
    }
}
