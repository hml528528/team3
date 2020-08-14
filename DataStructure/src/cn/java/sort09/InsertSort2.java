/**
 * Project Name:DataStructure
 * File Name:InsertSort2.java
 * Package Name:cn.java.sort09
 * Date:2020年8月6日下午7:45:34
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.sort09;

import java.util.Arrays;

/**
 * Description:数据结构之插入排序 <br/>
 * Date: 2020年8月6日 下午7:45:34 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class InsertSort2 {
    public static void insertSort(int[] arr) {
        // 循环遍历所有元素
        for (int i = 1; i < arr.length; i++) {
            // 如果当前元素小于前一个元素,则将当前元素存储在临时变量
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                int j;

                // 循环遍历当前元素前面的所有元素
                for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                    // 用临时元素的前一个值替换临时变量
                    arr[j + 1] = arr[j];
                }
                // 用临时变量替换当前元素的后一个元素
                arr[j + 1] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 9, 3, 6, 2, 8, 1, 0 };
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
