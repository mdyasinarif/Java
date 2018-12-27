
import java.util.Scanner;


public class Pe3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the month :");
        int month = input.nextInt();
        System.out.println("Enter the year :");
        int year = input.nextInt();
        
        boolean lepYear = (year % 4 == 0 || year != 100) && (year % 400 == 0);
        
        switch (month) {
            case 1:
                System.out.println("January "+ year + " had 31 days");
                break;
            case 2:
                System.out.println("February "+ year + ((lepYear)? " had 29 days":"had 28 days" ));
                break;
            case 3:
                System.out.println("march "+ year + " had 31 days");
                break;
            case 4:
                System.out.println("aprin "+ year + " had 30 days");
                break;
            case 5:
                System.out.println("may "+ year + " had 31 days");
                break;
            case 6:
                System.out.println("jun "+ year + " had 30 days");
                break;
            case 7:
                System.out.println("july "+ year + " had 31 days");
                break;
            case 8:
                System.out.println("august "+ year + " had 31 days");
                break;
            case 9:
                System.out.println("september "+ year + " had 30 days");
                break;
            case 10:
                System.out.println("octobor "+ year + " had 31 days");
                break;
            case 11:
                System.out.println("novembor "+ year + " had 30 days");
                break;
            case 12:
                System.out.println("decembor "+ year + " had 31 days");
                break;
            default:
                System.out.println("Invalid Number");
        }
    }
}
