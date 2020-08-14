/**
 * Project Name:DataStructure
 * File Name:ArrayTest.java
 * Package Name:cn.java.array02
 * Date:2020年7月31日上午9:22:25
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.array02;

import java.util.Arrays;

/**
 * Description: 面向对象数组 <br/>
 * Date: 2020年7月31日 上午9:22:25 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class ArrayTest {
    private int[] elements;

    public ArrayTest() {
        this.elements = new int[0];
    }

    /**
     * 
     * Description:添加元素 <br/>
     *
     * @author HML
     */
    public void add(int element) {
        // 创建新数组
        int[] newArr = new int[elements.length + 1];
        // 遍历目标数组
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];

        }
        // 添加元素到新数组
        newArr[elements.length] = element;
        // 新数组替换目标数组
        elements = newArr;
    }

    /**
     * 
     * Description:查看数组中的元素 <br/>
     *
     * @author HML
     */
    public void show() {
        System.out.println(Arrays.toString(elements));
    }

    /**
     * 
     * Description: 在数组指定位置添加元素<br/>
     *
     * @author HML
     */
    public void insert(int index, int element) {
        // 判断数组下标是否越界
        if (index < 0 || index > elements.length - 1) {
            System.out.println("数组下标越界异常");
        }
        // 创建新数组
        int[] newArr = new int[elements.length + 1];
        // 遍历目标数组，并将目标数组的元素赋值给新数组
        for (int i = 0; i < elements.length; i++) {
            if (i < index) {
                newArr[i] = elements[i];
            } else {
                newArr[i + 1] = elements[i];
            }

        }
        // 将要添加的元素放到新数组的指定位置中
        newArr[index] = element;
        // 新数组替换目标数组
        elements = newArr;
    }

    public static void main(String[] args) {
        ArrayTest at = new ArrayTest();
        // 首次查看数组中的元素
        at.show();
        at.add(98);
        at.add(97);
        at.add(96);
        at.add(95);
        at.add(94);
        // 查看数组中的元素
        at.show();
        // 添加元素到数组指定位置
        at.insert(2, 3);
        at.show();
    }

}
