package com.atbjtu.dataStructure.tree;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/7/1 15:39
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public TreeNode( TreeNode left, int val,TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}
