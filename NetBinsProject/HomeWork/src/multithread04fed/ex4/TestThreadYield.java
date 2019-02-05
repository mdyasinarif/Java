
package multithread04fed.ex4;


public class TestThreadYield implements Runnable{
    Thread t;
     TestThreadYield(String str) {
        t = new Thread(this, str);
        t.start();
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if ((i % 5) == 0) {
                System.out.println(Thread.currentThread().getName()+" Yielding control...");
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName()+" has finished");
    }
    
}

class Test{
    public static void main(String[] args) {
        new TestThreadYield("Thread 1");
        new TestThreadYield("Thread 2");
        new TestThreadYield("Thread 3");
        new TestThreadYield("Thread 4");
    }
  

}
