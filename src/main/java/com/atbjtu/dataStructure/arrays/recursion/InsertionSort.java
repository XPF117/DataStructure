package com.atbjtu.dataStructure.arrays.recursion;

/**
 * @author: PengfeiXi
 * @description: 插入排序算法
 * @date: 2024/6/20 12:23
 */

/*
 * 插入排序算法
 * 冒泡排序是每次找到最大的或者最小的放在最后面，每次循环比上一次少排序一个与元素。
 * 插入排序是每次找到当前元素在已排序的序列中的位置，然后将该元素插入到该位置。
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    // 升序排序
    public static void sort(int[] arr) {
        insertionSort(arr, 1);
    }

    private static void insertionSort(int[] arr, int low) {
        // low -1 (包括low-1)之前都是排序好的元素
        if (low == arr.length) {
            return;
        }
        int temp = arr[low];
        int i = low-1;
        while(i >= 0 && arr[i] > temp){
            arr[i+1] = arr[i];
            i--;
        }
        if(i+1!= low){
            arr[i+1] = temp;
        }
        // 到此为止，index [0,low]的元素已经有序，需要将low+1对应的元素加进来
        insertionSort(arr, low + 1);
    }
}
