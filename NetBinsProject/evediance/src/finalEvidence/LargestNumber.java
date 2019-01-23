package finalEvidence;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        System.out.println("Min: " + min(2, 3, 2, 2, 8, 9, 87));
        System.out.println("MAx: " + max(2, 3, 200, 2, 8, 9, 87));

    }
   

    public static int max(int... nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        return max;
    }

    public static int min(int... nums) {
        Arrays.sort(nums);
        int min = nums[0];
        return min;
    }
    //    public static void max() {
//        Scanner input = new Scanner(System.in);
//        int x1, x2, x3;
//        System.out.print("Enter Number");
//        x1 = input.nextInt();
//        x2 = input.nextInt();
//        x3 = input.nextInt();
//
//        int max = 0;
//        if (x1 > x2) {
//            max = x1;
//        } else {
//            max = x2;
//        }
//        if (max < x3) {
//            max = x3;
//        }
//        System.out.println("Max :" + max);
//
//    }
}
