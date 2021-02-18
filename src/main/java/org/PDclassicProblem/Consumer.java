package org.PDclassicProblem;

import java.util.LinkedList;

//consumer thread
public class Consumer<T> {

     LinkedList<T> queue;
    int capacity = 5;

    public void consume() throws InterruptedException {
        synchronized (queue) {
            if (queue.isEmpty()) {
                System.out.println("queue is empty. Wait untill producer put some data in queue");
                queue.wait();
            }
            else{
                T out=queue.remove(0);
                System.out.println(out);
            }

        }
    }
}
