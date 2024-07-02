package com.atbjtu.dataStructure.tree;

import java.util.LinkedList;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/7/1 15:43
 */
public class TreeTraversal {
    /*
                  1
                 / \
                2   3
               /   / \
              4    5  6
     */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                new TreeNode( new TreeNode(4), 2,null),
                1,
                new TreeNode( new TreeNode(5), 3,new TreeNode(6))
        );
        recursiveVisit(root);

        unRecursive(root);

        unRecursiveAll(root);

    }

    private static void unRecursive(TreeNode root) {
        System.out.println("非递归的前序遍历结果：");
        unRecursivePre(root);
        System.out.println();
        System.out.println("非递归的中序遍历结果：");
        unRecursiveIn(root);
        System.out.println();
        System.out.println("非递归的后序遍历结果：");
        unRecursivePost(root);
        System.out.println();
    }
    private static void unRecursiveAll(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode current = root;
        TreeNode pop = null;
        // 后序遍历
        while (current!= null || !stack.isEmpty()) {
            // 待处理左子树
            if(current != null){
                stack.push(current);
                current = current.left;
            }else{
                TreeNode peek = stack.peek();
                // 右子树为空，无需处理
                if(peek.right == null){
                    System.out.print(peek.val + "\t");
                    pop = stack.pop();
                }
                // 右子树已经处理
                else if(peek.right == pop){
                    pop = stack.pop();
                }
                // 待处理右子树
                else{
                    System.out.print(peek.val + "\t");
                    current = peek.right;
                }
            }
        }
    }

    private static void unRecursivePost(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode current = root;
        TreeNode pop = null;
        // 后序遍历
        while (current!= null || !stack.isEmpty()) {
            if(current != null){
                stack.push(current);
                current = current.left;
            }else{
                TreeNode peek = stack.peek();
                if(peek.right == null || peek.right == pop){
                    pop = stack.pop();
                    System.out.print(pop + "\t");
                }else{
                    current = peek.right;
                }
            }
        }
    }

    private static void unRecursivePre(TreeNode root) {
        // 用栈记住来时的路
        TreeNode current = root;
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (current!= null || !stack.isEmpty()) {
            if(current != null){
                System.out.print(current + "\t"); // 非递归的前序遍历
                stack.push(current);
                current = current.left;
            }else{
                TreeNode pop = stack.pop();
                current = pop.right;
            }
        }
    }
    private static void unRecursiveIn(TreeNode root) {
        // 用栈记住来时的路
        TreeNode current = root;
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (current!= null || !stack.isEmpty()) {
            if(current != null){
                stack.push(current);
                current = current.left;
            }else{
                TreeNode pop = stack.pop();
                System.out.print(pop + "\t"); // 非递归的中序遍历
                current = pop.right;
            }
        }
    }

    private static void recursiveVisit(TreeNode root) {
        System.out.println("递归的前序遍历结果：");
        preOrderRecursive(root);
        System.out.println();
        System.out.println("递归的中序遍历结果：");
        inOrderRecursive(root);
        System.out.println();
        System.out.println("递归的后序遍历结果：");
        postOrderRecursive(root);
        System.out.println();
    }

    // 前序遍历
    static void preOrderRecursive(TreeNode node) {
        if(node == null){
            return;
        }
        System.out.print(node.val+"\t");
        preOrderRecursive(node.left);
        preOrderRecursive(node.right);
    }
    // 中序遍历
    static void inOrderRecursive(TreeNode node) {
        if(node == null){
            return;
        }
        inOrderRecursive(node.left);
        System.out.print(node.val+"\t");
        inOrderRecursive(node.right);
    }
    // 后序遍历
    static void postOrderRecursive(TreeNode node) {
        if(node == null){
            return;
        }
        postOrderRecursive(node.left);
        postOrderRecursive(node.right);
        System.out.print(node.val+"\t");
    }

}
