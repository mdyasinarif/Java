package firstPart;

public class Q32DArraySum {

    public static void main(String[] args) {
        int[][] arr2 = {
                     {1, 1, 1, 1}, 
                     {1, 1, 1, 1}, 
                     {1, 1, 1, 1}};
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + ", ");
                sum += arr2[i][j] ;
            }

            System.out.println();
        }

        System.out.println("Sum is :" + sum);
    }
}
