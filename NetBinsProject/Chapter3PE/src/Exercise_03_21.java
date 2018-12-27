
import java.util.Scanner;


public class Exercise_03_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter year : ");
        int year = input.nextInt();
        
        System.out.print("Enter month : ");
        int month = input.nextInt();
        
        System.out.print("Enter day : ");
        int day = input.nextInt();
        // k = (year % 100) if the year is century
        // j = (year /100)
        if (month == 1 ||month == 2) {
            month = (month == 1)? 13:14;
            year --;
            
        }
        int dayOfWeek = (day+(26*(month+1))/10 + (year % 100)+(year % 100)/4 +(year /100)/4 + 5*(year /100))% 7;
        System.out.print("Day of the week is ");
		switch(dayOfWeek)
		{
			case 0: System.out.println("Saturday"); break;
			case 1: System.out.println("Sunday"); break;
			case 2: System.out.println("Monday"); break;
			case 3: System.out.println("Tuesday"); break;
			case 4: System.out.println("Wednesday"); break;
			case 5: System.out.println("Thursday"); break;
			case 6: System.out.println("Friday");
		}
    }
}
