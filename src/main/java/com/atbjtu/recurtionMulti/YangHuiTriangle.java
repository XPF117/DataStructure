package com.atbjtu.recurtionMulti;

/**
 * @author: PengfeiXi
 * @description: 杨辉三角
 * @date: 2024/6/20 15:30
 */
public class YangHuiTriangle {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 0; i < n;i++){
            printSpace(n,i);
            for(int j = 0; j <= i;j++){
                System.out.printf("%-4d",element(i,j));
            }
            System.out.println();
        }
    }

    private static void printSpace(int n,int i){
        int num = (n-1-i)*2;
        for (int j = 0;j < num;j++){
            System.out.print(" ");
        }
    }


    private static int  element(int i,int j){
        if(j == 0 || j == i){
            return 1;
        }
        return element(i-1,j-1 ) + element(i-1,j);
    }
}
// TODO:改进：用二维数组存储杨辉三角，减少递归调用次数