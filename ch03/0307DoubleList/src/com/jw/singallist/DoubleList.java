package com.jw.singallist;

/**
 * 双向链表
 */
public class DoubleList {
    private ListNode head = new ListNode(0);
    private int len = 0;

    public DoubleList(ListNode node){
        if(node != null){
            this.head.setNext(node);
            this.len += 1;
        }
    }

    public DoubleList(){
        this(null);
    }

    /**
     * 获取链表长度
     * @return
     */
    public int getLen(){
        return this.len;
    }

    /**
     * 插入节点
     * @param node
     * @param pos
     */
    public void insert(ListNode node, int pos){
        if(pos<=0){
            ListNode tempNode = this.head.getNext();
            if (tempNode != null){
                tempNode.setPrevious(node);
            }
            node.setPrevious(this.head);
            node.setNext(tempNode);
            this.head.setNext(node);
            this.len += 1;
            return;
        }

        if(pos < this.len){
            ListNode currentNode = this.head;
            int index = 0;
            while (currentNode.getNext() != null){
                if (index <= pos){
                    break;
                }
                currentNode = currentNode.getNext();
                index++;
            }
            node.setNext(currentNode.getNext());
            node.setPrevious(currentNode);
            currentNode.getNext().setPrevious(node);
            currentNode.setNext(node);
            this.len += 1;
            return;
        }

        if(pos >= this.len){
            ListNode currentNode = this.head;
            while (currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            node.setPrevious(currentNode);
            node.setNext(null);
            currentNode.setNext(node);
            this.len += 1;
            return;
        }
    }

    @Override
    public String toString() {
        if(this.head.getNext() == null){
            return "";
        }

        ListNode node = this.head.getNext();
        StringBuilder strList = new StringBuilder();
        do{
            strList.append(node.getData());
            strList.append("->");
            node = node.getNext();
        }while (node.getNext() != null);
        strList = strList.delete(strList.length()-2, strList.length());

        return strList.toString();
    }
}
