/**
 * Project Name:DataStructure
 * File Name:HuffmanTree.java
 * Package Name:cn.java.binarytree
 * Date:2020年8月3日上午10:04:03
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description: 数据结构之赫夫曼树 <br/>
 * Date: 2020年8月3日 上午10:04:03 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class HuffmanTree {
    /**
     * 
     * Description:创建赫夫曼树 <br/>
     *
     * @author HML
     * @param arr
     */
    public static TreeNode createHuffmanTree(int[] arr) {
        // 定义一个临时集合存储二叉树
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        for (int node : arr) {
            nodes.add(new TreeNode(node));
        }

        // 循环遍历
        while (nodes.size() > 1) {
            // 排序
            // 获取两个权值最小的二叉树
            TreeNode leftNode = nodes.get(0);
            TreeNode rightNode = nodes.get(1);
            // 重新组合成新的二叉树
            TreeNode newTree = new TreeNode(leftNode.data + rightNode.data);
            // 删除原有的二叉树
            nodes.remove(leftNode);
            nodes.remove(rightNode);
            // 将新的二叉树放入集合中
            nodes.add(newTree);
        }
        return nodes.get(0);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 7, 5, 11, 8, 23, 29, 14 };
        // 先排序
        Arrays.sort(arr);
        TreeNode treeNode = createHuffmanTree(arr);
        System.out.println(treeNode);
    }

}
