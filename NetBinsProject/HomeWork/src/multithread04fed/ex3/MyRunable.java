
package multithread04fed.ex3;


public class MyRunable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread strated "+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread End "+Thread.currentThread().getName());
    }
    
}
class testRunable{
    public static void main(String[] args) throws InterruptedException {
       Thread t1 = new Thread(new MyRunable(),"T1");
       Thread t2 = new Thread(new MyRunable(),"T2");
       Thread t3 = new Thread(new MyRunable(),"T3");
       t1.start();
        try {
            t1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t2.join(1000);
        t3.start();
    }

}
