
import java.util.Scanner;


public class Exercise_03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the time zone of GMT :");
        int offset = input.nextInt();
        
        long totalMilliseconds = System.currentTimeMillis();
        
        long totalSeconds = totalMilliseconds /1000; 
        long currentSecoonds = totalSeconds % 60;
        
        long totalMinutes = totalSeconds / 60;
        long courrentMinutes = totalMinutes % 60;
        
        long totalHours = totalMinutes / 60;
        long courrentHours = totalHours % 24;
        courrentHours = courrentHours + offset;
        
        System.out.println(
                "Current time is "+((courrentHours > 12)? courrentHours -12 :courrentHours)+" : "+ courrentMinutes+" : "+currentSecoonds+((courrentHours > 12)? "PM":"AM"));
                
    }
}
