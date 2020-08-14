/**
 * Project Name:DataStructure
 * File Name:TreeNode.java
 * Package Name:cn.java.binarytree
 * Date:2020年8月2日上午11:09:08
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.binarytree;

/**
 * Description: 定义二叉树节点 <br/>
 * Date: 2020年8月2日 上午11:09:08 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class TreeNode implements Comparable<TreeNode> {
    public int data;// 二叉树的权

    public TreeNode leftNode;// 左节点

    public TreeNode rightNode;// 右节点

    public int preType;// 前驱：0代表有子树，1代表前驱或后继

    public int aftType;// 后继：0代表有子树，1代表前驱或后继

    public TreeNode() {

        super();

    }

    public TreeNode(int data) {

        this.data = data;
    }

    /**
     * data.
     *
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * data.
     *
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * leftNode.
     *
     * @param leftNode the leftNode to set
     */
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    /**
     * rightNode.
     *
     * @param rightNode the rightNode to set
     */
    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    // 前序遍历
    public void showfront() {
        // 打印当前节点的权
        System.out.print(data + "\t");
        // 左节点
        if (leftNode != null) {
            leftNode.showfront();
        }
        // 右节点
        if (rightNode != null) {
            rightNode.showfront();
        }

    }

    public void showmiddle() {

        // 左节点
        if (leftNode != null) {
            leftNode.showmiddle();
        }
        // 当前节点
        System.out.print(data + "\t");
        // 右节点
        if (rightNode != null) {
            rightNode.showmiddle();
        }

    }

    public void showafter() {

        // 左节点
        if (leftNode != null) {
            leftNode.showafter();
        }
        // 右节点
        if (rightNode != null) {
            rightNode.showafter();
        }
        // 当前节点
        System.out.print(data + "\t");

    }

    // 前序查找
    public TreeNode frontsearch(int i) {
        // 定义一个目标节点用来存放查找的节点
        TreeNode target = null;
        // 如果查找节点与当前节点数据相同，则返回当前节点
        if (data == i) {
            return this;
        } else {
            if (leftNode != null) {
                target = leftNode.frontsearch(i);
            }
            // 判断目标节点是否为空，不为空，则返回目标节点
            if (target != null) {
                return target;
            }
            if (rightNode != null) {
                target = rightNode.frontsearch(i);
            }
        }
        return target;

    }

    // 删除子树
    public void delTree(int i) {
        // 记录当前根节点
        TreeNode parent = this;
        // 判断左节点
        if (parent.leftNode != null && parent.leftNode.data == i) {
            parent.leftNode = null;
            return;
        }
        // 判断右节点
        if (parent.rightNode != null && parent.rightNode.data == i) {
            parent.rightNode = null;
            return;
        }
        // 如果左节点与i不相等，则将左节点作为根节点继续检索
        parent = leftNode;
        if (parent != null) {
            parent.delTree(i);
        }
        // 如果右节点与i不相等，则将右节点作为根节点继续检索
        parent = rightNode;
        if (parent != null) {
            parent.delTree(i);
        }

    }

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "TreeNode [data=" + data + "]";
    }

    @Override
    public int compareTo(TreeNode o) {

        return o.getData() - this.data;
    }

}
