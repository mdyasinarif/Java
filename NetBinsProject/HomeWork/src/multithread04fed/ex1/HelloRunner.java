
package multithread04fed.ex1;

import java.io.IOException;
import java.nio.CharBuffer;




public class HelloRunner implements Runnable {
    int i;
    @Override
    public void run() {
        i = 0;
        while (true) {            
            System.out.println("Hello "+i++);
            if (i == 10) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }

    
}
    class ThreadTest {

    public static void main(String[] args) {
        HelloRunner hr = new HelloRunner();
        Thread t = new Thread(hr);
        t.start();
        
        Thread t2 = new Thread(hr);
        t2.setPriority(10);
        t2.start();
        
        System.out.println("T :"+t.getPriority());
        System.out.println("T2 :"+t2.getPriority());
        
        t.setName("Yasin");
        System.out.println("T Name "+t.getName());
        t2.setName("Arif");
        System.out.println("T2 Name "+t2.getName());

    }

}


