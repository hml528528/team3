/**
 * Project Name:DataStructure
 * File Name:ArrayTest.java
 * Package Name:cn.java.array03
 * Date:2020年7月31日上午10:24:05
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.array03;

import org.junit.Test;

/**
 * Description: 数据结构之数组查找算法<br/>
 * Date: 2020年7月31日 上午10:24:05 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class ArrayTest {
    /**
     * 
     * Description:线性查找 <br/>
     *
     * @author HML
     */
    @Test
    public void test01() {
        // 目标数组
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        // 目标元素
        int ele = 5;
        // 目标元素下标
        int index = -1;
        // 遍历目标数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }

    /**
     * 
     * Description:二分查找 <br/>
     *
     * @author HML
     */
    @Test
    public void test02() {
        // 定义目标数组
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // 要查找的目标元素
        int target = 12;
        // 记录二分查找的起始位置
        int start = 0;
        // 记录二分查找的结束位置
        int end = arr.length - 1;
        // 记录二分查找的中间位置
        int mid = (start + end) / 2;
        // 记录目标元素的下标
        int index = -1;
        // 循环遍历
        while (true) {
            // 如果没有目标元素
            if (start >= end) {
                index = -1;
            }
            // 中间位置元素与目标元素相等
            if (arr[mid] == target) {
                index = mid;
                break;
            } else {
                // 判断中间元素是否比目标元素大
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                // 取出新的中间位置
                mid = (start + end) / 2;
            }
        }
        System.out.println(index);
    }

}
