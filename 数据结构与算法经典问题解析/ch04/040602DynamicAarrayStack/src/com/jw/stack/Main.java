package com.jw.stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("动态数组实现的栈");
        DynamicArrayStack stack = new DynamicArrayStack();
        // 压入数据
        for(int i=0;i<100; i++){
            stack.push(i);
        }
        stack.push(100);
        stack.push(123);
        System.out.println("栈大小:"+stack.size());
        System.out.println("栈顶数据："+stack.top());
    }
}
