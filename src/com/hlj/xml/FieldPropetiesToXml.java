package com.hlj.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.apache.log4j.Logger;


//����xml
public class FieldPropetiesToXml {
	static Logger logger = Logger.getLogger(XmlEntry.class);
	
	public static void main(String[] args) {
		FieldPropetiesToXml xmlTest = new FieldPropetiesToXml();
		xmlTest.paraseXml(new XmlEntry());
	} 
	public  String paraseXml(XmlEntry xmlEntry){
		logger.info(getPropFileByBusCd().toString());

		try {
			SAXReader reader=new SAXReader();
			String fileUrl = FieldPropetiesToXml.class.getResource("test.xml").getFile(); 
			File fileXml = new File(fileUrl);
			Document   document = reader.read(fileXml);
			//ȡ�ø��ڵ�
			Element rootElement = document.getRootElement();
			
			//����ȡ���ֶ���
			Field[] fields = XmlEntry.class.getDeclaredFields();
			//xml��ʵ�����Ӧ�����ļ�
			Properties pop = getPropFileByBusCd();
			
			Iterator<Element> firstElement=rootElement.elementIterator();
			while(firstElement.hasNext()){ //��һ��
				 Element twoElement = firstElement.next();
				 String tagele = twoElement.getName(); //ȡ�ñ�ǩ������
				 String valueTxt = twoElement.getText(); //ȡ�ñ�ǩ������
				 
				 if(!twoElement.isTextOnly()){ //�ж��ǲ��ǽ�����һ���ı�������sex������һ���ı�����ִ�������
					 Iterator<Element> twonowElement = twoElement.elementIterator();
						 while(twonowElement.hasNext()){
							 Element threeElement = twonowElement.next();
							 String threetagele = threeElement.getName(); //ȡ�ñ�ǩ������
							 String threevalueTxt = threeElement.getText(); //ȡ�ñ�ǩ������
							//���з����Լ��������ļ�����Ч����ʵ����
							 getXmlEntry(xmlEntry, fields, pop, threetagele, threevalueTxt);
						 }
					}else{
					 getXmlEntry(xmlEntry, fields, pop, tagele, valueTxt);
					}
		
				 
			}
			 System.out.println(xmlEntry.toString()); 	

			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

		return null;
	}
	
	
	private void getXmlEntry(XmlEntry xmlEntry, Field[] fields, Properties pop,
			String tagele, String valueTxt) {
		for(int i=0;i<fields.length;i++){
			Field field=fields[i];
			String tageleEntry = pop.getProperty(tagele);
			if(tageleEntry.toUpperCase().equals(field.getName().toUpperCase())){
				logger.info(valueTxt); 
				setFieldValue(field, xmlEntry, valueTxt);
				break;
			}
		}
	}
	
	

	/**
	 * ����ҵ�����ͻ����Ӧ�������ļ�
	 * @param busCd
	 * @return
	 */
	private  Properties getPropFileByBusCd(){
	
			try {
				File file=new File(FieldPropetiesToXml.class.getResource("test.properties").getFile());
				InputStream is;
				is = new FileInputStream(file);
				Properties pro=new Properties();
				pro.load(is);
				return pro;
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
	}
	
	/**
	 * Ϊ���Ը�ֵ
	 * @param field		Ҫ��ֵ������
	 * @param ins		������������
	 * @param value		ֵ
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws ParseException 
	 */
	private void setFieldValue(Field field,XmlEntry ins,String value){
		try{
			if(field==null || ins==null || value==null || "".equals(value)){
				return;
			}
			field.setAccessible(true);
			
			String fieldType=field.getGenericType().toString();
			if("class java.lang.String".equals(fieldType)){
				field.set(ins, value);
			}
			if("class java.lang.Integer".equals(fieldType)){
				Integer val=Integer.valueOf(value);
				field.set(ins, val);
			}
			if("class java.math.BigDecimal".equals(fieldType)){
				BigDecimal bde=new BigDecimal(value);
				field.set(ins, bde);
			}
			if("class java.util.Date".equals(fieldType)){
				SimpleDateFormat df=new SimpleDateFormat("yyyyMMdd");
				Date date=df.parse(value);
				field.set(ins, date);
			}
			if("class java.lang.Double".equals(fieldType)){
				SimpleDateFormat df=new SimpleDateFormat("yyyyMMdd");
				Date date=df.parse(value);
				field.set(ins, date);
			}
		}catch(Exception ex){
			logger.error(ex);
		}
		
	}
	
	
	
	
}
