
package listing;

import java.util.HashSet;
import java.util.Set;


public class TestHasSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        System.out.println(set);
        
        for (String s : set) {
            System.out.println(s.toUpperCase()+" ");
        }
    }
}
