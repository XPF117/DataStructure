package com.atbjtu.recursion;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/20 10:48
 */
public class Factorial {
    public static void main(String[] args) {
        // 求n的阶乘
        int n = 5;
        int result = factorial_n(n);
        System.out.println(result);
    }

    private static int factorial_n(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial_n(n-1);
    }

}
