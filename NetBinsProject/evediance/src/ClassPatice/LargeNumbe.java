
package ClassPatice;

import java.util.Arrays;
import java.util.Scanner;


public class LargeNumbe {
    public static void main(String[] args) {
        maxMin();
       
    }
    public static void maxMin(){
        int [] a = {10,3,15,65,15,396,78,69};
        Arrays.sort(a);
        System.out.println("Minuum number is "+a[0]);
        System.out.println("Mazmim number is "+a[a.length-1]);
    }
    
}
