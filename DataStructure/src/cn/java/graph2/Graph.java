/**
 * Project Name:DataStructure
 * File Name:Graph.java
 * Package Name:cn.java.graph2
 * Date:2020年8月9日上午8:48:54
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.graph2;

import java.util.Arrays;

import cn.java.stack04.StackTest;

/**
 * Description:数据结构之图结构 <br/>
 * Date: 2020年8月9日 上午8:48:54 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class Graph {
    private Vetex[] vertex;// 顶点数组

    public int[][] graph;// 邻接矩阵

    private int index;// 邻接矩阵的初始下标

    private StackTest stack = new StackTest();

    // 记录当前顶点的下标
    private int currentIndex;

    public Graph(int size) {
        super();
        vertex = new Vetex[size];
        graph = new int[size][size];
        // 遍历邻接矩阵
        for (int i = 0; i < graph.length; i++) {
            // 将所有自身节点设置为连通的
            graph[i][i] = 1;
        }
        // graph[0][0] = 1;
        // graph[1][1] = 1;
        // graph[2][2] = 1;
        // graph[3][3] = 1;
        // graph[4][4] = 1;

    }

    /**
     * 
     * Description:添加顶点 <br/>
     *
     * @author HML
     */
    public void addVertex(Vetex v) {
        vertex[index] = v;
        index++;

    }

    /**
     * 
     * Description:添加边 <br/>
     *
     * @author HML
     * @param v1
     * @param v2
     */

    public void addEdge(String v1, String v2) {
        // 定义顶点的临时下标
        int temp1 = 0;
        // 遍历所有顶点数组
        for (int i = 0; i < vertex.length; i++) {
            if (vertex[i].getData().equals(v1)) {
                temp1 = i;
                break;

            }
        }
        // 定义顶点的临时下标
        int temp2 = 0;
        // 遍历所有顶点数组
        for (int i = 0; i < vertex.length; i++) {
            if (vertex[i].getData().equals(v2)) {
                temp2 = i;
                break;

            }

        }
        // 让两个顶点之间建立联系
        graph[temp1][temp2] = 1;
        graph[temp2][temp1] = 1;

    }

    /**
     * 
     * Description: 深度优先搜索算法<br/>
     *
     * @author HML
     */
    public void dfs() {
        // 将顶点数组中的第零个元素设置为已访问状态
        vertex[0].status = true;
        // 将第零个元素压入栈中
        stack.push(0);
        // 打印栈顶元素
        System.out.println(vertex[0].getData());
        // 循环遍历
        out:
        while (!stack.isStackEmpty()) {
            // 循环遍历下一个元素
            for (int i = currentIndex + 1; i < vertex.length; i++) {
                // 下一个元素与第零个元素连通，且没有访问过
                if (graph[currentIndex][i] == 1 && vertex[i].status == false) {
                    // 将元素压入栈中
                    stack.push(i);
                    // 标记压入栈的元素为已访问
                    vertex[i].status = true;
                    // 打印栈顶元素值
                    System.out.println(vertex[i].getData());
                    continue out;

                }

            }
            // 如果下一个元素中没有与当前元素处于连通关系，则弹出栈顶元素
            stack.pop();
            // 将当前位置设置为栈顶
            if (!stack.isStackEmpty()) {

                currentIndex = stack.peek();
            }

        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        // 添加顶点
        graph.addVertex(new Vetex("A"));
        graph.addVertex(new Vetex("B"));
        graph.addVertex(new Vetex("C"));
        graph.addVertex(new Vetex("D"));
        graph.addVertex(new Vetex("E"));
        // 添加边
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.addEdge("A", "D");
        graph.addEdge("A", "E");
        // 遍历邻接矩阵
        for (int[] is : graph.graph) {
            System.out.println(Arrays.toString(is));
        }
        // 深度优先搜索算法
        graph.dfs();

    }

}
