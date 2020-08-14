/**
 * Project Name:DataStructure
 * File Name:HuffmanCode.java
 * Package Name:cn.java.binarytree
 * Date:2020年8月3日下午2:49:30
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Description:数据结构之哈夫曼编码 <br/>
 * Date: 2020年8月3日 下午2:49:30 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class HuffmanCode {
    public static List<Node> Calculate(byte[] bytes) {
        // 创建一个集合用来统计字符以及字符出现的次数
        Map<Byte, Integer> byteMap = new HashMap<Byte, Integer>();
        // 遍历字节数组
        for (byte b : bytes) {
            // 首次获取字节
            Integer count = byteMap.get(b);
            // 如果没有，则将字节的数量设置为1
            if (count == null || count == 0) {
                byteMap.put(b, 1);
            } else {
                byteMap.put(b, count + 1);
            }

        }
        List<Node> nodes = new ArrayList<Node>();
        for (Entry<Byte, Integer> entry : byteMap.entrySet()) {
            nodes.add(new Node(entry.getKey(), entry.getValue()));
        }
        return nodes;

    }

    /**
     * 
     * Description:创建哈夫曼树 <br/>
     *
     * @author HML
     */
    public static void huffmanTree(List<Node> nodes) {
        while (nodes.size() > 1) {
            // 排序
            Collections.sort(nodes);
            // 找出权值最小的二叉树
            Node left = nodes.get(nodes.size() - 1);
            Node right = nodes.get(nodes.size() - 2);
            // 组成新的二叉树
            Node tree = new Node(null, (left.weight + right.weight));
            // 将找出来的两个二叉树设置为新的二叉树的左右子树
            tree.leftNode = left;
            tree.rightNode = right;
            // 删除找出的权值最小的两个二叉树
            nodes.remove(left);
            nodes.remove(right);
            // 添加新的二叉树进集合
            nodes.add(tree);
        }
        System.out.println(nodes.get(0).leftNode);
        System.out.println(nodes.get(0).rightNode);

    }

    /**
     * 
     * Description:哈夫曼编码 <br/>
     *
     * @author HML
     */

    public static void huffmanCode(byte[] bytes) {

        huffmanTree(Calculate(bytes));
    }

    public static void main(String[] args) {
        String str = "can you can a can as a can canner can a can.";
        // 将字符串转为字节数组
        byte[] bytes = str.getBytes();
        huffmanCode(bytes);
    }

}
