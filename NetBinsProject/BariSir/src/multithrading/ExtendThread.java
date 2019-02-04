
package multithrading;
// a sinconized hamper na kora kaj kor na
//sinconized kaj says kora outher thread kor 

 class NewThread extends Thread  {

    public NewThread() {
        super("Demo Thread");
        System.out.println("Child thread:"+this);
        this.start();// for colling the run methods
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread :"+i);
                sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Exiting Child thread");
    }
   
}
class ExtendThread{
    public static void main(String[] args) {
        new NewThread();// object creation
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread :"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Main Child thread");
    }

}
