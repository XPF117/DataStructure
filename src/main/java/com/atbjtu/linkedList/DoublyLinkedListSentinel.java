package com.atbjtu.linkedList;

import java.util.Iterator;

/**
 * @author: PengfeiXi
 * @description: 戴哨兵的双向链表
 * @date: 2024/6/14 11:04
 */
public class DoublyLinkedListSentinel implements Iterable<Integer> {
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = head.next;
            @Override
            public boolean hasNext() {
                return p != tail;
            }

            @Override
            public Integer next() {
                int value = p.value;
                p = p.next;
                return value;
            }
        };
    }

    private static class Node{   // 内部类
        Node prev;
        int value;
        Node next;

        public Node(Node prev ,int value , Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }
    private Node head;
    private Node tail;

    public DoublyLinkedListSentinel() {
        head = new Node(null, 666, null);
        tail = new Node(null, 888, null);
        head.next = tail;
        tail.prev = head;
    }

    // 根据索引获取节点
    private Node findNode(int index){
        int i = -1;
        Node node = head;
        while(node != tail){
            if(i == index){
                return node;
            }
            node = node.next;
            i++;
        }
        return null;
    }
    // 插入节点
    public void insert(int index, int value) {
        Node prevNode = findNode(index - 1);
        if (prevNode == null){
            throw  getIllegalArgumentException(index);
        }
        Node nextNode = prevNode.next;
        Node newNode = new Node(prevNode, value, nextNode);
        prevNode.next = newNode;
        nextNode.prev = newNode;

    }

    public void addFirst(int value){
        insert(0,value);
    }

    // 按索引删除节点
    public void remove(int index) {
        Node nodePre = findNode(index-1);
        if (nodePre == null){
            throw  getIllegalArgumentException(index);
        }
        if(nodePre.next == tail){
            throw  getIllegalArgumentException(index);
        }
        Node nodeNext = nodePre.next.next;
        nodePre.next = nodeNext;
        nodeNext.prev = nodePre;
    }

    public void removeFirst(){
        remove(0);
    }

    public void removeLast(){
        Node deleteNode = tail.prev;
        if(deleteNode == head){
            throw  new IllegalArgumentException("List is empty!");
        }
        Node prevNode = deleteNode.prev;
        tail.prev = prevNode;
        prevNode.next = tail;
    }

    public void addLast(int value){
        Node newNode = new Node(tail.prev, value, tail);
        tail.prev.next = newNode;
        tail.prev = newNode;
    }


    private static IllegalArgumentException getIllegalArgumentException(int index) {
        return new IllegalArgumentException(
                String.format("Index [%d] is illegal!", index));
    }
}
