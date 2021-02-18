package org.tryout;

public class Thread1 extends Thread {
    WorkHere w1;String name;
    public Thread1(WorkHere w1, String name) {
           this.w1=w1;
           this.name=name;
    }
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("in thread1 class "+name);
        }
        w1.test(name);

    }
}
