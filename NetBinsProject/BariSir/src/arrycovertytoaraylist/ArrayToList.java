package arrycovertytoaraylist;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArrayToList {

    static String[] createArray() {
        String sArray[] = new String[55000];
        for (int i = 0; i < 55000; i++) {
            sArray[i] = "Array " + i;
        }
        return sArray;
    }

    public static void main(String[] args) {
        String sArray[] = createArray();

        List lList = Arrays.asList(sArray);

        System.out.println("-----------Itreator Loop----------");
        long lItratorStrateTime = new Date().getTime();

        Iterator<String> iterator = lList.iterator();

        while (iterator.hasNext()) {
            String stemp = iterator.next();
        }
        long lItratorEndTime = new Date().getTime();

        long itime = lItratorEndTime - lItratorStrateTime;
        System.out.println("Itreator Loop : " + itime);
        
         System.out.println("-----------For Loop----------");
        long forStratTime = new Date().getTime();
        
        for (int i = 0; i < lList.size(); i++) {
            String stemp = (String) lList.get(i);
        }
         long forEndTime = new Date().getTime();   
         
         long fortime = forEndTime - forStratTime;
         System.out.println("For Loop Take time : "+fortime);
         
         System.out.println("-----------While Loop----------");
         long WhileStratTime = new Date().getTime();
         int j = 0;
         while (j < lList.size()) {            
            String stemp = (String) lList.get(j);
            j++;
        }
          long WhileEndTime = new Date().getTime();
          long whileTime = WhileEndTime - WhileStratTime;
          System.out.println("While Loop take time : "+whileTime);
        }
    }

