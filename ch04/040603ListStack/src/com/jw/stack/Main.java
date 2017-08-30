package com.jw.stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("链表实现的栈测试：");
        System.out.println("---空栈---");
        ListStack stack = new ListStack();
        System.out.println("当前栈是否空："+stack.isEmpty());
        System.out.println("当前栈是否满:"+stack.isFull());
        try {
            System.out.println("当前栈顶元素：" + stack.top());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("---添加元素---");
        stack.push(10);
        stack.push(11);
        System.out.println("当前栈的大小："+stack.size());
        System.out.println("当前栈是否空："+stack.isEmpty());
        System.out.println("当前栈是否满:"+stack.isFull());
        try {
            System.out.println("当前栈顶元素：" + stack.top());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        for (int i=0;i<10000;i++){
            stack.push(i);
        }
        System.out.println("当前栈的大小："+stack.size());
        System.out.println("当前栈是否空："+stack.isEmpty());
        System.out.println("当前栈是否满:"+stack.isFull());
        try {
            System.out.println("当前栈顶元素：" + stack.top());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("---清空栈---");
        stack.clear();
        System.out.println("当前栈的大小："+stack.size());
        System.out.println("当前栈是否空："+stack.isEmpty());
        System.out.println("当前栈是否满:"+stack.isFull());
        try {
            System.out.println("当前栈顶元素：" + stack.top());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
