
package listing;

import java.util.HashSet;
import java.util.Set;


public class TestMethodsInCollection {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");
        set1.add("New York");
        System.out.println("Set1 is "+set1);
        System.out.println(set1.size()+" elements in set1");
        
        set1.remove("London");
        System.out.println("\nset1 is "+set1);
        System.out.println(set1.size()+" elements in set1");
        
         Set<String> set2 = new HashSet<>();
        set2.add("Dhaka");
        set2.add("Cummila");
        set2.add("San Francisco");
         System.out.println("\nset2 is "+set2);
        System.out.println(set1.size()+" elements in set2");
        
        
        
        System.out.println("\nIs Taiple in set2? "+set2.contains("Taiple"));
        
       set1.addAll(set2);
       System.out.println("Adding set 2 into set1 "+set1);
        
        
        set1.retainAll(set2);
        System.out.println("After removing common element "+set1);
        
        set1.removeAll(set2);
        System.out.println("After removing set2 fsrom set1 , set1 is "+set1);
        
        
    }
}
