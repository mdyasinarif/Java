
package ClassPatice;

import java.util.Scanner;


public class Palindom {
    public static void main(String[] args) {
        
        isPalindom();
    }
    public static void isPalindom(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number or String : ");
        
        String s1 = sc.next();
        
        StringBuffer sb = new StringBuffer(s1);
        
        String s2 = sb.reverse().toString();
        
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println(s1+" is palindom");
        } else {
            System.out.println(s1+" is not palindom");
        }
    }
}
