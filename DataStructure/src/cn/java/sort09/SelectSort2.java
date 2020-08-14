/**
 * Project Name:DataStructure
 * File Name:SelectSort2.java
 * Package Name:cn.java.sort09
 * Date:2020年8月6日下午8:11:00
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.sort09;

import java.util.Arrays;

/**
 * Description: 数据结构之选择排序 <br/>
 * Date: 2020年8月6日 下午8:11:00 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class SelectSort2 {
    public static void selectSort(int[] arr) {
        // 循环遍历所有元素
        for (int i = 0; i < arr.length; i++) {
            // 把当前元素记录为最小的元素的下标
            int min = i;
            // 循环遍历当前元素的后面所有元素
            for (int j = i + 1; j < arr.length; j++) {
                // 如果后面的元素小于当前最小元素
                if (arr[min] > arr[j]) {
                    // 将后面的元素的下标设置为最小元素下标
                    min = j;
                }
            }
            // 后面没有比当前元素更小
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 2, 4, 6, 8, 1, 8, 4, 3 };
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
