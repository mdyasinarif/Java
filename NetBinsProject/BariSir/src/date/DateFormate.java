package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class DateFormate {
    
    private static Object Calender;

    public static void main(String[] args) {
        SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");
        SimpleDateFormat dateFormate2 = new SimpleDateFormat("yyyy/MM/dd");//msql
        // using Date()
        Date date = new Date();
        System.out.println(date);
        System.out.println(dateFormate.format(date));
        System.out.println(dateFormate2.format(date));
        //using Calandar()
        Calendar cal = Calendar.getInstance();
        String st = cal.getTime().toString();
        System.out.println(st);
        System.out.println(dateFormate.format(cal.getTime()));
        System.out.println(dateFormate2.format(cal.getTime()));
    }
    
}
