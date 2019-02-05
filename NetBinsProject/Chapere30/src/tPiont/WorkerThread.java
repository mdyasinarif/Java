/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tPiont;

import java.util.concurrent.ExecutorService;

/**
 *
 * @author User
 */
public class WorkerThread  implements Runnable{
    private String message;

    public WorkerThread(String message) {
        this.message = message;
    }
     
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"(start) message = "+message);
        Processmessage();//call processmessage method that sleeps the thread for 2 seconds
        System.out.println(Thread.currentThread().getName()+"(End)");
    }
    private void Processmessage(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class TestThreadPool{
    public static void main(String[] args) {
       // ExecutorService 
    }
}
