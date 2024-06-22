package com.atbjtu.algorithm.linkedList;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/20 16:24
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(){}

    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

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
