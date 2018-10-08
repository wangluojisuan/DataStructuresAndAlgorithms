package com.jw.stack;

import javax.swing.text.StyledEditorKit;

public class ListStack implements IStack {
    private SingalList list = new SingalList();

    public int pop() throws Exception {
        if(this.isEmpty()){
            throw new Exception("栈已为空，不能再次弹出栈顶元素");
        }

        ListNode tempNode = this.list.delete();
        assert tempNode != null:"数据产生问题，isEmpty没有规避所有问题";
        if(tempNode == null){
            throw new Exception("保存栈的数据空间产生错误，请检查");
        }

        return tempNode.getData();
    }

    public void push(int data){
        ListNode node = new ListNode(data);
        list.insert(node);
    }

    public int size(){
        return this.list.getLength();
    }

    public int top() throws Exception {
        if(this.isEmpty()){
            throw  new Exception("栈已为空，不能再次获取栈顶元素");
        }

        return this.list.getHead().getNext().getData();
    }

    public Boolean isEmpty(){
        return ((this.list.getHead().getNext()==null)||(this.list.getHead().getData()==0));
    }

    public Boolean isFull(){
        // 满不满只与内存有关，基本不会产生满的问题。
        if(Runtime.getRuntime().freeMemory()>32) {
            // 获取剩余的内存，32个字节以上，应该可以再分配内存
            return false;
        }else {
            return true;
        }
    }

    public void clear(){
        this.list.clear();
    }
}
