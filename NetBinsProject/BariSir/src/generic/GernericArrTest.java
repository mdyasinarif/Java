
package generic;

import java.util.ArrayList;
import java.util.List;


public class GernericArrTest {
    public static void main(String[] args) {
        List<Integer> inlist = new ArrayList();
        inlist.add(1);
        inlist.add(2);
       // we can't use it is type safty list.add("yasin");
       
       List<String> stlist = new ArrayList();
       stlist.add("Yasin");
       stlist.add("Arif");
       
       System.out.println("Print the List >:"+inlist+stlist);
       
       
        System.out.print("Using ForEachLoop >:");
        for (Integer integer : inlist) {
            System.out.print(integer+" ");
        }
        for (String string : stlist) {
            System.out.print(string+" ");
        }
        System.out.println();
        System.out.print("Using index >:");
        System.out.print(inlist.get(0)+" ");
        System.out.print(inlist.get(1)+" ");
        System.out.print(stlist.get(0)+" ");
        System.out.print(stlist.get(1)+" ");
        System.out.println();
        System.out.println();
        System.out.println("Print like 2D array");
        System.out.println(inlist.get(0)+" "+stlist.get(0));
        System.out.println(inlist.get(1)+" "+stlist.get(1));
        
        System.out.println();
        
        }
    }

