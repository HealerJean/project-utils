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
				p.setPerson("张宇晋"); 
			//	p.setName("HealerJean");
				p.setSex(1); 
				Map map = new HashMap();  
				map.put("name", "zhangyujin");
				map.put("x", p);  
			return map;  
		}
	/**
	 * 
	 * @param TemplateName 模板的名字
	 * @param dataMap 数据源
	 * @return
	 */
	public  static String createXmlFile(File fileDirectory,String TemplateName, Map dataMap) throws TemplateException, IOException     {    
		    

		       //得FreeMarker配置对象  
		      // 创建Configuration对象    
		  Configuration cfg = new Configuration();    		        
		  cfg.setEncoding(Locale.CHINA, "UTF-8");
		 /**
		       设置FreeMarker的模版文件位置    
 			1、类路径、2、文件系统以及3、Servlet Context。
		  * setClassForTemplateLoading(Class clazz, String pathPrefix);
			setDirectoryForTemplateLoading(File dir) throws IOException;			
			setServletContextForTemplateLoading(Object servletContext, String path); 
		  */
		//  类路径之下 
		 // cfg.setClassForTemplateLoading(CreateXmlByVmFile.class,"");  
		 // 文件目录路径下
		//  cfg.setDirectoryForTemplateLoading(fileDirectory);     
		    
		  /**
		   * 第二种方式 直接使用类模板加载器   
		   */
	/*	    TemplateLoader templateLoaderClass = new ClassTemplateLoader(CreateXmlByVmFile.class,"");
		    cfg.setTemplateLoader(templateLoaderClass); */
		    
		  /** 
		   * 四三种使用 file模板加载 （）
		   *   
		   */
		    //使用FileTemplateLoader  
		    TemplateLoader  templateLoaderFile=new FileTemplateLoader(new File("E:/workspace/JavaWorkspace/CompanyOffer/bin/com/hlj/xml/"));  
	        cfg.setTemplateLoader(templateLoaderFile);  

		    
		   Template template = cfg.getTemplate(TemplateName);    		   		        
		   template.setEncoding("utf-8");    
		    
		   StringWriter w =new StringWriter();    		      
		           // 生成xml  
		   template.process(dataMap, w);    
		         
		   return w.toString();   
		   
		   }    

    
}  