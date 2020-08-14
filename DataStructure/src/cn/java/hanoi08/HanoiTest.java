/**
 * Project Name:DataStructure
 * File Name:HanoiTest.java
 * Package Name:cn.java.hanoi08
 * Date:2020年8月1日上午10:44:54
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.hanoi08;

/**
 * Description: 数据结构之汉诺塔 <br/>
 * Date: 2020年8月1日 上午10:44:54 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class HanoiTest {
    /**
     * 
     * Description: <br/>
     *
     * @author HML
     * @param n:表示n个盘子
     * @param from：起始位置
     * @param in：借助中间位置
     * @param to：目标位置
     * 
     *            1.一个盘子，直接从起始位置移动到目标位置
     *            2.无论多少盘中，先移动n-1个盘子到中间位置，再移动第n个盘子到目标位置，然后再将n-1个盘子从中间位置移动到目标位置
     */

    public static void hanoi(int n, char from, char in, char to) {
        if (n == 1) {
            System.out.println("移动第" + n + "个盘子从" + from + "移动到" + to + "");
        } else {
            // 先将n-1个盘子移动到中间位置
            hanoi(n - 1, from, to, in);
            // 将最后一个盘子从起始位置移动到目标位置
            System.out.println("移动第" + n + "个盘子从" + from + "移动到" + to + "");
            // 将n-1个盘子从中间位置移动到目标位置
            hanoi(n - 1, in, from, to);

        }
    }

    public static void main(String[] args) {
        hanoi(2, 'A', 'B', 'C');
    }
}
