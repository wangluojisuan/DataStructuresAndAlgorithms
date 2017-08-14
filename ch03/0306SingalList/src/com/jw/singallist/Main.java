package com.jw.singallist;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("单链表的实现");
        SingalList singalList = new SingalList(new ListNode(10));
        singalList.insert(new ListNode(9),0);
        singalList.insert(new ListNode(8),0);
        singalList.insert(new ListNode(7),0);
        System.out.println(singalList.getLength());
        System.out.println(singalList.toString());
    }
}
