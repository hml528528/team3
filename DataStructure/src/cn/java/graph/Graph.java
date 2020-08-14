/**
 * Project Name:DataStructure
 * File Name:Graph.java
 * Package Name:cn.java.graph
 * Date:2020年8月5日上午10:28:54
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.graph;

import java.util.Arrays;

import cn.java.stack04.StackTest;

/**
 * Description:数据结构之图结构 <br/>
 * Date: 2020年8月5日 上午10:28:54 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class Graph {
    public Vertex[] vertex;// 存放顶点

    public int currentSize;// 当前数组大小

    public int[][] matrix;// 存放顶点之间的关系

    public boolean status;// 标记访问状态

    public int currentIndex;// 标记当前访问的下标

    StackTest stack = new StackTest();// 栈

    public Graph(int size) {
        super();
        vertex = new Vertex[size];
        matrix = new int[size][size];
    }

    // 添加顶点
    public void addVertex(Vertex v) {
        vertex[currentSize++] = v;
    }

    // 添加边
    public void addEdge(String v1, String v2) {
        // 找出两个顶点的下标
        int index1 = 0;
        for (int i = 0; i < matrix.length; i++) {

            if (vertex[i].getVertex().equals(v1)) {
                index1 = i;
                break;
            }
        }
        int index2 = 0;
        for (int i = 0; i < matrix.length; i++) {

            if (vertex[i].getVertex().equals(v2)) {
                index2 = i;
                break;
            }
        }
        // 让两个顶点连通
        matrix[index1][index2] = 1;
        matrix[index2][index1] = 1;

    }

    /**
     * 
     * Description:深度优先遍历算法 <br/>
     *
     * @author HML
     */

    public void dfs() {
        // 把第零个顶点标记为已访问状态
        vertex[0].status = true;
        // 把第零个顶点的下标放入栈中
        stack.push(0);
        // 打印顶点的值
        System.out.print(vertex[0].getVertex() + "\t");
        // 遍历
        out:
        while (!stack.isStackEmpty()) {
            for (int i = currentIndex + 1; i < matrix.length; i++) {
                // 如果和下一个遍历的元素是相通的
                if (matrix[currentIndex][i] == 1 && vertex[i].status == false) {
                    // 把下一个元素压入栈
                    stack.push(i);
                    // 修改访问状态
                    vertex[i].status = true;
                    System.out.print(vertex[i].getVertex() + "\t");
                    continue out;
                }
            }
            // 弹出栈顶元素
            stack.pop();
            // 修改当前位置为栈顶
            if (!stack.isStackEmpty()) {
                currentIndex = stack.peek();
            }
        }

    }

    public static void main(String[] args) {
        // 创建图
        Graph graph = new Graph(5);
        // 创建顶点
        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");
        // 添加顶点
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);
        // 添加边
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "E");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");
        // 打印图矩阵
        for (int[] m : graph.matrix) {
            System.out.println(Arrays.toString(m));
        }
        // 深度优先遍历
        graph.dfs();

    }

}
