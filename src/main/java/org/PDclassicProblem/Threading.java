package org.PDclassicProblem;

public class Threading extends Thread {
    @Override
    public synchronized void run() {
        for (int i = 0; i < 6; i++) {
            try {
                synchronized (this) {
                    Thread.sleep(100);
                    System.out.println("in child thread");
                    if (i == 3) {
                        this.notify();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
