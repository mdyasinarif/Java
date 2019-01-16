/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPatice;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class ArraySort2D {

    public static void main(String[] args) {
        int[][] arr = {{60, 10, 30, 40}, {9, 5, 1, 3}, {13, 10, 19}};
        for (int[] oneD : arr) {
            Arrays.sort(oneD);
            for (int i : oneD) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
