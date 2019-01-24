
package listing;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < 5; i++) {
            q.offer(i);//sequenconizer// q.add(i); unsequenconizer
        }
        System.out.println("Elements of Queue : "+q);
        
        int removedele = q.remove();
        System.out.println("Removed element : "+removedele);
        System.out.println("After removed : "+q);
        
        int head = q.peek();
        System.out.println("Head of Queue : "+head);
        
        int size = q.size();
        System.out.println("Size of Queue : "+size);
        
        
        
    }
}
