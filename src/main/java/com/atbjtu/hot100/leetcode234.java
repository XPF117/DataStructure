package com.atbjtu.hot100;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/7/2 09:21
 */
public class leetcode234 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(0,null);
        //ListNode node2 = new ListNode(2,node1);
        ListNode node3 = new ListNode(0,node1);

        ListNode head = new ListNode(1,node3);
        System.out.println(head);
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(head));

    }

}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("[");
        ListNode p = this;
        while (p != null) {
            sb.append(p.val);
            if (p.next != null) {
                sb.append(",");
            }
            p = p.next;
        }
        sb.append("]");
        return sb.toString();

    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode quick = head,slow = head;
        ListNode newHead = null;
        ListNode oldHead = head;
        while(quick!= null && quick.next!= null){
            quick = quick.next.next;
            slow = slow.next;
            oldHead.next = newHead;
            newHead = oldHead;
            oldHead = slow;
        }

        // 基数个节点
        if(quick!= null){
            newHead = newHead.next;
        }

        while(newHead != null){
            if(newHead.val != slow.val){
                return false;
            }
            newHead = newHead.next;
            slow = slow.next;
        }
        return true;
    }
}