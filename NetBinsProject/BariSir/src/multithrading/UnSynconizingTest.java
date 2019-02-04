
package multithrading;


public class UnSynconizingTest extends Thread{
    public static void main(String[] args) {
        UnSynconizingTest s1 = new UnSynconizingTest();
        UnSynconizingTest s2 = new UnSynconizingTest();
        s1.start();
        s2.start();
    }
    void pritn(){
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
        pritn();
    }
    
}
