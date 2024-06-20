package com.atbjtu.dataStructure.arrays.linkedList;

import java.util.Iterator;

/**
 * @author: PengfeiXi
 * @description: 双向环形连链表
 * @date: 2024/6/14 13:17
 */
public class RingDoublyLinkedListAddFirst implements Iterable<Integer> {
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node head = sentinel.next;
            @Override
            public boolean hasNext() {
                return head != sentinel;
            }

            @Override
            public Integer next() {
                int value = head.value;
                head = head.next;
                return value;
            }
        };
    }

    private static class Node{   // 内部类
        Node prev;
        int value;
        Node next;

        public Node(Node prev , int value , Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }
    private Node sentinel = new Node(null, -1, null);   //哨兵节点

    //初始化环形链表
    public RingDoublyLinkedListAddFirst() {
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }

    // 向链表头部添加元素
    public void addFirst(int value) {
        Node head = sentinel;
        Node next = sentinel.next;
        Node newNode = new Node(head,value,next);
        next.prev = newNode;
        head.next = newNode;
    }
    // 向链表尾部添加元素
    public void addLast(int value) {
        Node tail = sentinel.prev;
        Node head = sentinel;
        Node newNode = new Node(tail,value,head);
        tail.next = newNode;
        head.prev = newNode;
    }

    // 删除链表头部元素
    public void removeFirst() {
        Node head = sentinel;
        Node removed = head.next;
        if (removed == sentinel) {
            throw getIllegalArgumentException(0);
        }
        Node next = removed.next;
        head.next = next;
        next.prev = head;
    }
    // 删除尾部元素
    public void removeLast() {
        Node removed = sentinel.prev;
        if (removed == sentinel) {
            throw getIllegalArgumentException(0);
        }
        Node prev = removed.prev;
        Node next = sentinel;
        prev.next = next;
        next.prev = prev;

    }

    // 根据值删除节点
    public void removeByValue(int value) {
        Node node = getNode(value);
        if (node == null) {
            return;  // 不存在该值
        }
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    // 根据值获取节点
    public Node getNode(int value) {
        Node head = sentinel.next;
        while (head!= sentinel) {
            if (head.value == value) {
                return head;
            }
            head = head.next;
        }


        return null;
    }


    private static IllegalArgumentException getIllegalArgumentException(int index) {
        return new IllegalArgumentException(
                String.format("Index [%d] is illegal!", index));
    }

}
