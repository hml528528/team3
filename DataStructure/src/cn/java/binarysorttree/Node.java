/**
 * Project Name:DataStructure
 * File Name:Node.java
 * Package Name:cn.java.binarysorttree
 * Date:2020年8月4日上午10:28:22
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.binarysorttree;

/**
 * Description: 树节点 <br/>
 * Date: 2020年8月4日 上午10:28:22 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class Node {
    int weight;// 树的权值

    Node rightNode;// 右子树

    Node leftNode;// 左子树

    public Node(int weight) {
        super();
        this.weight = weight;
    }

    public void binarySortTree(Node node) {
        // 如果当前节点为空，则直接返回
        if (node == null) {
            return;
        } else {
            // 如果当前节点的权值小于根节点
            if (node.weight < this.weight) {
                // 如果根节点的左子树为null，则将当前节点赋值给根节点的左子树
                if (this.leftNode == null) {
                    this.leftNode = node;

                } else {
                    leftNode.binarySortTree(node);
                }
            } else { // 如果当前节点的权值大于根节点，且根节点的右子树为null，则将当前节点赋值给根节点的右子树
                if (this.rightNode == null) {

                    this.rightNode = node;
                } else {
                    rightNode.binarySortTree(node);
                }
            }
        }

    }

    // 中序遍历二叉排序树
    public void foreach(Node node) {
        if (node == null) {
            return;
        } else {
            foreach(node.leftNode);
            System.out.print(node.weight + "\t");
            foreach(node.rightNode);
        }

    }

    // 查找节点
    public Node searchNode(int weight) {
        if (this.weight == weight) {
            return this;
        } else {
            if (weight > this.weight) {
                if (rightNode == null) {
                    return null;
                }
                return rightNode.searchNode(weight);
            } else {
                if (leftNode == null) {
                    return null;
                }
                return leftNode.searchNode(weight);
            }
        }

    }
    // 查找父节点

    public Node searchParentNode(int weight) {
        if ((this.leftNode != null && this.leftNode.weight == weight)
                || (this.rightNode != null && this.rightNode.weight == weight)) {
            return this;
        } else {
            // 如果当前节点的值大于根节点
            if (weight > this.weight && this.rightNode != null) {
                return rightNode.searchParentNode(weight);
            } else if (weight < this.weight && this.leftNode != null) {
                return leftNode.searchParentNode(weight);
            }
            return null;
        }

    }

}
