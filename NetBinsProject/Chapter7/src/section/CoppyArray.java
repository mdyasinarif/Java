
package section;


public class CoppyArray {
    public static void main(String[] args) {
        int[] sorceArray  = {2,3,1,5,10};
        int [] targetArray = new int [sorceArray.length];
        for (int i = 0; i < sorceArray.length; i++) {
            targetArray[i] = sorceArray[i];
            System.out.print(targetArray[i]);
            
        }
        System.out.println();
        pritArray(new int[]{2,5,8,9,10});
    } 
    public static void pritArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    
    }
}
 