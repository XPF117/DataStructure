package com.atbjtu.InitialKnowledgeAlgorithm;

/**
 * @author: PengfeiXi
 * @description: 二分算法的实现
 * @date: 2024/6/8 22:15
 */
/*
 * Basic二分查找算法的实现
 * 需求:在有序数组 A 内，查找值 target
 * 1.如果找到返回索引值，否则返回 -1
 */

public class BinarySearch {
    // 二分查找初级版本
    public static int binarySearchBasic(int[] A, int target) {
        int left = 0, right = A.length - 1;
        while(left <= right){  // left和right之间还有数
            // int mid = left + (right-left)/2;  // 取中间索引
            int mid = (left+right) >>> 1;   // 用无符号右移，且可以适用于更多的语言
            if(A[mid] == target){
                return mid;
            }else if(A[mid] < target){  // 目标值在右半部分
                left = mid + 1;
            }else{ // 目标值在左半部分
                right = mid -1;
            }
        }
        /* 注意点：
         * 1.循环的条件为left <= right，而不是left < right
         * 2.求mid的时候，尽量不要用(left+right)/2，right 特别大的时候整数会溢出
         */
        return -1;
    }
    // 二分查找第二版：改动版
    public static int binarySearchSecond(int[] A, int target){
        int left = 0, right = A.length;
        while(left < right){
            int mid = (left+right) >>> 1;
            if(A[mid] == target){
                return mid;
            }else if(A[mid] < target){
                left = mid+1;
            }else{
                right = mid;
            }
        }

        return -1;
    }

    // 二分查找第三版：平衡版
    public static int binarySearchBalance(int[] A, int target){
        int left = 0, right = A.length;
        while(1 < right-left){
            int mid = (left+right) >>> 1;
            if(A[mid] <= target){    // 目标值在右侧
                left = mid;
            }else{
                right = mid;
            }
        }
        // right = left+1
        if(A[left] == target){
            return left;
        }else{
            return -1;
        }
    }
    // java Arrays里面有二分查找的源码，返回值为负的插入点-1
}
