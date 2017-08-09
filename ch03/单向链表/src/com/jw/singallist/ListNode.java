package com.jw.singallist;

/**
 * 单向链表的节点
 */
public class ListNode {
    private int data;
    private ListNode next;

    /**
     * 构造函数
     *
     * @param data 参数
     * @author wangluojisuan
     */
    public ListNode(int data) {
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setNext(ListNode node) {
        this.next = node;
    }

    public ListNode getNext() {
        return next;
    }
}
