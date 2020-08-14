/**
 * Project Name:DataStructure
 * File Name:ArrayTest.java
 * Package Name:cn.java.array01
 * Date:2020年7月31日上午8:18:01
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.array01;

import java.util.Arrays;

import org.junit.Test;

/**
 * Description: 数据结构之数组 <br/>
 * Date: 2020年7月31日 上午8:18:01 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class ArrayTest {
    /**
     * 
     * Description:数组中添加元素 <br/>
     *
     * @author HML
     */
    @Test
    public void test01() {
        // 目标数组
        int[] arr = new int[] { 9, 8, 7, 6 };
        System.out.println(Arrays.toString(arr));
        // 创建新数组
        int[] newArr = new int[arr.length + 1];
        // 遍历目标数组，并将目标数组的元素赋值给新数组
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
        // 将添加的元素放到新数组队尾
        newArr[arr.length] = 5;
        // 目标数组替换新数组
        arr = newArr;
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test02() {
        // 目标数组
        int[] arr = new int[] { 9, 8, 7, 6, 5 };
        System.out.println(Arrays.toString(arr));
        // 创建新数组
        int[] newArr = new int[arr.length - 1];
        // 要删除的元素的下标
        int index = 2;
        // 遍历新数组，并将目标数组的元素赋值给新数组
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {

                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i + 1];
            }
        }
        // 目标数组替换新数组
        arr = newArr;
        System.out.println(Arrays.toString(arr));

    }
}
