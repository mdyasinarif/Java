
package listing13_6;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalander {
    public static void main(String[] args) {
        Calendar calander = new GregorianCalendar();
        System.out.println("Current time is "+new Date());
        System.out.println("Year :"+calander.get(Calendar.YEAR));
        System.out.println("Month :"+calander.get(Calendar.MONTH));
        System.out.println("Month :"+calander.get(Calendar.DATE));
        System.out.println("Month :"+calander.get(Calendar.HOUR));
        System.out.println("Hours of Day :"+calander.get(Calendar.MINUTE));
        System.out.println("SECOND of Day :"+calander.get(Calendar.SECOND));
        System.out.println("DAY_OF_WEEK :"+calander.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_MONTH  :"+calander.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR  :"+calander.get(Calendar.DAY_OF_YEAR));
        System.out.println("WEEK_OF_MONTH  :"+calander.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK_OF_YEAR  :"+calander.get(Calendar.WEEK_OF_YEAR));
        System.out.println("AM_PM  :"+calander.get(Calendar.AM_PM));
        
        Calendar calander1 = new GregorianCalendar(2019,0,17);
        String[] dayNameOfWeek = {"Sun","Mon","Tus","Wed","Thus","Fri","sat"};
        System.out.println("Jan 17,2019 is a "+dayNameOfWeek[calander1.get(Calendar.DAY_OF_WEEK)-1]);//index 4 niba
    }
}
