package ClassPatice;

import java.util.Arrays;

public class TwoDArraySort {

    public static void main(String[] args) {
        toDArraySort();

    }

    public static void toDArraySort() {
        int[][] arr = {{2, 8, 12}, {20, 13, 6, 8}, {22, 36, 2, 98, 31}};
        int sum = 0;
        
        for (int[] i : arr) {
            Arrays.sort(i);
            for (int j : i) {
                System.out.print(j+" ");
                sum += j;
            }
            System.out.println();
        }
        System.out.println("Sum "+sum);
    }
}
