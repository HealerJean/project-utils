package com.hlj.IgnoreNullBean.data;

/**
 * 作者 ：HealerJean
 * 日期 ：2018/12/13  上午11:02.
 * 类描述：
 */

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Liuxd on 2018/11/2.
 */
public class User {

    private String name;

    private String gender;

    private BigDecimal bigDecimal;

    /**
     * 如果属性类型为基本数据类型，则会有默认值
     * 影响正确判断，请特别注意
     */
//  private int age;

    private Integer age;

    private Date date ;

    private Long longvalue;

    private String dateStr ; //注意这里是String类型的日期 例如 2018-12-09 00:00:00

    public User() {
    }

    public User(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getLongvalue() {
        return longvalue;
    }

    public void setLongvalue(Long longvalue) {
        this.longvalue = longvalue;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }
}
