
package generic;

import java.util.ArrayList;
import java.util.List;


public class NormalArrTest {
    public static void main(String[] args) {
        // normal generice
        
        List list = new ArrayList();
        list.add(1);
        list.add("Yasin");
        list.add(2);
        list.add("Arif");
       
        
        System.out.println("Print the List >:"+list);
        
        System.out.print("Using For Each Loop >:");
        for (Object object : list) {
            System.out.print(object+" ");
        }
         System.out.println();
        System.out.print("Using Index  > :");
        System.out.print(list.get(0)+ " ");
        System.out.print(list.get(1)+ " ");
        System.out.print(list.get(2)+ " ");
        System.out.print(list.get(3)+ " ");
        System.out.println();
    }
}
