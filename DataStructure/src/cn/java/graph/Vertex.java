/**
 * Project Name:DataStructure
 * File Name:Vertex.java
 * Package Name:cn.java.graph
 * Date:2020年8月5日上午10:27:17
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.graph;

/**
 * Description:图顶点 <br/>
 * Date: 2020年8月5日 上午10:27:17 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class Vertex {
    private String vertex;// 图顶点

    public boolean status;

    /**
     * vertex.
     *
     * @return the vertex
     */
    public String getVertex() {
        return vertex;
    }

    /**
     * vertex.
     *
     * @param vertex the vertex to set
     */
    public void setVertex(String vertex) {
        this.vertex = vertex;
    }

    public Vertex(String vertex) {
        super();
        this.vertex = vertex;
    }

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Vertex [vertex=" + vertex + "]";
    }

}
