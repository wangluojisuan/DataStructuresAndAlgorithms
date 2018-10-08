package com.jw.singallist;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DoubleList list = new DoubleList();
        list.insert(new ListNode(1),10);
        list.insert(new ListNode(2),10);
        list.insert(new ListNode(3),10);
        list.insert(new ListNode(4),10);
        list.insert(new ListNode(5),0);

        System.out.println(list.toString() + ",Length=" + list.getLen());

        // 删除
        list.delete(10);
        System.out.println(list.toString() + ",Length=" + list.getLen());
    }
}
