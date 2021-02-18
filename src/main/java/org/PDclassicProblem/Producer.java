package org.PDclassicProblem;

import java.util.LinkedList;
import java.util.Scanner;

public class Producer<T> {

    public static void produce(LinkedList queue, int data) {
        synchronized (queue) {
            //producing data to the queue
            queue.add(data);
            queue.notify();
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Consumer cons = new Consumer();
        LinkedList queue = cons.queue;
        produce(queue, scr.nextInt());


    }

}
