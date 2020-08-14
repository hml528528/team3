/**
 * Project Name:DataStructure
 * File Name:MergeSort.java
 * Package Name:cn.java.sort09
 * Date:2020年8月2日上午8:32:27
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.sort09;

import java.util.Arrays;

/**
 * Description:数据结构之归并排序 <br/>
 * Date: 2020年8月2日 上午8:32:27 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class MergeSort {
    // 归并
    public static void merge(int[] arr, int low, int middle, int high) {
        // 记录第一个数组开始的位置
        int arr1 = low;
        // 记录第二个数组开始的位置
        int arr2 = middle + 1;
        // 用于存放临时数组数据的起始下标
        int index = 0;
        // 创建一个临时数组用于存放归并后的数据
        int[] temp = new int[high - low + 1];
        // 循环遍历
        while (arr1 <= middle && arr2 <= high) {
            // 如果第一个数组的第0个数字比第二个数组的第0个数字小，则将第一个数组的第0个数字放到临时数组中的第0个位置，相应的下标下移
            if (arr[arr1] < arr[arr2]) {
                temp[index] = arr[arr1];
                arr1++;
                index++;
            } else {
                temp[index] = arr[arr2];
                arr2++;
                index++;
            }
        }
        // 处理多余数据
        while (arr1 <= middle) {
            temp[index] = arr[arr1];
            arr1++;
            index++;
        }
        while (arr2 <= high) {
            temp[index] = arr[arr2];
            arr2++;
            index++;
        }
        // 将临时数组替换原来的数组
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }

    }

    // 归并排序
    public static void mergeSort(int[] arr, int low, int high) {
        int middle = (low + high) / 2;
        // 第一个数组
        if (low < high) {

            mergeSort(arr, low, middle);
            // 第二个数组
            mergeSort(arr, middle + 1, high);
            // 归并
            merge(arr, 0, middle, arr.length - 1);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 };
        System.out.println(Arrays.toString(arr));
        merge(arr, 0, 4, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}
