/**
 * Project Name:DataStructure
 * File Name:QuickSort.java
 * Package Name:cn.java.sort09
 * Date:2020年8月6日上午9:35:53
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.sort09;

import java.util.Arrays;

/**
 * Description: 数据结构之快速排序 <br/>
 * Date: 2020年8月6日 上午9:35:53 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 4, 6, 7, 2, 7, 2, 8, 0 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            // 把数组中的第零个元素作为标准数
            int standard = arr[start];
            // 记录循环遍历时的下标
            int low = start;
            int high = end;
            // 循环遍历
            while (low < high) {
                // 当high位置比标准数大时，下标左移
                while (low < high && standard <= arr[high]) {
                    high--;
                }
                // high数替换low数
                arr[low] = arr[high];
                // 当low位置比标准数小时，下标右移
                while (low < high && arr[low] <= standard) {
                    low++;
                }
                // low数替换high数
                arr[high] = arr[low];

            }
            // 标准数替换high或low数
            arr[low] = standard;
            // 递归处理比标准数小的数
            quickSort(arr, start, low);
            // 递归处理比标准数大的数
            quickSort(arr, low + 1, end);
        }
    }

}
