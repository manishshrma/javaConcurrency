package org.tryout;

import java.util.stream.Stream;

public class LinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    int size = 0;

    public int size() {
        return this.size;
    }

    public void addfirst(int val) {
        Node node = new Node(val);
        node.next = this.head;
        this.head = node;
        this.size++;
    }

    public void addlast(int val) {
        Node node = new Node(val);
        Node prev = null;
        Node curr = this.head;

        if (this.head == null) {
            this.head = node;
            this.size++;
            return;
        }

//        for(curr=this.head;curr!=null;prev=curr,curr=curr.next){
//
//        }

        while (curr != null) {

            prev = curr;
            curr = curr.next;

        }

        prev.next = node;
        this.size++;
    }

    public void addatidx(int idx, int val) {

        if (idx == 0) {
            addfirst(val);
            return;
        }
        Node node = new Node(val);
        Node prev = null;
        Node curr = this.head;
        int i = 0;

        while (i < idx) {
            prev = curr;
            curr = curr.next;
            i++;
        }
        prev.next = node;
        node.next = curr;
        this.size++;

    }

    public void reverseRecursive() {
//      Node res=  reverse_recurrsion(this.head);
//        res.next=null;
        reverse_recurrsion2(this.head);
    }

    private void reverse_recurrsion2(Node node) {
        if(node.next==null){
            this.head=node;
            return;
        }
        reverse_recurrsion2(node.next);
        node.next.next=node;
        node.next=null;
        return;

    }

    private Node reverse_recurrsion(Node node) {

        if(node.next==null){
            this.head=node;
            return node;
        }

        Node temp = reverse_recurrsion(node.next);
        temp.next = node;
        return node;

    }

    public void removeKthfromlast(int k){
        removeKth(this.head,k);
    }

    private void removeKth(Node node,int k) {
        int i=0;
        Node first=node;
        Node second=node;
        if(k<this.size){
            System.out.println("invalid index for removal");
            return;
        }
        if(k==this.size){
            this.head=this.head.next;
            return;
        }
        while(i<k){
            second=second.next;
            i++;

        }
        while(second.next!=null){
            first=first.next;
            second=second.next;
        }
        first.next=first.next.next;
    }

    public void display() {
        for (Node node = this.head; node != null; node = node.next) {
            System.out.print(node.data + "->");
        }
        System.out.print(".");
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addfirst(10);
        l.addfirst(5);
        l.addfirst(4);
        l.addlast(20);
        l.addlast(30);
        l.addlast(40);
        l.addlast(50);
        l.addatidx(2, 100);
        l.display();
//        l.reverseRecursive();
        System.out.println("-----------");
        l.removeKthfromlast(8);
        l.display();
    }

}
