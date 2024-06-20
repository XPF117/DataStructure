package com.atbjtu.dataStructure.arrays.recursion;

import java.util.Arrays;

/**
 * @author: PengfeiXi
 * @description: 青蛙跳台阶问题
 * @date: 2024/6/20 13:26
 */
// 给定台阶阶数，青蛙每次可以跳一格或者两格，问有多少中跳法
// 带有缓存的
public class FrogJumping {
    public static void main(String[] args) {
        int n = 4;
        int []cache = new int[n+1];
        Arrays.fill(cache, -1);
        cache[0] = 0;
        cache[1] = 1;
        cache[2] = 2;
        int num = jumpNum(n,cache);
        System.out.println("共有："+num+" 种跳法");
    }

    private static int jumpNum(int n,int[] cache) {
        if(n < 0){
            return 0;
        }
        if(cache[n] != -1){
            return cache[n];
        }
        int ans = jumpNum(n-1,cache) + jumpNum(n-2,cache);
        cache[n] = ans;
        return cache[n];
    }
}
