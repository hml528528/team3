/**
 * Project Name:DataStructure
 * File Name:StackTest.java
 * Package Name:cn.java.stack04
 * Date:2020年7月31日下午2:36:36
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.stack04;

import java.util.Arrays;

/**
 * Description:数据结构之栈 <br/>
 * Date: 2020年7月31日 下午2:36:36 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class StackTest {
    /**
     * 
     * Description:添加元素进栈 <br/>
     *
     * @author HML
     * @param element
     * @return
     */
    // 目标栈
    private int[] stack;

    public StackTest() {
        this.stack = new int[0];
    }

    public void push(int element) {
        // 创建新栈
        int[] newStack = new int[stack.length + 1];
        // 遍历目标栈，并将目标栈中的数据赋值给新栈
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }
        // 添加元素在栈顶
        newStack[stack.length] = element;
        // 新栈替换旧栈
        stack = newStack;
    }

    /**
     * 
     * Description:取栈顶元素 <br/>
     *
     * @author HML
     */
    public int pop() {
        // 获取栈顶元素
        int element = stack[stack.length - 1];
        // 创建新栈
        int[] newStack = new int[stack.length - 1];
        // 栈为空
        if (stack.length == 0) {
            System.out.println("栈为空");
        }
        for (int i = 0; i < stack.length - 1; i++) {
            newStack[i] = stack[i];
        }
        // 新栈替换目标栈
        stack = newStack;
        // 返回栈顶元素
        return element;

    }

    /**
     * 
     * Description:读取栈顶元素 <br/>
     *
     * @author HML
     */
    public int peek() {
        if (stack.length == 0) {
            System.out.println("栈为空");
        }
        return stack[stack.length - 1];
    }

    /**
     * 
     * Description: 判断栈是否为空<br/>
     *
     * @author HML
     */
    public boolean isStackEmpty() {
        return stack.length == 0 ? true : false;
    }

    public static void main(String[] args) {
        StackTest st = new StackTest();
        // 往栈中添加元素
        st.push(9);
        st.push(8);
        st.push(7);
        System.out.println(Arrays.toString(st.stack));
        // 取出栈顶元素
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        // 读取栈顶元素
        // System.out.println(st.peek());
        // 判断栈是否为空
        boolean flag = st.isStackEmpty();
        System.out.println(flag);
    }

}
