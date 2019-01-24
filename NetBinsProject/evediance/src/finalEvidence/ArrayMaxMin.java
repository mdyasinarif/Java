
package finalEvidence;


public class ArrayMaxMin {
    public static void main(String[] args) {
        int [] arr = {2,12,25,13,89,75,1,26,6};
        
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]> max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Largest Number is :"+max);
        System.out.println("Small Number is :"+min);
    }
}
