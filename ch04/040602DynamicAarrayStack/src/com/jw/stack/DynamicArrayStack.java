package com.jw.stack;

import java.util.Arrays;

/**
 * 动态数组实现的栈，栈满之后数组容量增大一倍，
 * 原有数据复制到新数组中去。
 */
public class DynamicArrayStack {
    private int capacity = 1;
    private int[] array = null;
    private int top = -1;

    public DynamicArrayStack(){
        this.capacity = 1;
        this.array = new int[this.capacity];
    }

    // 方法

    /**
     * 压入元素
     * @param data
     */
    public void push(int data){
        if((this.top+1) < this.capacity){
            this.top++;
            this.array[this.top] = data;
            return;
        }

        this.capacity *= 2;
        int[] temp = this.array;
        this.array = new int[this.capacity];
        for(int i=0;i<temp.length;i++){
            this.array[i] = temp[i];
        }
        this.top++;
        this.array[this.top] = data;

        /*
        // 另一种写法
        this.array = Arrays.copyOf(this.array, this.array.length*2);
        this.capacity = this.array.length;
        this.top++;
        this.array[this.top] = data;
        */
    }

    /**
     * 弹出元素
     * @return
     */
    public int pop() throws Exception {
        if(this.isEmpty()){
            throw  new Exception("当前栈为空，不可以弹出元素");
        }

        if((this.top-1)<(this.capacity/2)){
            int data = this.array[top];
            this.top--;
            this.array = Arrays.copyOf(this.array, this.array.length/2);
            this.capacity = this.array.length;
            return data;
        }

        return this.array[this.top--];
    }

    /**
     * 最后压入的元素
     * @return
     */
    public int top(){
        return this.array[this.top];
    }

    /**
     * 栈大小
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
        return (this.top >= Integer.MAX_VALUE);
    }

    /**
     * 清空栈
     */
    public void clear(){
        this.capacity = 1;
        this.array = new int[this.capacity];
        this.top = -1;
    }
}
