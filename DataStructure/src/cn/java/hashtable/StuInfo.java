/**
 * Project Name:DataStructure
 * File Name:StuInfo.java
 * Package Name:cn.java.hashtable
 * Date:2020年8月5日上午8:09:34
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.hashtable;

/**
 * Description: 学生信息表 <br/>
 * Date: 2020年8月5日 上午8:09:34 <br/>
 * 
 * @author HML
 * @version
 * @see
 */
public class StuInfo {
    private int age;// 学生年龄

    private int count;// 学生数量

    /**
     * age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * age.
     *
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * count.
     *
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * count.
     *
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

    public StuInfo(int age, int count) {
        super();
        this.age = age;
        this.count = count;
    }

    public StuInfo() {

        super();
        // Auto-generated constructor stub

    }

    public StuInfo(int age) {
        super();
        this.age = age;
    }

    /**
     * 
     * Description:散列函数 <br/>
     *
     * @author HML
     * @return
     */

    public int getHashCode() {
        return age % 10;
    }

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "StuInfo [age=" + age + ", count=" + count + "]";
    }

}
