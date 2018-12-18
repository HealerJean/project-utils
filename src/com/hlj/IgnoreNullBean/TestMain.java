package com.hlj.IgnoreNullBean;

import com.hlj.IgnoreNullBean.data.User;
import com.hlj.IgnoreNullBean.data.UserNow;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 作者 ：HealerJean
 * 日期 ：2018/12/13  上午10:54.
 * 类描述：
 */
public class TestMain {


    public static void main(String[] args) {

        User user = new User();
        user.setAge(25);
        user.setBigDecimal(new BigDecimal(10.21));
        user.setDate(new Date());
        user.setLongvalue(100L);
        user.setDateStr("2018-12-09 00:00:00");

        UserNow userNow = new UserNow() ;

        JavaBeanUtil.setFieldValue(user,"age",userNow,"ageNow");
        System.out.println("ageNow:"+userNow.getAgeNow());

        JavaBeanUtil.setFieldValue(user,"bigDecimal",userNow,"bigDecimalNow");
        System.out.println("bigDecimalNow:"+userNow.getBigDecimalNow());

        JavaBeanUtil.setFieldValue(user,"date",userNow,"dateNow");
        System.out.println("dateNow:"+ userNow.getDateNow());

        JavaBeanUtil.setFieldValue(user,"longvalue",userNow,"longvalueNow");
        System.out.println("longvalueNow:"+userNow.getLongvalueNow());

        JavaBeanUtil.setFieldValue(user,"dateStr",userNow,"dateStrNow","yyyy-MM-dd HH:mm:ss");
        System.out.println("dateStrNow:"+userNow.getDateStrNow());
    }
}
