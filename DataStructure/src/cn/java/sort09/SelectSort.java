/**
 * Project Name:DataStructure
 * File Name:SelectSort.java
 * Package Name:cn.java.sort09
 * Date:2020年8月2日上午7:24:04
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.sort09;

import java.util.Arrays;

/**
 * Description:数据结构之选择排序 <br/>
 * Date: 2020年8月2日 上午7:24:04 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class SelectSort {
    public static void selectSort(int[] arr) {
        // 遍历数组中所有数字
        for (int i = 0; i < arr.length; i++) {
            // 让当前的数字为最小的数字
            int min = i;
            // 然后遍历i+1个数
            for (int j = i + 1; j < arr.length; j++) {
                // 如果后的数比当前数小，则替换当前数的下标
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // 如果后面的数字比当前数字小，则替换当前数字
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 6, 9, 2, 0 };
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
