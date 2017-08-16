package com.hlj.xml;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.Iterator;
import java.util.logging.Logger;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;



//解析xml
public class XmlTest {
	
	public static void main(String[] args) {
		paraseXml();
	}
	public static String paraseXml(){
		
		try {
			SAXReader reader=new SAXReader();
			String fileUrl = XmlTest.class.getResource("test.xml").getFile(); 
			File fileXml = new File(fileUrl);
			Document   document = reader.read(fileXml);
			//取得根节点
			Element rootElement = document.getRootElement();
			
			
			Iterator<Element> firstElement=rootElement.elementIterator();
			while(firstElement.hasNext()){
			 Element twoElement = firstElement.next();
			 System.out.println(twoElement.getName()); 	
			}
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

		return null;
	}
}
