
import java.util.Scanner;


public class CurrentTime2_8 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.print("Enter the time Zoon GMT: ");
        int offset = input.nextInt();
        
        long totalMilliSecond = System.currentTimeMillis();
        
        long totalSecond = totalMilliSecond /1000;
        long currentSceond = totalSecond%60;
        
        long totalMinute = totalSecond/60;
        long currentMinute = totalMinute%60;
        
        long totalHours = totalMinute/60;
        long currenthours = totalHours % 24;
        
        currenthours = currenthours + offset;
        System.out.println("The current time is : "+currenthours+" :"+currentMinute+" :"+currentSceond);
    }
    
}
