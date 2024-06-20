package com.atbjtu.dataStructure.arrays;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author: PengfeiXi
 * @description: 动态数组自实现
 * @date: 2024/6/11 13:25
 */
public class DynamicArray implements Iterable<Integer> {

    private int size;   // 数组的实际大小，初始值为0
    private int capacity = 8;   // 数组的容量
    private int[] array = {};

    public DynamicArray() {
        size = 0;
    }

    // 向数组末尾添加元素
    public void addLast(int value) {
        add(size,value);
    }

    public void add(int index,int value) {
        checkAndGrow();
        if(index >= 0 && index <= size) {
            System.arraycopy(array, index, array, index + 1, size - index);
        }
        array[index] = value;
        size++;

    }

    private void checkAndGrow() {
        // 懒惰初始化
        if(size == 0){
            array = new int[capacity];
        }
        // 先判断容量是否足够
        else if(size == capacity){  // 数组已经满了
            capacity += capacity >> 1;
            int [] newArray = new int[capacity];
            System.arraycopy(array,0,newArray,0,size);
            array = newArray;
        }
    }

    public void foreach(Consumer<Integer> consumer){
        for(int i = 0; i < size; i++){
            consumer.accept(array[i]);
        }
    }

    public int remove(int index){
        int removed = array[index];
        if(index < size - 1){ // 如果移除的不是最后一个元素
            System.arraycopy(array, index + 1, array, index, size - index - 1);
        }
        size --;
        return removed;
    }

    @Override
    public String toString() {
        String ans = "[";
        for(int i = 0; i < size; i++) {
            ans += array[i] + ",";
        }
        ans = ans.substring(0,ans.length()-1) + "]";
        return ans;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return i <size;
            }

            @Override
            public Integer next() {
                return array[i++];
            }
        };
    }
}
