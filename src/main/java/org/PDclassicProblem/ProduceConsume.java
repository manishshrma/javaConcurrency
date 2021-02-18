package org.PDclassicProblem;

import java.util.List;

public class ProduceConsume<T> {


    public static void main(String[] args) throws InterruptedException {

        Thread t = new Threading();
        t.start();
        synchronized (t) {
            for (int i = 0; i < 5; i++) {
                t.wait();
                System.out.println("in main thread");
                System.out.println("will this run once get notify or run anyway?");
            }
        }

    }

}
