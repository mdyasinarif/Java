
package classTest;


public class NumaricDataType {
    public static void main(String[] args) {
        int num1 = 10;
        short num2 = 20;
        double  result = num1+num2;
        System.currentTimeMillis();
        long start = System.currentTimeMillis();
        System.out.println("Result "+ result);
        System.currentTimeMillis();
        long end = System.currentTimeMillis();
        long requare = end - start;
        System.out.println("Time Expend :"+requare+" ms");
    }
}
