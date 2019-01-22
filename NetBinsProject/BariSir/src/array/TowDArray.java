
package array;

import java.util.Arrays;


public class TowDArray {
    public static void main(String[] args) {
        double  [][] a2 = new double[3][];
        a2[0]= new double [3];
        a2[1]= new double [4];
        a2[2]= new double [5];
        
        System.out.println(a2);
        
        int [][] num = {{8,3,6},{10,1,3},{12,10,8}};
        int sum =0;
        System.out.println("Given 2D arrray are");
        System.out.println("Advance For");
        for (int[] a : num) {
             Arrays.sort(a);// sort 
            for (int i : a) {
                System.out.print(i+ " ");
                sum += i;// for sum
            }
            System.out.println();
            
        }
        System.out.println("Sum :"+sum);
        
        System.out.println("For loop");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
