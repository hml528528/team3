/**
 * Project Name:DataStructure
 * File Name:RadixSort.java
 * Package Name:cn.java.sort09
 * Date:2020年8月7日上午8:54:48
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.sort09;

import java.util.Arrays;

/**
 * Description: 数据结构之基数排序 <br/>
 * Date: 2020年8月7日 上午8:54:48 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class RadixSort {
    public static void radixSort(int[] arr) {
        // 随机定义一个最大数
        int max = Integer.MIN_VALUE;
        // 遍历数组中所有数字，并找出最大值
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // 计算最大数的位数，确定需要几次比较
        int maxLen = (max + "").length();
        // 创建一个临时二维数组，用于存放遍历的数据
        int[][] temp = new int[10][arr.length - 1];
        // 记录数据存放在temp中的对应数组中的数量
        int[] counts = new int[10];
        for (int i = 0, n = 1; i < maxLen; i++, n = n * 10) {
            // 遍历数组中所有元素
            for (int j = 0; j < arr.length; j++) {
                // 计算余数
                int ys = arr[j] / n % 10;
                // 存放数据
                temp[ys][counts[ys]] = arr[j];
                // 数量加一
                counts[ys]++;
            }
            // 记录取出元素要存放的位置
            int index = 0;
            // 把数字取出来
            for (int j = 0; j < counts.length; j++) {
                if (counts[j] != 0) {
                    // 循环取出数字
                    for (int k = 0; k < counts[j]; k++) {
                        arr[index] = temp[j][k];
                        index++;
                    }
                    // 把counts数组置空
                    counts[j] = 0;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 98, 65, 34, 108, 29, 66, 59, 276 };
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
