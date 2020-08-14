/**
 * Project Name:DataStructure
 * File Name:QueueTest.java
 * Package Name:cn.java.queue05
 * Date:2020年7月31日下午4:00:40
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.queue05;

import java.util.Arrays;

/**
 * Description:数据结构之队列 <br/>
 * Date: 2020年7月31日 下午4:00:40 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class QueueTest {
    // 目标队列
    private int[] queue;

    public QueueTest() {

        this.queue = new int[0];

    }

    /**
     * 
     * Description:入队 <br/>
     *
     * @author HML
     * @param element
     * @return
     */
    public void add(int element) {
        // 创建新队列
        int[] newQueue = new int[queue.length + 1];
        // 编列目标队列，并将目标队列中的元素赋值给新队列
        for (int i = 0; i < queue.length; i++) {
            newQueue[i] = queue[i];
        }
        // 入队
        newQueue[newQueue.length - 1] = element;
        // 新队列替换旧队列
        queue = newQueue;

    }

    /**
     * 
     * Description:出队 <br/>
     *
     * @author HML
     */
    public int pool() {
        if (queue.length == 0) {
            System.out.println("队列为空");
        }
        // 取出队头元素
        int element = queue[0];
        // 创建新队列
        int[] newQueue = new int[queue.length - 1];
        // 遍历新队列，并赋值
        for (int i = 0; i < newQueue.length; i++) {
            newQueue[i] = queue[i + 1];
        }
        // 替换目标队列
        queue = newQueue;
        // 返回队头元素
        return element;

    }

    public static void main(String[] args) {
        QueueTest qt = new QueueTest();
        // 入队
        qt.add(9);
        qt.add(8);
        qt.add(7);
        System.out.println(Arrays.toString(qt.queue));
        // 出队
        System.out.println(qt.pool());
        qt.add(6);
        System.out.println(qt.pool());

    }

}
