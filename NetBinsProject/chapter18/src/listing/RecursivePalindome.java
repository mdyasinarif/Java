package listing;

import java.util.Scanner;

public class RecursivePalindome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter for test :");
        String s = input.nextLine();
        print(s);
    }

    public static boolean isPalindome(String s) {
        if (s.length() <= 1) {
            return true;
        } else if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        } else {
            return isPalindome(s.substring(1, s.length() - 1));
        }

    }
    public static void print(String s){
        if (isPalindome(s)) {
            System.out.println(s+" is Palindome");
        } else {
            System.out.println(s+" is not Palindome");
        }
    }

}
