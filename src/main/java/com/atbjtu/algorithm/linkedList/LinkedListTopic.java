package com.atbjtu.algorithm.linkedList;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/20 16:24
 */
public class LinkedListTopic {
    // 自己写的
    public ListNode reverseList1(ListNode head) {
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
