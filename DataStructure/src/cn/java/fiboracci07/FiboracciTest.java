/**
 * Project Name:DataStructure
 * File Name:FiboracciTest.java
 * Package Name:cn.java.Fiboracci07
 * Date:2020年8月1日上午10:21:17
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.fiboracci07;

/**
 * Description: 数据结构之斐波拉契数列 <br/>
 * Date: 2020年8月1日 上午10:21:17 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class FiboracciTest {
    public static int fiboracci(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return fiboracci(i - 1) + fiboracci(i - 2);
        }
    }

    public static void main(String[] args) {
        int i = FiboracciTest.fiboracci(3);
        System.out.println(i);
    }
}
