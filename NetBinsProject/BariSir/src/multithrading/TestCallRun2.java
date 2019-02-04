
package multithrading;


public class TestCallRun2 extends Thread{

    @Override
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
        TestCallRun2 t1 = new TestCallRun2();
        TestCallRun2 t2 = new TestCallRun2();
        
//        t1.run();
//        t2.run();
           t1.start();;
           t2.start();;
    }
}
