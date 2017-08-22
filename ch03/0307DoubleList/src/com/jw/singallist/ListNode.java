package com.jw.singallist;

/**
 * 链表节点
 */
public class ListNode {
    private int data = 0;
    private ListNode next = null;
    private ListNode previous = null;

    public ListNode(int data, ListNode next, ListNode pre){
        this.data = data;
        this.next = next;
        this.previous = pre;
    }

    public ListNode(int data){
        this(data, null, null);
    }

    /**
     * 获取数据
     * @return
     */
    public int getData(){
        return this.data;
    }

    /**
     * 设置数据
     * @param data
     */
    public void setData(int data){
        this.data = data;
    }

    /**
     * 获取下一个
     * @return
     */
    public ListNode getNext() {
        return next;
    }

    /**
     * 设置下一个节点
     * @param next
     */
    public void setNext(ListNode next){
        this.next = next;
    }

    /**
     * 获取上一个节点
     * @return
     */
    public ListNode getPrevious() {
        return previous;
    }

    /**
     * 设置上一个节点
     * @param previous
     */
    public void setPrevious(ListNode previous){
        this.previous = previous;
    }
}
