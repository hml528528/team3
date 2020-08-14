/**
 * Project Name:DataStructure
 * File Name:Node.java
 * Package Name:cn.java.binarysorttree
 * Date:2020年8月4日上午10:28:22
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.binarysorttree2;

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
            // 判断二叉树是否平衡
            // 1. 不平衡，进行右旋
            if (leftNodeHeight() - rightNodeHeight() >= 2) {
                if (leftNode != null && leftNode.leftNodeHeight() < rightNode.rightNodeHeight()) {
                    // 先左旋再右旋
                    leftNode.leftRotate();
                    rightRotate();
                } else {
                    // 单旋
                    rightRotate();
                }
            }
            // 2.不平衡，进行左旋
            if (leftNodeHeight() - rightNodeHeight() <= -2) {
                // 双旋
                if (leftNode != null && rightNode.rightNodeHeight() < leftNode.leftNodeHeight()) {
                    // 先右旋，再左旋
                    rightNode.rightRotate();
                    leftRotate();

                } else {// 单旋

                    leftRotate();
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

    /**
     * 获取左子树的高度
     * 
     * @return
     */
    public int leftNodeHeight() {
        if (leftNode == null) {
            return 0;
        }
        return leftNode.getHeight();
    }

    /**
     * 获取右子树的高度
     * 
     * @return
     */
    public int rightNodeHeight() {
        if (rightNode == null) {
            return 0;
        }
        return rightNode.getHeight();
    }

    /**
     * 
     * Description:获取二叉树的高度 <br/>
     *
     * @author HML
     */
    public int getHeight() {
        return Math.max(leftNode == null ? 0 : leftNode.getHeight(), rightNode == null ? 0 : rightNode.getHeight()) + 1;
    }

    /**
     * 
     * Description:右旋 <br/>
     *
     * @author HML
     */
    public void rightRotate() {
        // 创建一个新节点，把当前节点的权值作为新节点的权值
        Node newNode = new Node(weight);
        // 把当前节点的右节点作为新节点的右节点
        newNode.rightNode = rightNode;
        // 把当前节点的左节点的右节点作为新节点的左节点
        newNode.leftNode = leftNode.rightNode;
        // 把当前节点的左节点的权值作为当前节点的权值
        weight = leftNode.weight;
        // 把当前节点的左节点设置为当前节点的左节点的左节点
        leftNode = leftNode.leftNode;
        // 将当前节点的右节点设置为新节点
        rightNode = newNode;

    }

    /**
     * 
     * Description: 左旋<br/>
     *
     * @author HML
     */
    public void leftRotate() {
        // 创建一个新节点，并把新节点的权值设置为当前节点的权值
        Node newNode = new Node(this.weight);
        // 把当前节点的左节点作为新节点的左节点
        newNode.leftNode = this.leftNode;
        // 把当前节点的右节点的左节点设置为新节点的右节点
        newNode.rightNode = this.rightNode.leftNode;
        // 把当前节点的权值设置为当前节点的右节点的权值
        this.weight = this.rightNode.weight;
        // 把当前节点的右节点的右节点设置为当前节点的右节点
        this.rightNode = this.rightNode.rightNode;
        // 将当前节点的左节点设置为新节点
        this.leftNode = newNode;
    }

}
