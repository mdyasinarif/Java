package ProgramingExerciss;

import java.util.Scanner;

public class E4_16RandomCharacter {

    public static void main(String[] args) {
        int number = 65+(int)(Math.random()*(91-65));
        System.out.println("the Randome character is "+(char)number);
    }
}
