package org.PDclassicProblem;

import java.util.ArrayList;
import java.util.List;

public class ProduceConsume<T> {


    public static void main(String[] args) throws InterruptedException {
        List<Integer> taskQueue = new ArrayList<Integer>();
        int MAX_CAPACITY = 5;
        Producer pt = new Producer(taskQueue,MAX_CAPACITY);
        Consumer ct = new Consumer(taskQueue);
        pt.start();
        ct.start();
    }
}
