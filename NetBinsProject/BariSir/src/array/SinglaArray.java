
package array;

import java.util.Arrays;


public class SinglaArray {
    public static void main(String[] args) {
        int[]  a = new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        System.out.println(a);
        System.out.println(a.length);
        int num[] = {30,20,60,40,50,10};
        System.out.print("Given Number : ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(" "+num[i]);
        }
        System.out.println("\n");
        
        System.out.println("Assending Number :");
        Arrays.sort(num);
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+num[i]);
        }
    }       
}