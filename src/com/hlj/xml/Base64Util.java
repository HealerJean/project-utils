package com.hlj.xml;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;


/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月13日 下午1:50:50 
 * 类说明 
 */
public class Base64Util {



  
    /** 
     * 二进制数据编码为BASE64字符串 
     * 
     * @param bytes 
     * @return 
     * @throws Exception 
     */  
    public static String encode(final  String str) { 
    	byte[] bytes;
		try {
			bytes = str.getBytes("utf-8");
        return new String(Base64.encodeBase64(bytes)); 
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    } 
    
	/** 解码
     * @param bytes 
     * @return 
     */  
    public static String decode(final String str) {
    	byte[] bytes;
		try { 
			bytes = str.getBytes("utf-8");
	        return new String(Base64.decodeBase64(bytes),"utf-8");  

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }  
}
