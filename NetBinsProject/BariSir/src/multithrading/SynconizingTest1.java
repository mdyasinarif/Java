
package multithrading;


public class SynconizingTest1 extends Thread{
    public static void main(String[] args) {
        SynconizingTest1 s1 = new SynconizingTest1();
        SynconizingTest1 s2 = new SynconizingTest1();
        s1.start();
        s2.start();
    }
    static synchronized void pritn(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep((long)(3000 * Math.random()));
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    
    }

    @Override
    public void run() {
        synchronized(this){
             pritn();
        }
    }
    
}
