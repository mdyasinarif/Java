
package section;

import java.util.Scanner;


public class L7_2DeckOfCards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[]dack = new int[52];
        // index            0       1           2       3
        String[]suits = {"Spades","Hearts","Diamonds","Clubs"};
        // index           0    1   2   3   4   5   6   7   9   10    11     12      13
        String[]ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        
        // initilize the cared
        for (int i = 0; i < dack.length; i++) {
            dack[i] = i;
        }
        // shuffle the card
        for (int i = 0; i < dack.length; i++) {
            int index = (int)(Math.random()*dack.length);
            int temp = dack[i];
            dack[i] = dack[index];
            dack[index] = temp;
        }
        //Display the cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[dack[i] / 13];
            String rank = ranks[dack[i] % 13];
            System.out.println("Card Number "+dack[i]+" : "+rank+" of "+suit);
        }
    }
}
