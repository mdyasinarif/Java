
package tPiont;


public class TestSleepMethod1 extends Thread{

    
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println(e);      
            }
            
        }
       
    }
    public static void main(String[] args) {
        TestSleepMethod1 t1 = new TestSleepMethod1();
        TestSleepMethod1 t2 = new TestSleepMethod1();
        t1.start();
        t2.start();
    }
}
