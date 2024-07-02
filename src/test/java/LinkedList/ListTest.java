package LinkedList;

import com.atbjtu.algorithm.linkedList.ListNode;
import org.junit.Test;

import java.util.LinkedList;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/25 22:38
 */
public class ListTest {
    @Test
    public void test() {
        ListNode node1 = new ListNode(5,null);
        ListNode node2 = new ListNode(4,node1);
        ListNode node3 = new ListNode(3,node2);
        ListNode node4 = new ListNode(2,node3);
        ListNode head = new ListNode(1,node4);
        ListNode p1 = head;
        ListNode p2 = head;
        System.out.println("原始链表：" + head);
        while(p2!=null && p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        ListNode middle = p1;

        ListNode n = null;
        while(middle!=null){
            ListNode o2 = middle.next;
            middle.next = n;
            n = middle;
            middle = o2;
        }
        System.out.println("当前链表：" + head);
        System.out.println("反转链表：" + n);


    }
}
