package com.hlj.designpatterns.Builder;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月26日 上午10:27:47 
 * 类说明  、建造者模式
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