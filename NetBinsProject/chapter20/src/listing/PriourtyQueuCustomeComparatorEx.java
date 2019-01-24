
package listing;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriourtyQueuCustomeComparatorEx {
    public static void main(String[] args) {
        Comparator<String> StringLengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();// accourding to character length 
            }
        };
        
        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(StringLengthComparator);
        
        namePriorityQueue.add("Yasin");
        namePriorityQueue.add("Arif");
        namePriorityQueue.add("Sohan"); 
        namePriorityQueue.add("Mr.Minhaz");
        namePriorityQueue.add("Oli");
        
        while (!namePriorityQueue.isEmpty()) {
            System.out.println(namePriorityQueue.remove());
        }
    }
}
