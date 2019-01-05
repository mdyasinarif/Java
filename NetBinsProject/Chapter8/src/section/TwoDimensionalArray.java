
package section;


public class TwoDimensionalArray {
    public static void main(String[] args) { 
    int twoD[][] = {
    {2,3,5,6},
    {7,8,9},
    {1,4,7,9}         
    }; 
        System.out.println("TwoD[2][1] :"+twoD[2][3]);
        for (int oneD[]  : twoD) {
            for (int i : oneD) {
                System.out.print(i+" ");
        }
            
        }
        System.out.println();
     }
}
