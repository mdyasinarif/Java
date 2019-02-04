/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPatice;

/**
 *
 * @author Md Yasin Arif
 */
public class ReverseSort {
    public static void main(String[] args) {
        int k,a [][]  = {{4, 1, 3, 7, 5}, {8, 3, 2, 9, 21}, {10, 15, 7, 6, 2},{4, 1, 3, 7, 5}};
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
                for (int l = j+1; l < a[i].length; l++) {
                    if (a[i][j] < a[i][l]) {
                        k = a[i][l];
                        a[i][l] = a[i][j];
                        a[i][j] = k;
                    }
                }
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
