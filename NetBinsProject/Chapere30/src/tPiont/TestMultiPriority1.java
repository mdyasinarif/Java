
package tPiont;


public class TestMultiPriority1 extends Thread{

    @Override
    public void run() {
        System.out.println("running threas name is "+Thread.currentThread().getName());
        System.out.println("running threas name is "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        TestMultiPriority1 m1 = new TestMultiPriority1();
        TestMultiPriority1 m2 = new TestMultiPriority1();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
    }
}
