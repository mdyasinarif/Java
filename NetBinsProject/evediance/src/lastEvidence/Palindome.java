
package lastEvidence;

import java.util.Scanner;


public class Palindome {
    public static void main(String[] args) {
        isPalindome();
    }
    public static void isPalindome(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number or String : ");
        String s = input.next();
        
        StringBuffer sb = new StringBuffer(s);
        
        String s2 = sb.reverse().toString();
        
        if (s.equalsIgnoreCase(s2)) {
            System.out.println("is Palindome");
        } else {
            System.out.println("is not Palindome");
        }
    }
}
