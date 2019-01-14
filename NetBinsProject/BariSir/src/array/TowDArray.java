
package array;


public class TowDArray {
    public static void main(String[] args) {
        double  [][] a2 = new double[3][];
        a2[0]= new double [3];
        a2[1]= new double [4];
        a2[2]= new double [5];
        
        System.out.println(a2);
        
        int [][] num = {{2,5,6},{10,1,3},{12,15,16}};
        System.out.println("Given 2D arrray are");
        
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
