package com.atbjtu.algorithm.linkedList;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/23 22:54
 */
public class Leetcode19 {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5,null);
//        ListNode node4 = new ListNode(4,node5);
//        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node5);
        ListNode head = new ListNode(1,node2);
        Solution solution = new Solution();
        ListNode newHead = solution.removeNthFromEnd(head,2);
        ListNode p = newHead;
        while(p != null){
            System.out.print(p.val + " ");

            p = p.next;
        }
        System.out.println();

    }
}
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int [] endIndex = new int[1];
        endIndex[0] = 0;
        return reverseRemoveNthFromEnd(head,n,endIndex);
    }
    public ListNode reverseRemoveNthFromEnd(ListNode head, int n,int []endIndex){
        if(head == null){
            return null;
        }
        ListNode p = reverseRemoveNthFromEnd(head.next,n,endIndex);
        endIndex[0]++;
        if(endIndex[0] == n){
            return p;
        }else{
            head.next = p;
            return head;
        }

    }
}