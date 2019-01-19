
import java.util.Scanner;


public class MaxUsinGeneric {
    public static <E extends Comparable<E>> E max(E o1, E o2){
        if (o1.compareTo(o2)>0) {
            return o1;
        }else{
            return  o2;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int n1 = input.nextInt();
        System.out.print("Enter 1st Number:");
        int n2 = input.nextInt();
        System.out.println("Max :"+max(n1,n2));
    }
}
