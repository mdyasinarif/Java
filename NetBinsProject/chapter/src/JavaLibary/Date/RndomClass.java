
package JavaLibary.Date;

import java.util.Random;


public class RndomClass {
    public static void main(String[] args) {
        Random random1 = new Random(1);
        System.out.println("From random1 :");
        for (int i = 0; i < 10; i++) {
            System.out.print(random1.nextInt(10)+" ");
        }
        
      Random random2 = new Random(1);
        System.out.println("\nFrom random2 :");
        for (int i = 0; i < 10; i++) {
            System.out.print(random2.nextInt(10)+" ");
        }
    }
}
