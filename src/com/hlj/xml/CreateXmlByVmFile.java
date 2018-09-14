package com.hlj.xml;


import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import freemarker.cache.ClassTemplateLoader;
import freemarker.cache.FileTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.cache.URLTemplateLoader;
import freemarker.template.Configuration;    
import freemarker.template.Template;    
import freemarker.template.TemplateException;    
  
public class CreateXmlByVmFile    
{    


	public static void main(String args[]) throws TemplateException, IOException{  


		File file = new File(CreateXmlByVmFile.class.getResource("").getFile());
		Map map =demo();  
		String xml = 	createXmlFile(file,"CreateXmlByVmFile.vm", map);  		  
        System.out.println(xml);    

		
 }    
	private static Map demo(){  
				XmlEntry p =new XmlEntry();  
				p.setAge(24);
				p.setPerson("�����"); 
			//	p.setName("HealerJean");
				p.setSex(1); 
				Map map = new HashMap();  
				map.put("name", "zhangyujin");
				map.put("x", p);  
			return map;  
		}
	/**
	 * 
	 * @param TemplateName ģ�������
	 * @param dataMap ����Դ
	 * @return
	 */
	public  static String createXmlFile(File fileDirectory,String TemplateName, Map dataMap) throws TemplateException, IOException     {    
		    

		       //��FreeMarker���ö���  
		      // ����Configuration����    
		  Configuration cfg = new Configuration();    		        
		  cfg.setEncoding(Locale.CHINA, "UTF-8");
		 /**
		       ����FreeMarker��ģ���ļ�λ��    
 			1����·����2���ļ�ϵͳ�Լ�3��Servlet Context��
		  * setClassForTemplateLoading(Class clazz, String pathPrefix);
			setDirectoryForTemplateLoading(File dir) throws IOException;			
			setServletContextForTemplateLoading(Object servletContext, String path); 
		  */
		//  ��·��֮�� 
		 // cfg.setClassForTemplateLoading(CreateXmlByVmFile.class,"");  
		 // �ļ�Ŀ¼·����
		//  cfg.setDirectoryForTemplateLoading(fileDirectory);     
		    
		  /**
		   * �ڶ��ַ�ʽ ֱ��ʹ����ģ�������   
		   */
	/*	    TemplateLoader templateLoaderClass = new ClassTemplateLoader(CreateXmlByVmFile.class,"");
		    cfg.setTemplateLoader(templateLoaderClass); */
		    
		  /** 
		   * ������ʹ�� fileģ����� ����
		   *   
		   */
		    //ʹ��FileTemplateLoader  
		    TemplateLoader  templateLoaderFile=new FileTemplateLoader(new File("E:/workspace/JavaWorkspace/CompanyOffer/bin/com/hlj/xml/"));  
	        cfg.setTemplateLoader(templateLoaderFile);  

		    
		   Template template = cfg.getTemplate(TemplateName);    		   		        
		   template.setEncoding("utf-8");    
		    
		   StringWriter w =new StringWriter();    		      
		           // ����xml  
		   template.process(dataMap, w);    
		         
		   return w.toString();   
		   
		   }    

    
}  