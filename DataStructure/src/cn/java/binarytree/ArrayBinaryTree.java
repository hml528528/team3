/**
 * Project Name:DataStructure
 * File Name:ArrayBinaryTree.java
 * Package Name:cn.java.binarytree
 * Date:2020年8月2日下午7:50:42
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.binarytree;

/**
 * Description:数据结构之顺序二叉树 <br/>
 * Date: 2020年8月2日 下午7:50:42 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class ArrayBinaryTree {
    int[] data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }

    // 前序遍历顺序二叉树
    public void frontshow(int index) {
        if (data.length == 0 || data == null) {
            return;
        }
        // 打印当前节点信息
        System.out.print(data[index] + "\t");
        // 2*n+1，处理左节点
        if (2 * index + 1 < data.length) {
            frontshow(2 * index + 1);
        }

        // 2*n+2，处理右节点
        if (2 * index + 2 < data.length) {
            frontshow(2 * index + 2);
        }

    }

    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 4, 5, 6, 7, 8 };
        ArrayBinaryTree tree = new ArrayBinaryTree(data);
        tree.frontshow(0);
    }
}
