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
     * @return 链表的内容
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

    /**
     * 删除指定位置的链表节点
     * @param pos 位置
     * @return  执行成功或失败
     */
    public Boolean delete(int pos){
        if(this.len<=0){
            System.out.println("空链表，不能继续删除");
            return false;
        }

        if(pos<=0){
            this.head.setNext(this.head.getNext().getNext());   // 获取下一个节点的下一个，由于Java自动管理内存，所以不需要释放内存
            this.len -= 1;
            return true;
        }else if(pos>=(this.len-1)){
            ListNode currentNode = this.head;
            while (currentNode.getNext().getNext() != null){
               currentNode.setNext(currentNode.getNext());
            }
            currentNode.setNext(null);
            this.len -= 1;
            return true;
        }else {
            ListNode currentNode = this.head;
            int index = 0;
            while (currentNode.getNext().getNext() != null){
                currentNode.setNext(currentNode.getNext());
                index++;
                if(index>=pos){
                    break;
                }
            }
            currentNode.setNext(currentNode.getNext().getNext());
            this.len -= 1;
            return true;
        }
    }
}
