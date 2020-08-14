/**
 * Project Name:DataStructure
 * File Name:Node.java
 * Package Name:cn.java.binarytree
 * Date:2020年8月3日下午3:39:05
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.binarytree;

/**
 * Description: 树节点 <br/>
 * Date: 2020年8月3日 下午3:39:05 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class Node implements Comparable<Node> {
    private Byte data;// 字节信息

    Integer weight;// 权

    Node leftNode;// 左节点

    Node rightNode;// 右节点

    public Node(Byte data, Integer weight) {
        super();
        this.data = data;
        this.weight = weight;
    }

    /**
     * weight.
     *
     * @return the weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * weight.
     *
     * @param weight the weight to set
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {

        return o.weight - this.weight;
    }

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Node [data=" + data + ", weight=" + weight + "]";
    }

}
