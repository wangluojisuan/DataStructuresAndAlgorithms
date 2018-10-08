package com.jw.list;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("循环链表测试：");
        SingalLoopList loopList = new SingalLoopList();
        System.out.println("---空链表：\n大小="+loopList.getLength()+";内容："+loopList.toString());

        // 头插入内容
        loopList.insert(new ListNode(10),0);
        loopList.insert(new ListNode(9),0);
        loopList.insert(new ListNode(8),0);
        loopList.insert(new ListNode(7),0);
        loopList.insert(new ListNode(6),0);
        System.out.println("---链表：\n大小="+loopList.getLength()+";内容："+loopList.toString());

        // 按位置插入内容
        loopList.insert(new ListNode(5),1);
        System.out.println("---链表：\n大小="+loopList.getLength()+";内容："+loopList.toString());

        // 删除
        loopList.delete(0);
        System.out.println("---删除链表0：\n大小="+loopList.getLength()+";内容："+loopList.toString());
        loopList.delete(1);
        System.out.println("---删除链表1：\n大小="+loopList.getLength()+";内容："+loopList.toString());
        loopList.delete(2);
        System.out.println("---删除链表2：\n大小="+loopList.getLength()+";内容："+loopList.toString());
        loopList.delete(3);
        System.out.println("---删除链表3：\n大小="+loopList.getLength()+";内容："+loopList.toString());
        loopList.delete(4);
        System.out.println("---删除链表4：\n大小="+loopList.getLength()+";内容："+loopList.toString());
    }
}
