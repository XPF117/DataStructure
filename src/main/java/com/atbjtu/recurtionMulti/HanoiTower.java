package com.atbjtu.recurtionMulti;

import java.util.LinkedList;

/**
 * @author: PengfeiXi
 * @description: 汉诺塔问题
 * @date: 2024/6/20 15:04
 */
public class HanoiTower {
    // 分别代表三个柱子
    static LinkedList<Integer> stack1 = new LinkedList<>();
    static LinkedList<Integer> stack2 = new LinkedList<>();
    static LinkedList<Integer> stack3 = new LinkedList<>();

    public static void main(String[] args) {
        init(stack1,3);
        printTower();
        move(3, stack1, stack2, stack3);

    }

    /**
     *
     * @param n 圆盘个数
     * @param source 源柱子
     * @param helper 辅助柱子
     * @param target 目标柱子
     */

    static void move(int n, LinkedList<Integer> source, LinkedList<Integer> helper, LinkedList<Integer> target){
        if(n==0){
            return;
        }
        move(n-1, source, target, helper);
        target.addLast(source.removeLast());
        printTower();
        move(n-1, helper, source, target);
    }

    private static void printTower() {
        System.out.println(stack1);
        System.out.println(stack2);
        System.out.println(stack3);
        System.out.println("===============================");
    }

    static void init(LinkedList<Integer> stack,int n) {
        for (int i = n; i >= 1; i--) {
            stack.addLast(i);
        }
    }
}
