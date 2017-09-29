package com.hlj.designpatterns.Builder;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��9��26�� ����10:27:47 
 * ��˵��  ��������ģʽ
 */
public class Builder {  
    
    private List<Sender> list = new ArrayList<Sender>();  
      
    public void produceMailSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new MailSender());  
        }  
    }  
      
    public void produceSmsSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new SmsSender());  
        }  
    }  
}  