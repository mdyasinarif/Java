
package finalEvidence;

import lastEvidence.*;
import java.util.Arrays;


public class MinMaxUsingArray {
    public static void main(String[] args) {
        findMinMax();
    }
    public static void findMinMax(){
        int arr [] = {2,10,1,18,20,13,14};
        Arrays.sort(arr);
        System.out.println("Mimimun value : "+arr[0]);
        System.out.println("Maxmim value : "+arr[arr.length-1]);
    }
}
