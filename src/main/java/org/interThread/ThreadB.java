package org.interThread;

public class ThreadB extends Thread {

    int total = 0;

    @Override
    public synchronized void run() {

        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                total = total + i;
            }
            this.notify();
            System.out.println("notification has been given to the calling thread ");
        }
        //some 1 million followed
    }
}
