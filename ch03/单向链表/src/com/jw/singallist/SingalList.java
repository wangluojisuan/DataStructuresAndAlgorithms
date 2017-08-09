package com.jw.singallist;

/**
 * 单向链表的实际管理类，提供了单向链表的各种操作方法
 */
public class SingalList {
    private ListNode head = new ListNode(0);
    private int listLen = 0;

    public SingalList(ListNode node){
        this.head.setNext(node);
        this.listLen++;
    }
    public int getListLen(){
        return this.listLen;
    }

    @Override
    public String toString() {
        ListNode currentNode = this.head.getNext();
        StringBuilder strBuilder = new StringBuilder();

        do {
            strBuilder.append(currentNode.getData()+" ");
            currentNode = currentNode.getNext();
        }while (currentNode!=null);

        return strBuilder.toString();
    }

    public void Insert(ListNode node,int position){

    }
}
