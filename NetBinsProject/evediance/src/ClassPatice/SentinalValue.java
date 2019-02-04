
package ClassPatice;

import java.util.Scanner;


public class SentinalValue {
    public static void main(String[] args) {
        sentinal();
    }
    public static void sentinal(){
        Scanner sc = new Scanner(System.in);
        
        
        int sum = 0;
        
          for (int i = 0; ; i++) {
              System.out.print("Enter Number : ");
              int n = sc.nextInt();
              if (n>0) {
                  sum += n;
              } else {
                  break;
              }
        }
        System.out.println("Sum : "+sum);
    }
}
