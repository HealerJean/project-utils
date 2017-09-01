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


//解析xml
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
			//取得根节点
			Element rootElement = document.getRootElement();
			
			//反射取得字段名
			Field[] fields = XmlEntry.class.getDeclaredFields();
			//xml与实体类对应配置文件
			Properties pop = getPropFileByBusCd();
			
			Iterator<Element> firstElement=rootElement.elementIterator();
			while(firstElement.hasNext()){ //第一层
				 Element twoElement = firstElement.next();
				 String tagele = twoElement.getName(); //取得标签的名字
				 String valueTxt = twoElement.getText(); //取得标签的内容
				 
				 if(!twoElement.isTextOnly()){ //判断是不是仅仅是一个文本，比如sex仅仅是一个文本，则不执行下面的
					 Iterator<Element> twonowElement = twoElement.elementIterator();
						 while(twonowElement.hasNext()){
							 Element threeElement = twonowElement.next();
							 String threetagele = threeElement.getName(); //取得标签的名字
							 String threevalueTxt = threeElement.getText(); //取得标签的内容
							//进行反射以及配置类文件的生效制作实体类
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
	 * 根据业务类型获得相应的属性文件
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
	 * 为属性赋值
	 * @param field		要赋值的属性
	 * @param ins		属性所属对象
	 * @param value		值
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
