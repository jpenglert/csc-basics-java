package com.jenglert.csc.datastructure;

/**
 * Adapted from "Cracking the Coding Interview, 6th Edition" p649 for use in practise problems
 */
public class LinkedListNode {
    public LinkedListNode next;
    public LinkedListNode prev;
    public int data;

    public LinkedListNode(int d) {
        data = d;
    }

    public void setNext(LinkedListNode n) {
        next = n;

        if (n != null && n.prev != this) {
            n.setPrevious(this);
        }
    }

    public void setPrevious(LinkedListNode p) {
        prev = p;
        if (p != null && p.next != this) {
            p.setNext(this);
        }
    }

    @Override
    public String toString() {
        return "data=" + data;
    }
}
