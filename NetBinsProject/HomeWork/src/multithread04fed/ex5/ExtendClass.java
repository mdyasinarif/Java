
package multithread04fed.ex5;


public class ExtendClass extends Thread {
  int i =0;

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Thread strated running ..");
        while (true) {            
            System.out.println("Result of i : "+ i++);
            if (i == 10) {
                break;
            }
        }
    }
  
}
class Test{
    public static void main(String[] args) {
       Thread t = new ExtendClass();
       t.start();
       Thread t2 = new ExtendClass();
       t2.start();
       System.out.println("T2 : "+t2.getName());
    }

}