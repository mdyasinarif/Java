
package listing;

import static java.lang.reflect.Array.set;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class TestTreeSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");
        set1.add("New York");
        
        TreeSet<String> treeSet = new TreeSet<>(set1);
        System.out.println("Sorted tree set :"+treeSet);
        
        System.out.println("First() :"+treeSet.first());
        System.out.println("last() :"+treeSet.last());
        System.out.println("headSet(\"New York\"):" + treeSet.headSet("New York"));
        System.out.println("tailSet(\"New York\"):" + treeSet.tailSet("New York"));
        
        System.out.println("treeSet.lower(\"P\") "+treeSet.lower("P"));
        System.out.println("treeSet.higher(\"P\") "+treeSet.higher("P"));
        System.out.println("treeSet.floor(\"P\") "+treeSet.floor("P"));
        System.out.println("treeSet.ceiling(\"P\") "+treeSet.ceiling("P"));
        System.out.println("treeSet.pollFirst() "+treeSet.pollFirst());
        System.out.println("treeSet.pollLast() "+treeSet.pollLast());
        System.out.println("New tree set :" +treeSet);
    }
}
