package sorting;

public class InsortionSort {

    public static void main(String[] args) {
        int arr1[] = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("Before Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        insertionSort2(arr1);//sorting array using insertion sort
        System.out.println("After Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
// using while loop
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i-1;
            while ((j > -1)&&(array[j]>key)) {                
                array[j+1]=array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
    // using for loop
    public static void insertionSort2(int array[]) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j;
            for ( j = i-1; j >=0 && array[j]>key; j--) {
                array[j+1]=array[j];
            }
            array[j+1] = key;
        }
    }
}
