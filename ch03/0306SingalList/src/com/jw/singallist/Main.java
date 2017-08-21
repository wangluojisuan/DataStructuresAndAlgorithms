package com.jw.singallist;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("单链表的实现");
        SingalList singalList = new SingalList(new ListNode(10));
        singalList.insert(new ListNode(9), 0);
        singalList.insert(new ListNode(8), 0);
        singalList.insert(new ListNode(7), 0);
        System.out.println(singalList.getLength());
        System.out.println(singalList.toString());

        // 删除
        singalList.delete(10);
        System.out.println(singalList.toString() + ";Length=" + singalList.getLength());
        singalList.delete(10);
        System.out.println(singalList.toString() + ";Length=" + singalList.getLength());
        singalList.delete(0);
        System.out.println(singalList.toString() + ";Length=" + singalList.getLength());

        // 添加并清空
        singalList.insert(new ListNode(123), 0);
        singalList.insert(new ListNode(234), 0);
        System.out.println(singalList.toString() + ";Length=" + singalList.getLength());
        singalList.clear();
        System.out.println("清空");
        System.out.println(singalList.toString() + ";Length=" + singalList.getLength());
    }
}
