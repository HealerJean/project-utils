package com.hlj.ideaCodeToQuickly;

import com.hlj.ideaCodeToQuickly.data.JavaBean;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 ：HealerJean
 * 日期 ：2018/12/29  下午5:00.
 * 类描述：
 */
public class TestMain01 {


    @Test
    public void ifElse(){

        /**
         * 1、自动定义 new变量
         *  new JavaBean().var  然后点击回车自动回出现
         *  JavaBean javaBean = new JavaBean();
         */
        JavaBean javaBean = new JavaBean();



        /**
         * 2、 判断是否为null
         *
             2.1  javaBean.nn 然后点击回车
                  if (javaBean != null) {   }

            2.2、 javaBean.null 然后点击回车
                   if (javaBean == null) {  }
            2.3、 ifn 然后回车 和上面的一样的，只是顺序不一样而已，建议使用第二种
         */
        if (javaBean != null) {

        }
        if (javaBean == null) {

        }

        if (javaBean == null) {

        }



        List<JavaBean> list = new ArrayList<>() ;
        /**
         *  3、集合自动遍历 for
           1、 list.for  然后点击回车
           2、fori 然后回车
         */

        for (JavaBean bean : list) {
            
        }

        for (int i = 0; i <  1; i++) {

        }

        /**
         * 4、上圆括号
         * javaBean.par 然后回车
         */
//        (javaBean)


        /**
         * 5、快速抛出一个新的异常
         * thr 然后回车
         */
//        throw new






    }
}
