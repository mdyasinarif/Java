/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadForkJoine;

import java.util.concurrent.TimeUnit;

public class CustomLock {

    private final Object lockObject = new Object();
    private Thread lockingThread;
    private int lockCount = 0;

    public boolean lock(int timeout) {
        synchronized (lockObject) {
            if (lockingThread != null
                    && lockingThread != Thread.currentThread()) {
                try {
                    long elapsedTime = 0L;
                    long startWaitingTime;
                    while (lockingThread != null) {
                        startWaitingTime = TimeUnit.NANOSECONDS.toMillis(System
                                .nanoTime());
                        lockObject.wait(timeout);
                        elapsedTime += TimeUnit.NANOSECONDS.toMillis(System
                                .nanoTime()) - startWaitingTime;

                        if (timeout > 0 && elapsedTime > timeout) {
                            return false;
                        }
                    }
                } catch (InterruptedException e) {
                    return false;
                }
            }
            lockCount++;
            if (lockingThread == null) {
                lockingThread = Thread.currentThread();
            }
            return true;
        }
    }

    public void releaseLock() {
        synchronized (lockObject) {
            if (lockingThread != Thread.currentThread()) {
                throw new IllegalStateException(
                        "Only lock holding thread may release the lock!");
            }
            lockCount--;
            if (lockCount == 0) {
                lockingThread = null;
                lockObject.notify();
            }
        }
    }
}
class Test {

    public static void main(String[] args) throws InterruptedException {
        CustomLock lock = new CustomLock();
        MyThread[] threadArray = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new MyThread(lock);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].join();
        }
    }
    static class MyThread extends Thread {

        private final CustomLock lock;
        public MyThread(CustomLock lock) {
            this.lock = lock;
        }
        @Override
        public void run() {
            boolean lockAcquired = lock.lock(2000);
            if (lockAcquired) {
                System.out
                        .println("Thread " + this.getId() + ": Lock acquired");
                try {
                    System.out.println("Thread " + this.getId() + ": Working");
                } finally {
                    lock.releaseLock();
                    System.out.println("Thread " + this.getId()
                            + ": Lock released");
                }
            } else {
                throw new RuntimeException("Could not acquire lock!");                                                                                            
            }
        }
    }
}