package com.hlj.ideaCodeToQuickly;

import com.hlj.ideaCodeToQuickly.data.JavaBean;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ���� ��HealerJean
 * ���� ��2018/12/29  ����5:00.
 * ��������
 */
public class TestMain01 {


    @Test
    public void ifElse(){

        /**
         * 1���Զ����� new����
         *  new JavaBean().var  Ȼ�����س��Զ��س���
         *  JavaBean javaBean = new JavaBean();
         */
        JavaBean javaBean = new JavaBean();



        /**
         * 2�� �ж��Ƿ�Ϊnull
         *
             2.1  javaBean.nn Ȼ�����س�
                  if (javaBean != null) {   }

            2.2�� javaBean.null Ȼ�����س�
                   if (javaBean == null) {  }
            2.3�� ifn Ȼ��س� �������һ���ģ�ֻ��˳��һ�����ѣ�����ʹ�õڶ���
         */
        if (javaBean != null) {

        }
        if (javaBean == null) {

        }

        if (javaBean == null) {

        }



        List<JavaBean> list = new ArrayList<>() ;
        /**
         *  3�������Զ����� for
           1�� list.for  Ȼ�����س�
           2��fori Ȼ��س�
         */

        for (JavaBean bean : list) {
            
        }

        for (int i = 0; i <  1; i++) {

        }

        /**
         * 4����Բ����
         * javaBean.par Ȼ��س�
         */
//        (javaBean)


        /**
         * 5�������׳�һ���µ��쳣
         * thr Ȼ��س�
         */
//        throw new






    }
}
