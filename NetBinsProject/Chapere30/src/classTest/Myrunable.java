package classTest;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Myrunable implements Runnable {
        
    @Override
    public void run() {
        try {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += i;
            }
            System.out.println("Sum " + sum);
            Thread.sleep(500);
            System.out.println("Sum " + sum);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadAbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
