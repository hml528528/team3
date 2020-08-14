/**
 * Project Name:DataStructure
 * File Name:BinaryTree.java
 * Package Name:cn.java.binarytree
 * Date:2020年8月2日上午11:08:54
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.binarytree;

/**
 * Description:数据结构之链式二叉树 <br/>
 * Date: 2020年8月2日 上午11:08:54 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class BinaryTree {
    // 根节点
    public TreeNode root;

    /**
     * root.
     *
     * @return the root
     */
    public TreeNode getRoot() {
        return root;
    }

    /**
     * root.
     *
     * @param root the root to set
     */
    public void setRoot(TreeNode root) {
        this.root = root;
    }

    // 前序遍历
    public void showfront() {
        if (root != null) {

            root.showfront();
            System.out.println("");
        }

    }

    // 中序遍历
    private void showmiddle() {
        if (root != null) {

            root.showmiddle();
            System.out.println("");
        }

    }

    // 后续遍历
    private void showafter() {
        if (root != null) {
            root.showafter();
            System.out.println("");
        }

    }

    // 前序查找
    private TreeNode frontsearch(int i) {

        return root.frontsearch(i);

    }
    // 删除子树

    private void delTree(int i) {
        if (root.getData() == i) {
            root = null;
        } else {

            root.delTree(i);
        }
    }

    public static void main(String[] args) {
        // 创建一个空的二叉树
        BinaryTree bt = new BinaryTree();
        // 创建根节点
        TreeNode root = new TreeNode(1);
        // 把根节点赋给树
        bt.setRoot(root);
        // 创建子节点
        TreeNode rootL = new TreeNode(2);
        // 将字节的设置为根节点的左节点
        root.setLeftNode(rootL);
        // 创建子节点
        TreeNode rootR = new TreeNode(3);
        // 将字节的设置为根节点的左节点
        root.setRightNode(rootR);
        // 为第二层左节点创建两个子节点
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        // 为第二层左节点创建两个子节点
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
        // 前序遍历
        bt.showfront();
        // 中序遍历
        bt.showmiddle();
        // 后序遍历
        bt.showafter();
        // 前序查找
        TreeNode i = bt.frontsearch(8);
        System.out.println(i);
        // 删除子树
        bt.delTree(4);
        bt.showfront();

    }

}
