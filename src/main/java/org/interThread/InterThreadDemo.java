package org.interThread;

public class InterThreadDemo {
    //on calling wait method on thread, that thread IMMEDIATELY release lock of thay object on WHICH WAIT
    // get called
    // and then that thread goes into waiting state.
    public static void main(String[] args) throws InterruptedException {
        ThreadB tb=new ThreadB();
        tb.start();
        synchronized (tb){
            tb.wait();// current thread goes into waiting, will get notification once
            //other tb task or updation will complete and then this run.
        }
        System.out.println(tb.total);
    }
}
