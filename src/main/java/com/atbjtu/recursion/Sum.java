package com.atbjtu.recursion;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/20 13:47
 */
// java不支持尾递归，因此需要使用循环来优化爆栈问题
public class Sum {
    public static void main(String[] args) {
        long n = 15000;
        System.out.println(sum(n,0));
    }
    public static long sum(long n,long accumulator) {
        if(n == 1){
            return 1+ accumulator;
        }
        return sum(n-1,n + accumulator);
    }
}
