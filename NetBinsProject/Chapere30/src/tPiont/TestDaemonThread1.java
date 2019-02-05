
package tPiont;


public class TestDaemonThread1 extends Thread {

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Demon thread work");
        } else {
            System.out.println("User thread work");
        }
    }
    public static void main(String[] args) {
        TestDaemonThread1 t1 = new TestDaemonThread1();//creating thread
        TestDaemonThread1 t2 = new TestDaemonThread1();//creating thread
        TestDaemonThread1 t3 = new TestDaemonThread1();//creating thread
        t1.setDaemon(true);//now t1 is daemon thread  
        t1.start();//strating threads
        t2.start();
        t3.start();
    }
}
