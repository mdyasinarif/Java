
package firstPart;


public class Q2PrintArrayAndSum {
    public static void main(String[] args) {
        int[] arr = {20,50,80,90};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
        }
        System.out.print("The array is :");
        for (int i : arr) {
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println("Sum of arrays :"+sum);
    }
}
