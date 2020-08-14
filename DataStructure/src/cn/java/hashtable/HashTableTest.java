/**
 * Project Name:DataStructure
 * File Name:HashTable.java
 * Package Name:cn.java.hashtable
 * Date:2020年8月5日上午8:08:40
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.hashtable;

/**
 * Description: 数据结构之散列表 <br/>
 * Date: 2020年8月5日 上午8:08:40 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class HashTableTest {
    StuInfo[] s = new StuInfo[100];

    /**
     * 
     * Description:往hash表中添加元素 <br/>
     *
     * @author HML
     */
    public void put(StuInfo stuInfo) {
        // 调用散列函数，找存储位置
        int index = stuInfo.getHashCode();
        // 存储元素
        s[index] = stuInfo;
    }

    /**
     * 
     * Description:取出散列表中的元素 <br/>
     *
     * @author HML
     * @param stuInfo
     */
    public void get(StuInfo stuInfo) {
        // 调用散列函数，找存储位置
        StuInfo stu = s[stuInfo.getHashCode()];
        System.out.println(stu);

    }

    public static void main(String[] args) {
        // 创建学生信息对象
        StuInfo s1 = new StuInfo(16, 2);
        StuInfo s2 = new StuInfo(17, 5);
        StuInfo s3 = new StuInfo(18, 10);
        StuInfo s4 = new StuInfo(19, 8);
        StuInfo s5 = new StuInfo(20, 1);
        // 创建HashTableTest对象
        HashTableTest hts = new HashTableTest();
        // 向散列表中添加元素
        hts.put(s1);
        hts.put(s2);
        hts.put(s3);
        hts.put(s4);
        hts.put(s5);
        // 取出散列表中的元素
        StuInfo stuInfo = new StuInfo(18);
        hts.get(stuInfo);

    }

}
