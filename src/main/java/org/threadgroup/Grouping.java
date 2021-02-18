package org.threadgroup;

public class Grouping {
    public static void main(String[] args) {
        //this thread belong to main thread group as it is created by main thread which present in
        //main thread group
        ThreadGroup g1=new ThreadGroup("firstGroup");
        System.out.println(g1.getName());
        //this thread present in firstgroup
        ThreadGroup g2=new ThreadGroup(g1,"secondGroup");
        System.out.println(g2.getName());

    }
}
