package com.jw.stack;

public interface IStack {

    void push(int data);
    int pop() throws Exception;
    int top() throws Exception;
    int size();
    Boolean isEmpty();
    Boolean isFull();
    void clear();
}
