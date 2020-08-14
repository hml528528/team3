/**
 * Project Name:DataStructure
 * File Name:Vetex.java
 * Package Name:cn.java.graph2
 * Date:2020年8月9日上午8:47:16
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.graph2;

/**
 * Description: 图的顶点类 <br/>
 * Date: 2020年8月9日 上午8:47:16 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class Vetex {
    private String data;// 顶点的数据

    public boolean status;// 顶点的访问状态

    /**
     * data.
     *
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * data.
     *
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    public Vetex(String data) {
        super();
        this.data = data;
    }

    public Vetex() {

        super();
        // Auto-generated constructor stub

    }

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Vetex [data=" + data + "]";
    }

}
