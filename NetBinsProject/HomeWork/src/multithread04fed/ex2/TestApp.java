/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread04fed.ex2;

/**
 *
 * @author Md Yasin Arif
 */
public class TestApp {
    public static void main(String[] args) {
//        Yasin y = new Yasin();
//        Thread t = new Thread(y);
//        t.start();
        
        Arif a = new Arif();
        Thread t2 = new Thread(a);
        //t2.setDaemon(true);
        t2.setName("Arif");
        System.out.println("Name :"+t2.getName());
        t2.setPriority(10);
        System.out.println("Priority : "+t2.getPriority());
        t2.start();
        
    }
}
class Yasin implements Runnable{

    @Override
    public void run() {
     int i = 0;
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
class Arif implements Runnable{

    @Override
    public void run() {
     int i = 0;
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