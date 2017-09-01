package com.hlj.xml;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XmlFormat {

   public static String format(String str) throws Exception {
       SAXReader reader = new SAXReader();
       // System.out.println(reader);
       // ע�ͣ�����һ�������ַ�������
       StringReader in = new StringReader(str);
       Document doc = reader.read(in);
       // System.out.println(doc.getRootElement());
       // ע�ͣ����������ʽ
       OutputFormat formater = OutputFormat.createPrettyPrint();
       //formater=OutputFormat.createCompactFormat();
       // ע�ͣ�����xml���������
       formater.setEncoding("utf-8");
       // ע�ͣ��������(Ŀ��)
       StringWriter w = new StringWriter();
       // ע�ͣ����������
       XMLWriter writer = new XMLWriter(w, formater);
       // ע�ͣ������ʽ���Ĵ���Ŀ���У�ִ�к󡣸�ʽ����Ĵ�������out�С�
       writer.write(doc);

       writer.close();
       System.out.println(w.toString());
       // ע�ͣ��������Ǹ�ʽ����Ľ��
       return w.toString();
   }

   public static void main(String[] args) throws Exception {
	   File file = new File(XmlFormat.class.getResource("format.xml").getFile());	  
	   FileInputStream fInputStream = new FileInputStream(file);
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();      
		
		byte[] buffer = new byte[1024]; 
		int len = 0;
		while((len=fInputStream.read(buffer))!=-1){
			outStream.write(buffer, 0, len);
		}
		String str = new String(outStream.toByteArray(),"utf-8");
	   
	   
       format(str);
   }

}
