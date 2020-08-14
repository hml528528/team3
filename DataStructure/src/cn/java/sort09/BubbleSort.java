/**
 * Project Name:DataStructure
 * File Name:BubbleSort.java
 * Package Name:cn.java.bubble09
 * Date:2020年8月1日下午2:27:05
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.sort09;

import java.util.Arrays;

/**
 * Description: 数据结构之冒泡排序 <br/>
 * Date: 2020年8月1日 下午2:27:05 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class BubbleSort {
    public static void bubbleSort(int[] params) {

        // 控制共比较几轮
        for (int i = 0; i < params.length - 1; i++) {
            // 控制一轮比较的次数
            for (int j = 0; j < params.length - 1 - i; j++) {
                if (params[j] > params[j + 1]) {
                    int temp = params[j];
                    params[j] = params[j + 1];
                    params[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] params = { 2, 5, 8, 7, 9, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(params));
        Arrays.sort(params);
        System.out.println(Arrays.toString(params));
        bubbleSort(params);
        System.out.println(Arrays.toString(params));
    }

}
