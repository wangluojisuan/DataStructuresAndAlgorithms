package com.jw.stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayStack stack = new ArrayStack();
        System.out.println("Capacity=" + stack.size());

        try{
            stack.push(0);
            stack.push(1);

            System.out.println("栈内容：\n" + stack.toString());

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }catch (Exception ex){
            System.out.println("问题：" + ex.getMessage());
        }
    }
}
