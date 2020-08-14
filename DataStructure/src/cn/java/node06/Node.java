/**
 * Project Name:DataStructure
 * File Name:NodeTest.java
 * Package Name:cn.java.node06
 * Date:2020年7月31日下午7:20:00
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.node06;

/**
 * Description: 数据结构之单链表 <br/>
 * Date: 2020年7月31日 下午7:20:00 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class Node {
    // 结点的数据
    private int data;

    // 下一个节点的地址
    private Node node;

    public Node(int data) {
        this.data = data;
    }

    // 追加节点
    public Node appendNode(Node node) {
        // 获取当前节点
        Node curNode = this;
        // 循环遍历下个节点
        while (true) {
            // 取出下一个节点
            Node nextNode = curNode.node;
            // 如果下一节点为null，则为最后节点
            if (nextNode == null) {
                break;
            }
            // 赋值给当前节点
            curNode = nextNode;
        }
        // 将要追加的节点赋值给当前节点追加的下一个节点
        curNode.node = node;
        return this;

    }

    // 获取下一节点
    public Node getNode() {
        return this.node;
    }

    // 获取节点数据
    public int getDate() {
        return this.data;
    }

    // 判断当前节点是否为空
    public boolean isEmpty() {
        return node == null ? true : false;
    }

    // 查询所有节点信息
    public void getNodes() {
        // 获取当前节点
        Node curNode = this;
        // 循环遍历所有下一个节点
        while (true) {
            System.out.print(curNode.data + "");
            Node nextNode = curNode.node;
            // 如果下一节点为null，则为最后一个节点
            if (nextNode == null) {
                break;
            }
            // 将下一节点设置为当前节点
            curNode = nextNode;
        }
        System.out.println("");
    }

    // 删除一个节点
    public void delNode() {
        // 获取当前节点的下下一个节点
        Node newNode = this.node.node;
        // 获取当前节点的下一个节点
        // 将当前下下一个节点设置为当前节点的下一个节点
        this.node = newNode;

    }

    // 插入一个节点作为当前节点的下一个节点
    public void insertNode(Node node) {
        // 获取当前的下一个节点作为当前节点的下下一个节点
        Node ntNextNode = this.node;
        // 将新节点赋值给当前节点的下一个节点
        this.node = node;
        node.node = ntNextNode;

    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        // 追加节点
        node1.appendNode(node2).appendNode(node3).appendNode(new Node(4));
        // System.out.println(node1.getNode().getNode().getDate());
        // // 判断当前节点是否为空
        // System.out.println(node1.getNode().getNode().isEmpty());
        // // 查询所有节点信息
        node1.getNodes();
        // node1.node.node.delNode();
        // node1.getNodes();
        // 插入节点
        node1.node.insertNode(new Node(5));
        node1.getNodes();
    }
}
