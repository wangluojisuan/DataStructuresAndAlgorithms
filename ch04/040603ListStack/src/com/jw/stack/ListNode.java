package com.jw.stack;

public class ListNode {
    private int data;
    private ListNode next = null;

    public ListNode(int data, ListNode next){
        this.data = data;
        this.next = next;
    }
    public ListNode(int data){
        this(data, null);
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next){
        this.next = next;
    }

    public int getData(){
        return this.data;
    }

    public void setData(int data){
        this.data = data;
    }
}
