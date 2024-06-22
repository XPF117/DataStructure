package com.atbjtu.algorithm.linkedList;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/20 16:52
 */
public class Leetcode206 {
    // 链表反转：
    // 官方题解1:头插法，构造一个新的链表，把就链表中的元素依次取出来，插入到新链表的头部
    public ListNode reverseList1(ListNode head) {
        ListNode newHead = null;
        ListNode p = head;
        while(p != null){
            newHead = new ListNode(p.val, newHead);
            p = p.next;
        }
        return newHead;
    }

    // 链表反转：自己写的
    public ListNode reverseListMy(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode p = null,q = head,next = q.next;
        while(next != null){
            q.next = p;
            p = q;
            q = next;
            next = next.next;
        }
        q.next = p;
        return q;
    }
}
