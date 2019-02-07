package sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int arr1[] = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("Before Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        babbleSort(arr1);//sorting array using insertion sort
        System.out.println("After Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

    public static void babbleSort(int array[]) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (array[j-1]>array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    
    }
}
