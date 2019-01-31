
package lastEvidence;

import java.util.Arrays;


public class TwoDArraySort {
    public static void main(String[] args) {
        twoDArraySort();
    }
    public static void twoDArraySort(){
        int arr [][] = {{8,3,6,},{15,11,19},{42,69,12}};
        int sum = 0;
        for (int[] i : arr) {
            Arrays.sort(i);
            for (int j : i) {
                System.out.print(j+" ");
                sum += j;
            }
            System.out.println();
        }
        System.out.println("Sum : "+sum);
    }
}
