package org.tryout;

public class Thread2 extends Thread {
    WorkHere w2;
    String name;
    static Thread mt;

    public Thread2(WorkHere w1, String name) {
           this.w2=w2;
           this.name=name;
    }

    @Override
    public void run() {
        mt= Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println("in thread2 class");
        }
        w2.test(name);
    }

}
