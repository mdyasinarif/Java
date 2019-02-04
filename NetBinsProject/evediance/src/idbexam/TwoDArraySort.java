
package idbexam;

import finalEvidence.*;
import java.util.Arrays;


public class TwoDArraySort {
    public static void main(String[] args) {
        twoDArray();
    }
    public static void twoDArray(){
        int [][] arr = {{10,5,12},{16,3,1},{26,12,5}};
        for (int[] i : arr) {
            Arrays.sort(i);
            for (int j : i) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    
    
    }
}
