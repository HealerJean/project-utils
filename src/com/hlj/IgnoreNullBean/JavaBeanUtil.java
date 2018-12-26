package com.hlj.IgnoreNullBean;

import com.hlj.IgnoreNullBean.data.User;
import com.hlj.IgnoreNullBean.data.UserNow;
import org.junit.platform.commons.util.StringUtils;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 作者 ：HealerJean
 * 日期 ：2018/12/13  上午10:55.
 * 类描述 防止非空字段，在类似于 new BigDecimal(string))中进行报错
 */
public class JavaBeanUtil {


    /**
     *
     * @param object 原始数据JavaBean
     * @param originFieldName 原始数据 字段名字 比如：name
     * @param newObject 新复制的JavaBean
     * @param newFilldName 新赋值的字段名字 比如 nameNow
     * @param dateFormat 如果是date类型的日期，
     *                   1、传入的是String字符串'2018-12-09'   则需要传入相应Fromat格式 yyyy-MM-dd HH:mm:ss
     *                   2、如果是标准高的date类型，那么.toString之后是 -> Fri Dec 14 19:00:07 CST 2018， 则设置为null
     */
    public static  void setFieldValue(Object object,String originFieldName,Object newObject,String newFilldName,String ...dateFormat) {

        try {
            Field field = object.getClass().getDeclaredField(originFieldName);
            field.setAccessible(true);
            Field newfield = newObject.getClass().getDeclaredField(newFilldName);
            newfield.setAccessible(true);
            String newfieldType=newfield.getGenericType().toString();
            if (field.get(object) != null && StringUtils.isNotBlank(field.get(object).toString())) {
                String value = field.get(object).toString();
                switch (newfieldType){
                    case "class java.lang.Integer":
                        newfield.set(newObject, Integer.valueOf(value));
                        break;
                    case "class java.lang.Long":
                        newfield.set(newObject, Long.valueOf(value));
                        break;
                    case "class java.math.BigDecimal":
                        newfield.set(newObject, new BigDecimal(Double.valueOf(value)) );
                        break;
                    case "class java.util.Date":
                        Date  date = null;
                        if(dateFormat!=null&&dateFormat.length>0){
                            date = new SimpleDateFormat(dateFormat[0]).parse(value);
                            newfield.set(newObject, date);
                        }else {
                              date=new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK).parse(value);
                        }
                        newfield.set(newObject, date);
                        break;
                    case "class java.lang.String":
                        newfield.set(newObject, value);
                        break;
                    default:
                        break;

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


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

        user.setLongvalue(null);
        JavaBeanUtil.setFieldValue(user,"longvalue",userNow,"longvalueNow");
        System.out.println("longvalueNow:"+userNow.getLongvalueNow());

        user.setName("HealerJean");
        JavaBeanUtil.setFieldValue(user,"name",userNow,"nameNow");
        System.out.println("nameNow:"+userNow.getNameNow());

    }


}
