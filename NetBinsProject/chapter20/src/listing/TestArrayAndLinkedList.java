
package listing;

import java.util.*;


public class TestArrayAndLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(0,10);
        arrayList.add(0,30);
        
        System.out.println("A list of Integer in the array list:"+arrayList);
        
        LinkedList<Object> linkList = new LinkedList<>(arrayList);
        linkList.add(1,"red");
        
        System.out.println("LinkedList :"+linkList);
        linkList.removeLast();
        System.out.println("removeLast :"+linkList);
        
        linkList.addFirst("Green");
        System.out.println("addFirst :"+linkList);
        System.out.println("listIterator forword");
        ListIterator<Object> listIterator = linkList.listIterator();
        while (listIterator.hasNext()) {            
            System.out.print(listIterator.next()+" ");
        }
        System.out.println();
        
        System.out.println("listIterator Backword");
        listIterator = linkList.listIterator(linkList.size());
        while (listIterator.hasPrevious()) {            
            System.out.print(listIterator.previous()+" ");
        }
        System.out.println();
    }
   
}
