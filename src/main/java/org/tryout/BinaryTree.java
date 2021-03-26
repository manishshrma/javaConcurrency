package org.tryout;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//	 50 true 25 true 12 false false true 37 true 30 false false true 40 false
//	 false true 75 true 62 true 55 false false true 65 false false true 87
//	 false false
public class BinaryTree {

    class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root = null;

    public BinaryTree() {
        this.root = takeinput(new Scanner(System.in), false, null);
    }

    private Node takeinput(Scanner scr, boolean ilc, Node parent) {
        if (parent == null) {
            System.out.println("enter the dat for the root node");
        } else if (ilc == true) {
            System.out.println("enter the data for the left child");
        } else {
            System.out.println("enter the data for the right child");
        }

        Node child = new Node();
        int cdata = scr.nextInt();
        child.data = cdata;

        System.out.println("does it have a left child");
        boolean hlc = scr.nextBoolean();
        if (hlc) {
            child.left = takeinput(scr, true, child);
        }
        System.out.println("does it have right child");
        boolean hrc = scr.nextBoolean();
        if (hrc) {
            child.right = takeinput(scr, true, child);
        }
        return child;

    }

    public void Height() {
        int ht = height(this.root);
        System.out.println("height is " + ht);
    }

    private int height(Node node) {
        if (node.left == null || node.right == null)
            return 1;
        int lh = height(node.left);
        int rh = height(node.right);
        return lh > rh ? lh + 1 : rh + 1;
    }

    public void max() {
        int max = maxnode(this.root);
        System.out.println("Max node is " + max);
    }

    private int maxnode(Node node) {

        if (node == null)
            return Integer.MIN_VALUE;
        if (node.left == null && node.right == null)
            return node.data;

        int lmax = maxnode(node.left);
        int rmax = maxnode(node.right);
        return Math.max(Math.max(lmax, rmax), node.data);
    }

    public void nodeToroot(int data) {
      List<Integer> res=  nodeToRootpath(this.root, data);
        System.out.println(res);
    }

    private List<Integer> nodeToRootpath(Node node, int data) {
        if (node == null) {
            return new ArrayList<>();
        }
        if (node.data == data) {
            List<Integer> list=new ArrayList<Integer>();
            list.add(node.data);
            return list;

        }
      List<Integer> path= nodeToRootpath(node.left, data);
        if(path.size()>0)
        {
            path.add(node.data);
            return path;
        }
        List<Integer> path2= nodeToRootpath(node.right, data);
        if(path2.size()>0)
        {
            path2.add(node.data);

            return path2;
        }
        return path2;
    }
    
    public void removeleaf(){
        removeleafBt(this.root);

    }

    private Node removeleafBt(Node node) {
        if(node==null){
            return null;
        }
        if(node.left==null&&node.right==null){
            return null;
        }
       node.left= removeleafBt(node.left);
       node.right= removeleafBt(node.right);

       return node;
    }
    public void removeonlychild(){
        removesinglechild(this.root);
    }

    private void removesinglechild(Node node) {

        if(node==null){
            return;
        }

        if(node.left==null&&node.right!=null){
            node.right=null;
            return;
        }
        if(node.right==null&&node.left!=null){
               node.left=null;
               return;
        }

        removesinglechild(node.left);
        removesinglechild(node.right);
        return;
    }


    public void display() {
        displaybt(this.root);
    }

    private void displaybt(Node node) {
        if (node == null) {
            return;
        }
        String str = node.left != null ? node.left.data + "<=" : ".";
        str += node.data + " ";
        str += node.right != null ? "=>" + node.right.data + "" : ".";
        System.out.println(str);
        displaybt(node.left);
        displaybt(node.right);
        return;

    }


    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.display();
        bt.Height();
        bt.max();
        bt.nodeToroot(55);
//        bt.removeleaf();
        bt.removeonlychild();
        bt.display();


    }

}
