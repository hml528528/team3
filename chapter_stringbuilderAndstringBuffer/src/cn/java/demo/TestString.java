/**
 * Project Name:chapter_stringbuilderAndstringBuffer
 * File Name:TestString.java
 * Package Name:cn.java.demo
 * Date:2020年8月4日上午9:25:38
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.demo;

import org.junit.Test;

/**
 * Description: 字符串测试 <br/>
 * Date: 2020年8月4日 上午9:25:38 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class TestString {
    @Test
    public void test01() {
        StringBuffer sb = new StringBuffer("abc");
        System.out.println(sb);
    }

    @Test
    public void test02() {
        StringBuilder sb = new StringBuilder("abc");
        char c = sb.charAt(1);
        System.out.println(c);
        int i = sb.capacity();
        System.out.println(i);
        int j = sb.indexOf("a");
        System.out.println(j);
    }

}
