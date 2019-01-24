
package listing;

import java.util.Collections;
import java.util.PriorityQueue;


public class PriorityQueueDemo {
    public static void main(String[] args) {
           PriorityQueue<String> queue1 = new  PriorityQueue<>(); 
           //sequenconizer
           queue1.offer("Yasin");
           queue1.offer("Arif");
           queue1.offer("Sohan");
           //unsequenconizer
//          queue1.add("Yasin");
//          queue1.add("Arif");
//          queue1.add("Sohan");
           
           System.out.print("Priourty Queue using Comparable : ");
           while (!queue1.isEmpty()) {   //(queue1.size() >0)         
               System.out.print(queue1.remove()+" ");
        }
           System.out.println();
           
           PriorityQueue <String> queue2 = new PriorityQueue(4,Collections.reverseOrder());
           queue2.offer("Yasin");
           queue2.offer("Arif");
           queue2.offer("Sohan");
           
           System.out.print("Priourty Queue using  comparator :");
           while (queue2.size() >0) {            
               System.out.print(queue2.remove() + " ");
        }
            System.out.println();
    }
}
