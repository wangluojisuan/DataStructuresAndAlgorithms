package com.jw.singallist;

/**
 * 单链表
 */
public class SingalList {
    private ListNode head = new ListNode(0);
    private int len = 0;

    public SingalList(ListNode node) {
        this.head.setNext(node);
        this.len = 1;
    }

    public int getLength() {
        return this.len;
    }

    @Override
    public String toString() {
        StringBuilder strSingalList = new StringBuilder();
        assert this.head != null;
        ListNode currentNode = this.head;

        while (currentNode.getNext() != null) {
            strSingalList.append(currentNode.getData() + "->");
            currentNode = currentNode.getNext();
        }
        strSingalList = strSingalList.delete(strSingalList.length() - 2, strSingalList.length());

        return strSingalList.toString();
    }
}
