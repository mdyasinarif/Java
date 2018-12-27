
import java.util.Scanner;

public class Pe3_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ToDay :");
        int today = input.nextInt();
        System.out.print("ToDay is :");
        switch(today){
        
            case 0:
                System.out.println("Sunday");break;
            case 1:
                System.out.println("Monday");break;
            case 2:
                System.out.println("Tuesday");break;
            case 3:
                System.out.println("Wednessday");break;
            case 4:
                System.out.println("Thusday");break;
            case 5:
                System.out.println("Friday");break;
            case 6:
                System.out.println("Saterday");break;
        }
        
        System.out.print("Enter FutureDay :");
        int futureday = input.nextInt();
        
        int commingupDay = (today+futureday)%7;
        
        switch(commingupDay){
        
            case 0:
                System.out.println("Sunday");break;
            case 1:
                System.out.println("Monday");break;
            case 2:
                System.out.println("Tuesday");break;
            case 3:
                System.out.println("Wednessday");break;
            case 4:
                System.out.println("Thusday");break;
            case 5:
                System.out.println("Friday");break;
            case 6:
                System.out.println("Saterday");break;
        }
    }

}
