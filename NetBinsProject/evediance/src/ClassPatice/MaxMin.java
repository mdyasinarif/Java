
package ClassPatice;

import java.util.Arrays;
import java.util.Scanner;


public class MaxMin {
    public static void main(String[] args) {
        //maxMin();
        toDmaxMin();
    }
    public static void maxMin(){
        
        int [] arr = {10,12,9,15,3,24,18,20,2};
        Arrays.sort(arr);
        System.out.println("Minumum number of Array : "+arr[0]);
        System.out.println("Maxmium number of Array : "+arr[arr.length-1]);
    
    }
    public static void toDmaxMin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int n = sc.nextInt();
   
        int [] myList = new int[n];
        
        for (int i = 0; i < myList.length; i++) {
            System.out.print("Enter "+(i+1)+" values ");
            myList[i] = sc.nextInt();
        }
        Arrays.sort(myList);
        System.out.println("Minumum number of Array : "+myList[0]);
        System.out.println("Maxmium number of Array : "+myList[myList.length-1]);
    }
}
