
package lastEvidence;


public class SumOdd {
    public static void main(String[] args) {
        sumOdd();
    }
    public static void sumOdd(){
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of Odd : "+sum);
    }
}
