package org.thread.basic;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("main thread");

        ////// creating thread class using thread class///////
//        ThreadingByThread th = new ThreadingByThread();
//        th.start(); // start of a thread
//        for (int i = 0; i < 5; i++) {
//            System.out.println("main thread");
//        }

        //////////creation of thread using runnable interface//////
        ThreadingByrunnable th = new ThreadingByrunnable();
        Thread t = new Thread(th); // passing ref of class that implemented runnable interface method.
        t.start();
        t.run();// no new thread will be created, run method of runnable interface won't get called,
        //instead thread run method get called directly
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }

        System.out.println("main Thread End here.......");

    }
}
