package com.atbjtu.dataStructure.arrays.recursion;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/20 13:06
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }else if (n == 1) {
            return 1;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }


}
