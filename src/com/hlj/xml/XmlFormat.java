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
       // 注释：创建一个串的字符输入流
       StringReader in = new StringReader(str);
       Document doc = reader.read(in);
       // System.out.println(doc.getRootElement());
       // 注释：创建输出格式
       OutputFormat formater = OutputFormat.createPrettyPrint();
       //formater=OutputFormat.createCompactFormat();
       // 注释：设置xml的输出编码
       formater.setEncoding("utf-8");
       // 注释：创建输出(目标)
       StringWriter w = new StringWriter();
       // 注释：创建输出流
       XMLWriter writer = new XMLWriter(w, formater);
       // 注释：输出格式化的串到目标中，执行后。格式化后的串保存在out中。
       writer.write(doc);

       writer.close();
       System.out.println(w.toString());
       // 注释：返回我们格式化后的结果
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
