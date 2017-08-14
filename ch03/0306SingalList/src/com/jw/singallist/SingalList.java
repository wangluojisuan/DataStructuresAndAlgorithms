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

    /**
     * 获取链表的长度
     *
     * @return
     */
    public int getLength() {
        return this.len;
    }

    /**
     * 插入节点
     * @param node 节点
     * @param pos 位置
     */
    public void insert(ListNode node, int pos) {
        if (pos < this.len) {
            ListNode currentNode = this.head;
            for (int i = 0; i < pos; i++) {
                currentNode = currentNode.getNext();
            }
            node.setNext(currentNode.getNext());
            currentNode.setNext(node);
            this.len += 1;
        } else {
            ListNode currentNode = this.head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            node.setNext(null);
            currentNode.setNext(node);
        }
    }

    /**
     * 输出链表的内容
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder strSingalList = new StringBuilder();
        assert this.head != null;
        ListNode currentNode = this.head;

        while (currentNode.getNext() != null) {
            strSingalList.append(currentNode.getNext().getData() + "->");
            currentNode = currentNode.getNext();
        }
        strSingalList = strSingalList.delete(strSingalList.length() - 2, strSingalList.length());

        return strSingalList.toString();
    }
}
