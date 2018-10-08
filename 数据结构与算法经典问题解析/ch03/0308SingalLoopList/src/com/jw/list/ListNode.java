package com.jw.list;

/**
 * 节点
 */
public class ListNode {
    private int data = 0;
    private ListNode next = null;

    public ListNode(int data, ListNode node){
        this.data = data;
        this.next = node;
    }

    public ListNode(int data){
        this(data, null);
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }

    public void setNext(ListNode next){
        this.next = next;
    }

    public ListNode getNext(){
        return this.next;
    }
}
