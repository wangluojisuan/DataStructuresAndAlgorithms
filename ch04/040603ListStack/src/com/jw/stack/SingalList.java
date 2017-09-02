package com.jw.stack;

public class SingalList {
    private ListNode head = new ListNode(0);

    public void insert(ListNode node){
        node.setNext(this.head.getNext());
        this.head.setNext(node);
        this.head.setData(this.head.getData()+1);
    }

    public ListNode delete(){
        if(this.head.getNext() == null){
            this.head.setData(0);
            return null;
        }

        ListNode tempNode = this.head.getNext();
        this.head.setNext(tempNode.getNext());
        this.head.setData(this.head.getData()-1);
        tempNode.setNext(null);
        return tempNode;
    }

    public int getLength(){
        return this.head.getData();
    }

    public ListNode getHead(){
        return this.head;
    }

    public void clear(){
        this.head.setData(0);
        this.head.setNext(null);
    }
}
