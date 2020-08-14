/**
 * Project Name:DataStructure
 * File Name:BinarySortTree.java
 * Package Name:cn.java.binarysorttree
 * Date:2020年8月4日上午10:27:46
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.binarysorttree2;

/**
 * Description: 数据结构之二叉排序树 <br/>
 * Date: 2020年8月4日 上午10:27:46 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class BinarySortTree {
    Node root;

    public void binarySortTree(Node node) {
        // 如果为空树，则将当前节点设置为根节点
        if (root == null) {
            root = node;
        } else {
            root.binarySortTree(node);
        }

    }

    public void foreach(Node node) {
        if (node == null) {
            return;
        }
        root.foreach(node);
    }

    public Node searchNode(int weight) {
        if (root == null) {
            return null;
        } else {
            return root.searchNode(weight);
        }

    }

    /**
     * 
     * Description:删除叶子节点 <br/>
     *
     * @author HML
     * @param weight
     */
    private void delNode(int weight) {
        // 如果树为空则直接返回
        if (root == null) {
            return;
        } else {

            // 先查找该节点
            Node target = searchNode(weight);
            if (target == null) {
                return;
            }
            // 查找该节点的父节点
            Node parentNode = root.searchParentNode(weight);
            // 要删除节点为叶子节点
            if (target.leftNode == null && target.rightNode == null) {

                // 如果该节点为左子树
                if (parentNode.leftNode.weight == weight) {
                    parentNode.leftNode = null;
                } else if (parentNode.rightNode.weight == weight) {
                    // 如果该节点为右子树
                    parentNode.rightNode = null;
                }
                // 要删除的节点包含两个子节点
            } else if (target.leftNode != null && target.rightNode != null) {
                // 删除目标节点，需要删除目标节点的右子树中最小的子树，并保存子树的权值
                int minNode = delMinNode(target.rightNode);
                // 用子树替换目标节点
                target.weight = minNode;

            } else if ((target.leftNode != null && target.rightNode == null)
                    || (target.rightNode != null && target.leftNode == null)) {// 要删除的节点有一个子节点
                // 有左节点
                if (parentNode.leftNode != null) {
                    // 如果该节点为左子树,将当前节点的左节点，赋值给当前节点的父节点的左子树
                    if (parentNode.leftNode.weight == weight) {
                        parentNode.leftNode = target.leftNode;
                    } else if (parentNode.rightNode.weight == weight) {

                        parentNode.rightNode = target.leftNode;

                    }
                    // 有右节点
                } else {
                    // 如果该节点有右子树,将当前节点的右节点，赋值给当前节点的父节点的右子树
                    if (parentNode.leftNode.weight == weight) {
                        parentNode.leftNode = target.rightNode;
                    } else if (parentNode.rightNode.weight == weight) {
                        parentNode.rightNode = target.rightNode;

                    }

                }

            }

        }
    }

    /**
     * 
     * Description:删除树中的最小节点 <br/>
     *
     * @author HML
     * @param rightNode
     * @return
     */

    public int delMinNode(Node rightNode) {
        Node target = rightNode;
        // 递归查找最小左子树
        while (target.leftNode != null) {
            target = target.leftNode;
        }
        // 删除子树
        delNode(target.weight);
        return target.weight;
    }

    public static void main(String[] args) {
        // int[] arr = { 8, 9, 6, 7, 5, 4 };
        // int[] arr = { 2, 1, 4, 3, 5, 6 };
        int[] arr = { 7, 4, 8, 3, 5, 6 };
        // 创建二叉排序树
        BinarySortTree tree = new BinarySortTree();
        // 循环添加数据
        for (int i : arr) {
            tree.binarySortTree(new Node(i));
        }
        // 查看二叉树的高度
        System.out.println(tree.root.getHeight());
        System.out.println(tree.root.weight);

    }

}
