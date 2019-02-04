
package multithrading;

//if class thread extend any class then implement Runable
class NweThread implements Runnable{
    
    

    public NweThread() {
       Thread t = new Thread(this,"Demo Thread");
        System.out.println("Child thread : "+t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Exiting Child Thread");
    }
    
}
class ImplementThread{
    public static void main(String[] args) {
        new NweThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Main Child Thread");
    }

}
