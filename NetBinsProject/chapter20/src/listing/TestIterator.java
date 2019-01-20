
package listing;

import java.util.*;




public class TestIterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Yasin");
        collection.add("Arif");
        collection.add("Sohan");
        collection.add("IBD");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {            
            System.out.print(iterator.next().toUpperCase()+" ");
        }
        System.out.println();
    }
}
