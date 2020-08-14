/**
 * Project Name:DataStructure
 * File Name:InsertSort.java
 * Package Name:cn.java.sort09
 * Date:2020年8月1日下午7:46:23
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.sort09;

import java.util.Arrays;

/**
 * Description: 数据结构之插入排序 <br/>
 * Date: 2020年8月1日 下午7:46:23 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class InsertSort {
    public static void insertSort(int[] params) {
        // 遍历数组中的所有数组
        for (int i = 1; i < params.length; i++) {
            // 将取到的数字保存在临时变量中
            int temp = params[i];
            int j;
            // 遍历前i-1个数字
            for (j = i - 1; j >= 0 && temp < params[j]; j--) {
                // 将前一个数字赋值给后一个数字
                params[j + 1] = params[j];
            }
            // 将临时变量赋值给比较当前数字的后一个数字
            params[j + 1] = temp;

        }
    }

    public static void main(String[] args) {
        int[] params = { 2, 8, 5, 9, 0, 2, 4, 1 };
        System.out.println(Arrays.toString(params));
        insertSort(params);
        System.out.println(Arrays.toString(params));
    }
}
