
import java.util.Scanner;


public class Exercise_03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int coin = (int)(Math.random()*2);
        
        System.out.println("Entre 0-for heads and 1 for tails");
        int guss = input.nextInt();
        
        System.out.println(((guss == coin)? " correct":"wrong")+" guss");
    }
}
