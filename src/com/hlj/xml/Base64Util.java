package com.hlj.xml;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;


/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��13�� ����1:50:50 
 * ��˵�� 
 */
public class Base64Util {



  
    /** 
     * ���������ݱ���ΪBASE64�ַ��� 
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
    
	/** ����
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
