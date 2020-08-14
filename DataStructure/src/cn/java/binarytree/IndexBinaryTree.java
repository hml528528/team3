/**
 * Project Name:DataStructure
 * File Name:IndexBinaryTree.java
 * Package Name:cn.java.binarytree
 * Date:2020年8月3日上午7:10:16
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.binarytree;

/**
 * Description:数据结构之线索二叉树 <br/>
 * Date: 2020年8月3日 上午7:10:16 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class IndexBinaryTree {
    TreeNode rootNode;// 根节点

    // 记录前驱节点
    TreeNode preNode;

    /**
     * rootNode.
     *
     * @return the rootNode
     */
    public TreeNode getRootNode() {
        return rootNode;
    }

    /**
     * rootNode.
     *
     * @param rootNode the rootNode to set
     */
    public void setRootNode(TreeNode rootNode) {
        this.rootNode = rootNode;
    }

    // 线索二叉树
    public void indexBinaryTree(TreeNode node) {
        if (node == null) {
            return;
        }
        // 处理左子树
        indexBinaryTree(node.leftNode);

        // 如果当前节点的左子树为空
        if (node.leftNode == null) {
            // 将当前节点的左子树指向前驱节点
            node.leftNode = preNode;
            // 改变当前节点指针类型
            node.preType = 1;

        }
        // 如果当前节点的前驱节点的右节点为空
        if (preNode != null && preNode.rightNode == null) {
            // 将当前节点的前驱节点的右节点指向当前节点
            preNode.rightNode = node;
            // 改变前驱节点右节点指针类型
            preNode.aftType = 1;
        }
        // 每次调用,把当前节点作为前驱节点
        preNode = node;

        // 处理右子树
        indexBinaryTree(node.rightNode);
    }

    // 遍历线索二叉树
    public void foreach() {
        // 临时存储当前节点
        TreeNode temp = rootNode;
        while (temp != null) {
            // 循环遍历开始节点
            while (temp.preType == 0) {
                temp = temp.leftNode;
            }
            // 打印当前节点
            System.out.print(temp.data + "\t");
            while (temp.aftType == 1) {
                temp = temp.rightNode;
                System.out.print(temp.data + "\t");
            }
            // 替换遍历节点
            temp = temp.rightNode;
        }
    }

    public static void main(String[] args) {
        // 创建一个空的二叉树
        IndexBinaryTree bt = new IndexBinaryTree();
        // 创建根节点
        TreeNode root = new TreeNode(1);
        // 将根节点放入二叉树
        bt.setRootNode(root);
        // 创建左右子树
        TreeNode rootL = new TreeNode(2);
        TreeNode rootR = new TreeNode(3);
        // 将左右子树连接根节点
        root.setLeftNode(rootL);
        root.setRightNode(rootR);
        TreeNode LL = new TreeNode(4);
        TreeNode LR = new TreeNode(5);
        rootL.setLeftNode(LL);
        rootL.setRightNode(LR);
        TreeNode RL = new TreeNode(6);
        TreeNode RR = new TreeNode(7);
        rootR.setLeftNode(RL);
        rootR.setRightNode(RR);
        // 线索二叉树
        bt.indexBinaryTree(root);
        bt.foreach();

    }
}
