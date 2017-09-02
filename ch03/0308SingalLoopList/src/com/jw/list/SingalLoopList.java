package com.jw.list;

/**
 * 单向循环链表
 */
public class SingalLoopList implements IList {
    // 使用head中的data保存链表的长度
    private ListNode head = new ListNode(0);

    /**
     * 构造函数
     */
    public SingalLoopList(){
        this.head.setNext(null);
    }

    /**
     * 获取链表长度
     * @return 链表长度
     */
    public int getLength(){
        return this.head.getData();
    }

    /**
     * 根据位置插入节点
     * @param node 节点
     * @param pos 位置
     */
    public void insert(ListNode node, int pos){
        // 本方法基于0-长度-超过长度 的范围界定。
        // 输入的位置<=0则插入头部；
        // 位置在0<pos<链表长度的情况下，则在链表相对应的位置插入节点
        // >=链表长度的情况下，则一律在链表的尾部插入节点
        if(pos<=0){
            // 头部
            ListNode lastNode = this.getNode(-1);
            node.setNext(this.head.getNext());
            this.head.setNext(node);
            if(lastNode == null){
                node.setNext(node);
            }else {
                lastNode.setNext(node);
            }
            this.head.setData(this.head.getData()+1);
        }else if(pos<this.head.getData()){
            ListNode tempNode = this.getNode(pos-1);
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
            this.head.setData(this.head.getData()+1);
        }else {
            node.setNext(this.head.getNext());
            this.head.setNext(node);
            ListNode lastNode = this.getNode(-1);
            if(lastNode == null){
                node.setNext(node);
            }else {
                lastNode.setNext(node);
            }
            this.head.setData(this.head.getData()+1);
        }

    }

    /**
     * 根据位置获取节点
     * 支持负数，比如-1表示链表最末尾一个元素，-2表示链表倒数第二个元素，依次类推
     * 支持位置数字>链表长度的情况，在此情况下，到达链表尾时继续向前并继续计数。
     * @param pos 位置
     * @return 节点
     */
    private ListNode getNode(int pos){
        if((this.head.getData() == 0)||(this.head.getNext() == null)){
            return null;
        }

        int len = this.head.getData();  // 链表长度
        if(len == 1){
            // 只有一个的话，似乎无论什么情况都是这个
            return this.head.getNext();
        }

        int temp = Math.abs(pos)%len;   // 避免位置数据大于链表长度的情况
        int index = pos>0?temp:len-temp;    // 获取实际位置，pos为负的情况下倒序
        ListNode tempNode = this.head;
        for(int i=0;i<=index;i++){
            tempNode = tempNode.getNext();
        }

        return tempNode;
    }

    @Override
    public String toString() {
        int len = this.head.getData();
        if((len == 0)||(this.head.getNext() == null)){
            return "";
        }

        StringBuilder strList = new StringBuilder();
        ListNode tempNode = this.head.getNext();
        for (int i=0;i < len;i++){
            strList.append(tempNode.getData());
            tempNode = tempNode.getNext();
            strList.append("->");
        }

        strList = strList.delete(strList.length()-2, strList.length());
        return strList.toString();
    }

    public void delete(int pos){
        // 由于这是循环链表，所以要分1个元素、2个、3个及以上的情况
        if((this.head.getNext() == null)||(this.head.getData() == 0)){
            return;
        }

        // 1个的直接删除
        if(this.head.getData() == 1){
            this.head.setNext(null);
            this.head.setData(0);
            return;
        }
        // 2个删除一个，另一个需要自己指向自己
        if(this.head.getData() == 2){
            ListNode tempNode = this.getNode(pos-1);
            tempNode.setNext(tempNode);
            this.head.setNext(tempNode);
            this.head.setData(1);
            return;
        }

        // 3个及以上，除了删除指定的那个，还要把前后连接起来，
        // 同时还要考虑被删除的那个是不是被链表头指向的第一个节点，这种情况要单独考虑
        ListNode tempPreNode = this.getNode(pos-1);
        ListNode tempNextNode = this.getNode(pos+1);
        int len = this.head.getData();
        int mod = Math.abs(pos)%len;
        if(mod == 0){
            this.head.setNext(tempNextNode);
        }
        tempPreNode.setNext(tempNextNode);
        this.head.setData(this.head.getData()-1);
    }

    public void clear(){
        this.head.setData(0);
        this.head.setNext(null);
    }
}
