package com.atbjtu.dataStructure.arrays.recursion;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/20 10:51
 */
public class ReversePrintString {
    public static void main(String[] args) {
        String str = "hello word!";
        reversePrint(str,0);
    }

    private static void reversePrint(String str,int n) {
        if(n == str.length()){
            return;
        }
        reversePrint(str,n+1);
        printN(str,n);
    }

    public static void printN(String str,int n){
        System.out.print(str.charAt(n));
    }

}
