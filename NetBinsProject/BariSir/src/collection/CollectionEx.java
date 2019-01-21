
package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;


public class CollectionEx {
    public static void main(String[] args) {
        List l = new LinkedList();
        l.add("List : yasin");
        l.add("Arif");
        l.add("Sohan");
        l.add("Arif");
        print(l);
        //l.add(2);
       // printA(l);
        
        Set s = new HashSet();
        s.add("Set : Yasin");
        s.add("Arif");
        s.add("Sohan");
        s.add("Arif");
        print(s);
       // s.add(2);
       // printA(s);
        
        
        SortedSet ss = new TreeSet();
        ss.add("TreeSet : Yasin");
        ss.add("Arif");
        ss.add("Sohan");
        ss.add("Arif");
        print(ss);
        //ss.add(2);
       // printA(ss);
        
       
       LinkedHashSet sss = new LinkedHashSet();
       sss.add("LinkedHashSet : Yasin");
       sss.add("Arif");
       sss.add("Sohna");
       
       print(sss);
       
       
       SortedMap sm = new TreeMap();
       sm.put("Mape", "TreeMap");
       sm.put("01", "Yasin");
       sm.put("02", "Arif");
       sm.put("03", "Sohan");
       
       print(sm.keySet());
       print(sm.values());
       
       LinkedHashMap lm = new LinkedHashMap();
       lm.put("Mape", "LinkedHashMap");
       lm.put("01", "Yasin");
       lm.put("02", "Arif");
       lm.put("03", "Sohan");
       
       print(lm.keySet());
       print(lm.values());
       
       Map ml = new HashMap();
       ml.put("Mape", "LinkedHashMap");
       ml.put("01", "Yasin");
       ml.put("02", "Arif");
       ml.put("03", "Sohan");
       
       print(ml.keySet());
       print(ml.values());
       
       SortedMap som = new TreeMap();
        som.put("Mape", "SortedMap");
       som.put("01", "Yasin");
       som.put("02", "Arif");
       som.put("03", "Sohan");
       
       print(som.keySet());
       print(som.values());
    }
     static void print(Collection coll){
         Iterator iter = coll.iterator();
         while (iter.hasNext()) {
             String elem = (String)iter.next();
             System.out.print(elem+" ");  
         }
         System.out.println();
     }
     
     static void printA(Collection coll){
         Iterator iter = coll.iterator();
         while (iter.hasNext()) {
             Object next = iter.next();
             System.out.print(next+" ");
         }
         System.out.println();
     }
}
