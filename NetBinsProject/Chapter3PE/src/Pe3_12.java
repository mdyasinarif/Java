
import java.util.Scanner;


public class Pe3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = input.nextInt();
        
        int degit1 = num /100;
        int reminder = num % 100;
        int degit3 = reminder % 10;
        System.out.println(num+((degit1==degit3)?" is a " :" is not ")+"Palindrom" );
    }
}
