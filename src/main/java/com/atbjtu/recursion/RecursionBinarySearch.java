package com.atbjtu.recursion;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/20 11:12
 */
public class RecursionBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 9, 13, 18, 27, 38};
        int target = 14;
        int index = search(arr, target);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Found at index: " + index);
        }

    }
    public static int search(int[] arr, int target){
        return binarySearch(arr, 0, arr.length-1, target);
    }
    private static int binarySearch(int[] arr, int left, int right, int target) {
        // base case
        if(left > right){
            return -1;
        }
        int mid = (left+right) >>> 1;
        if(target < arr[mid]){
            return binarySearch(arr, left, mid-1, target);
        }else if(arr[mid] < target){
            return binarySearch(arr, mid+1, right, target);
        }else{
            return mid;
        }
    }
}
