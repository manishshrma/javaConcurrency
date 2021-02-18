package org.tryout;

import org.PDclassicProblem.Threading;
// first thread1 complete,then thread2 and then main
public class Demo {

    public static void main(String[] args) {

        WorkHere wh=new WorkHere(12,"manish");
        WorkHere wh2=new WorkHere(13,"groote");
        Thread t1=new Thread1(wh,"manish");
        Thread t2=new Thread2(wh,"funny");
        t1.setPriority(7);
        t2.setPriority(6);
        t1.start();// manish thread
        t2.start();//groote thread

        for(int i=0;i<5;i++)
        {
            System.out.println("in main thread");
        }
    }
}
