package com.atbjtu.dataStructure.arrays.recursion;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/20 11:22
 */
public class BubbleSort {
    public static void sort(int[] arr) {
        bubble(arr, arr.length - 1);

    }
    private static void bubble(int[] arr, int right) {
        if (right == 0) {
            return;
        }
        int x = 0;
        for (int i = 0; i < right; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
                x = i;
            }
        }
        bubble(arr, x);
    }
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
