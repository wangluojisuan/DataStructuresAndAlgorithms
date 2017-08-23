package com.jw.stack;

/**
 * 简单数组实现的栈
 */
public class ArrayStack {
    private int top = -1;
    private int capacity = 0;
    private int[] array = null;

    public ArrayStack(int capacity){
        this.capacity = capacity;
        this.array = new int[this.capacity];
    }
    public ArrayStack(){
        this(10);
    }

    /**
     * 弹出栈顶元素
     * @return
     */
    public int pop() throws Exception {
        if(this.isEmpty()){
            throw new Exception("栈已空");
        }

        int index = this.top;
        this.top--;
        return this.array[index];
    }

    /**
     * 压入元素
     * @param data
     */
    public void push(int data) throws Exception {
        if(this.isFull()){
            throw new Exception("栈已满");
        }

        this.top++;
        this.array[this.top] = data;
    }

    /**
     * 最后一个压入的元素
     * @return
     */
    public int top(){
        return this.array[this.top];
    }

    /**
     * 清空栈
     */
    public void clear(){
        this.top = -1;
    }

    /**
     * 栈的容量
     * @return
     */
    public int size(){
        return this.capacity;
    }

    /**
     * 是否空栈
     * @return
     */
    public Boolean isEmpty(){
        return (this.top < 0);
    }

    /**
     * 是否满栈
     * @return
     */
    public Boolean isFull(){
        return (this.top == (this.capacity-1));
    }

    /**
     * 输出栈内容
     * @return
     */
    @Override
    public String toString() {
        if(this.isEmpty()){
            return "";
        }

        StringBuilder strStack = new StringBuilder();
        for(int i= this.top;i >= 0;i--){
            strStack.append(this.array[i]);
            strStack.append("\nv\n");
        }
        strStack = strStack.delete(strStack.length()-2, strStack.length());

        return strStack.toString();
    }
}
