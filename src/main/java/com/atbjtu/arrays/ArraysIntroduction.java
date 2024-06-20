package com.atbjtu.arrays;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/11 13:16
 */
public class ArraysIntroduction {
    /* java数组结构：
     * 8字节的markword
     * 4字节的class指针
     * 4字节的数组大小（决定了数组的最大容量为2的32次方）
     * 数组元素和对齐字节：Java中的所有对象都是8字节的整数倍
    */
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr.length); // 5
        System.out.println(arr[0]); // 0
        System.out.println(arr);

        // 二维数组:外层数组+内层数组
        // 外层数组的长度决定了内层数组的个数（本例子中为3）
        // 外层存储结构为：markword+class指针+数组大小+数组元素+对齐字节
        // 外层数组元素为指向内层数组的指针
        // 内层存储结构为：markword+class指针+数组大小+数组元素+对齐字节
        int[][] arr2 = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 10}
        };

        // 访问二维数组：按行读取在先和按列读取在先效率是不一样的，有个缓存的概念
        // 缓存会放64个字节，叫做缓存行(空间局部性)。
        // 所以外层循环行，内层循环列能充分利用缓存。

    }
}
