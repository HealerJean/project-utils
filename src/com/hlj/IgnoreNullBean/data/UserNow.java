package com.hlj.IgnoreNullBean.data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 作者 ：HealerJean
 * 日期 ：2018/12/13  上午11:03.
 * 类描述：
 */
public class UserNow {


    private String nameNow;

    private String genderNow;

    private Integer ageNow;

    private BigDecimal bigDecimalNow ;

    private Date dateNow ;

    private Long longvalueNow;

    private Date dateStrNow ; //注意这里是Date类型

    public String getNameNow() {
        return nameNow;
    }

    public void setNameNow(String nameNow) {
        this.nameNow = nameNow;
    }

    public String getGenderNow() {
        return genderNow;
    }

    public void setGenderNow(String genderNow) {
        this.genderNow = genderNow;
    }

    public Integer getAgeNow() {
        return ageNow;
    }

    public void setAgeNow(Integer ageNow) {
        this.ageNow = ageNow;
    }

    public BigDecimal getBigDecimalNow() {
        return bigDecimalNow;
    }

    public void setBigDecimalNow(BigDecimal bigDecimalNow) {
        this.bigDecimalNow = bigDecimalNow;
    }

    public Date getDateNow() {
        return dateNow;
    }

    public void setDateNow(Date dateNow) {
        this.dateNow = dateNow;
    }

    public Long getLongvalueNow() {
        return longvalueNow;
    }

    public void setLongvalueNow(Long longvalueNow) {
        this.longvalueNow = longvalueNow;
    }

    public Date getDateStrNow() {
        return dateStrNow;
    }

    public void setDateStrNow(Date dateStrNow) {
        this.dateStrNow = dateStrNow;
    }
}
