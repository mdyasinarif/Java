package listing;

public class TaskThreadDemo {

    public static void main(String[] args) {
        // creat tasks
        Runnable printA = new PritnChar('a', 10);
        Runnable printB = new PritnChar('b', 10);
        Runnable print100 = new PrintNum(10);
        
        // create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);
        
        // start threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}


     class PritnChar implements Runnable {

        private char charToPrint;
        private int times;

        public PritnChar(char c, int t) {
            charToPrint = c;
            times = t;

        }

        @Override
        public void run() {
            for (int i = 0; i < times; i++) {
                System.out.print(charToPrint);
            }
        }

    }



    class PrintNum implements Runnable {

        private int lastNum;

        public PrintNum(int n) {
            lastNum = n;
        }

        @Override
        public void run() {
            for (int i = 0; i <= lastNum; i++) {
                System.out.print(" " + i);

            }
        }

    }

