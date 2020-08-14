/**
 * Project Name:DataStructure
 * File Name:MergeSort2.java
 * Package Name:cn.java.sort09
 * Date:2020年8月7日上午8:05:23
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.sort09;

import java.util.Arrays;

/**
 * Description: 数据结构之归并排序 <br/>
 * Date: 2020年8月7日 上午8:05:23 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class MergeSort2 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 4, 6, 8, 10 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int[] arr, int low, int middle, int high) {
        // 创建一个临时数组用于存储归并后的元素
        int[] temp = new int[high - low + 1];
        // 记录第一个数组遍历的下标
        int i = low;
        // 记录第二个数组遍历的下标
        int j = middle + 1;
        // 记录临时数组的下标
        int index = 0;
        // 循环遍历两个数组
        while (i <= middle && j <= high) {
            // 第一个数组的元素小于第二个数组的元素
            if (arr[i] < arr[j]) {
                // 将第一个数组的元素放入临时数组中
                temp[index] = arr[i];
                // 下标向后移
                i++;
                index++;

            } else {
                temp[index] = arr[j];
                j++;
                index++;
            }
        }

        // 遍历第一个数组或第二个数组中多余的数
        while (i <= middle) {
            // 将第一个数组中的所有元素放入临时数组中
            temp[index] = arr[i];
            // 下标向后移
            i++;
            index++;
        }
        while (j <= high) {
            temp[index] = arr[j];
            j++;
            index++;
        }

        // 将临时数组中的元素放入原数组中
        for (

                int k = 0; k < temp.length; k++) {
            arr[low + k] = temp[k];

        }

    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {

            int middle = (low + high) / 2;
            // 第一个数组
            mergeSort(arr, low, middle);
            // 第二个数组
            mergeSort(arr, middle + 1, high);
            // 归并
            merge(arr, 0, middle, arr.length - 1);
        }

    }

}
