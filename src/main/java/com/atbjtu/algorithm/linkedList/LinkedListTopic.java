package com.atbjtu.algorithm.linkedList;

// import static com.atbjtu.algorithm.linkedList.Leetcode206.reverseList1;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/20 16:24
 */
public class LinkedListTopic {
    public static void main(String[] args){
        Leetcode206 method = new Leetcode206();
        ListNode o5 = new ListNode( 5, null);
        ListNode o4 = new ListNode(  4,o5);
        ListNode o3 = new ListNode( 3,o4);
        ListNode o2 = new ListNode(2,o3);
        ListNode o1 = new ListNode( 1,o2);
        System.out.println(o1);
        ListNode n1 = method.reverseList1(o1);
        System.out.println(n1);
    }


}
