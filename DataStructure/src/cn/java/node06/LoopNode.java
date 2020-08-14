/**
 * Project Name:DataStructure
 * File Name:LoopNode.java
 * Package Name:cn.java.node06
 * Date:2020年8月1日上午7:30:31
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.node06;

/**
 * Description: 数据结构之循环链表 <br/>
 * Date: 2020年8月1日 上午7:30:31 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class LoopNode {
    // 定义上一个节点
    LoopNode preNode = this;

    // 定义下一个节点
    LoopNode nextNode = this;

    // 节点数据
    int data;

    public LoopNode(int data) {
        super();
        this.data = data;
    }

    // 追加节点
    public void appendNode(LoopNode node) {
        // 获取原来节点的下一个节点作为当前节点的下下一个节点
        LoopNode nxNextNode = this.nextNode;
        // 把新节点作为当前节点的下下一个节点的前一个节点
        nxNextNode.preNode = node;
        // 把新节点作为当前节点的下一个节点
        this.nextNode = node;
        // 把原来节点的下一个节点作为当前节点的下下个节点
        this.nextNode.nextNode = nxNextNode;

    }

    // 获取节点数据
    public int getData() {
        return this.data;
    }

    // 获取上一个节点
    public LoopNode getPreNode() {
        return this.preNode;
    }

    // 获取下一个节点
    public LoopNode getNextNode() {
        return this.nextNode;
    }

    public static void main(String[] args) {
        LoopNode node1 = new LoopNode(1);
        LoopNode node2 = new LoopNode(2);
        LoopNode node3 = new LoopNode(3);
        LoopNode node4 = new LoopNode(4);
        node1.appendNode(node2);
        node2.appendNode(node3);
        node3.appendNode(node4);
        System.out.println(node1.getNextNode().getData());
        System.out.println(node2.getNextNode().getData());
        System.out.println(node3.getNextNode().getData());
        System.out.println(node4.getNextNode().getData());
    }
}
