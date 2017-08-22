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

    /**
     * 输出内容
     * @return
     */
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

    /**
     * 删除指定位置的节点
     * @param pos
     * @return
     */
    public Boolean delete(int pos){
        if(this.head.getNext() == null){
            System.out.println("链表已为空，不能继续删除");
            return false;
        }

        if (pos <= 0){
            ListNode deleteNode = this.head.getNext();
            this.head.setNext(deleteNode.getNext());
            deleteNode.getNext().setPrevious(this.head);
            deleteNode.setPrevious(null);
            deleteNode.setNext(null);       // 垃圾回收器会处理一切
            this.len -= 1;
            return true;
        }

        ListNode tempNode = this.head;
        int index = 0;
        while (tempNode.getNext() != null){
            tempNode = tempNode.getNext();
            if(index >= pos){
                break;
            }
            index++;
        }
        tempNode.getPrevious().setNext(tempNode.getNext());
        if (tempNode.getNext() != null) {
            tempNode.getNext().setPrevious(tempNode.getPrevious());
        }
        tempNode.setPrevious(null);
        tempNode.setNext(null);
        this.len -= 1;
        return true;
    }
}
