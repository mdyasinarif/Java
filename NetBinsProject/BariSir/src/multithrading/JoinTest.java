/*
 * The join()method causes the courrently running threads to stop
 * executing untile the thread it joins with compleats its task
 */
package multithrading;


public class JoinTest implements Runnable{
    public static void main(String[] args) {
        try {
            Thread t = new Thread(new JoinTest());
            t.start();
            System.out.println("Strated");
            t.join(); 
            /*
            with out join 
            output is 
            Strated
            Compleated
             Running....
             */
            System.out.println("Compleated");
        } catch (InterruptedException e) {// without join Exception
            System.out.println(e);
        }
        }
    @Override
    public void run() {
        System.out.println("Running....");
    
    } 

    }
    
        

   
