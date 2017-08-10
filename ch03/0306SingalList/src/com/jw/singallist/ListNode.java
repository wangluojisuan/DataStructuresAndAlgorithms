package com.jw.singallist;

/**
 * 单链表的节点
 */
public class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data){
        this.data = data;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getData(){
        return this.data;
    }

    public ListNode getNext() {
        return this.next;
    }
}
