
package evidence;

import java.util.Arrays;


public class Q7Arry2DSort {
    public static void main(String[] args) {
        int [][] arr2D = {
            {1,8,5,6,7,10},
            {11,13,18,15,16,14}
        };
        
        for (int[] oneD : arr2D) {
            Arrays.sort(oneD);
            for (int i : oneD) {
                System.out.print(i+", ");
            }
              System.out.println();   
        }
       
    }
   
    
}
