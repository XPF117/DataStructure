package com.atbjtu.dataStructure.arrays.linkedList;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/13 22:52
 */
public class SinglyLinkedListSentinel implements Iterable<Integer> {
    private Node head = new Node(666, null);  // 哨兵节点

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = head.next;
            @Override
            public boolean hasNext() {
                return p!=null;
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
        int value;
        Node next;

        public Node(int value , Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // 新增节点，放到连标头部
    public void addFirst(int value){  // 链表头也存值
        // 链表为空
        // head = new Node(value,null);
        // 链表非空
        add(0,value);
    }

    public void loop1(Consumer<Integer> consumer){
        Node p = head.next;
        while(p!= null) {
            consumer.accept(p.value);
            p = p.next;
        }
    }

    public void loop2(Consumer<Integer> consumer){
        for(Node p = head.next; p!= null; p = p.next){
            consumer.accept(p.value);
        }
    }

    private Node findLast(){
        Node node = head;
        while(node.next!= null){
            node = node.next;
        }
        return node;
    }

    // 在尾部添加节点
    public void addLast(int value){
        Node last = findLast();// 找到尾节点，如果链表为空，last为哨兵节点
        last.next = new Node(value, null);

    }
    // 根据索引找节点，内部用
    private Node findNode(int index){
        int i = -1;
        for(Node p = head; p!= null; p = p.next){
            if(i == index){
                return p;
            }
            i++;
        }
        return null;
    }

    // 根据索引寻找节点，外部用
    public int get(int index) {
        Node node = findNode(index);
        if (node == null) {
            throw getIllegalArgumentException(index);
        }
        return node.value;
    }

    private static IllegalArgumentException getIllegalArgumentException(int index) {
        return new IllegalArgumentException(
                String.format("Index [%d] is illegal!", index));
    }

    // 根据索引插入新节点

    public void add(int index, int value) {

        Node node = findNode(index-1);  // 先找到上一个节点
        if(node == null){
            throw getIllegalArgumentException(index);
        }
        node.next = new Node(value, node.next);
    }

    // 删除第一个节点
    public void removeFirst(){
        remove(0);
    }

    // 根据索引删除节点
    public void remove(int index){
        Node nodePre = findNode(index-1);
        if(nodePre == null){
            throw getIllegalArgumentException(index);
        }
        if(nodePre.next == null){
            throw getIllegalArgumentException(index);
        }
        nodePre.next = nodePre.next.next;  // 跳过当前节点
    }
}
