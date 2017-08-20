package com.hlj.path;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

/*
public class ReadSrc extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
//直接作为流进行读取 this.getServletContext().getResourceAsStream
		//取得src目录下面的资源
		getSrc();
			
		//取得webroot下面的文件		
		getWebRoot();
				
		//取得包com.hlj.tools下面的文件
		getPackage();
		
//先取得绝对路径具体路径是一样的，所以不进行过多的写入，然后进行读取
		getRealPath();
	
		
	}
	
	private void getRealPath() {
		// TODO Auto-generated method stub
		String srcPath = this.getServletContext().getRealPath("/WEB-INF/classes/NamePath.properties");
		System.out.println("src的绝对路径为"+srcPath);
		
		String fileName = srcPath.substring(srcPath.lastIndexOf("\\")+1,srcPath.length());
		
		System.out.println("文件名是"+fileName); 
		try {
			FileInputStream inputStream =new  FileInputStream(srcPath);
			Properties properties = new Properties();
		
				properties.load(inputStream);
				System.out.println("取得src下面的文件"+properties.getProperty("urlpath"));
			}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//取得webroot下面的文件
	private void getWebRoot() {
		
		
		try {
			InputStream inputStream = this.getServletContext().getResourceAsStream("/NamePath.properties");
			Properties properties = new Properties();
			properties.load(inputStream);
			System.out.println("取得webroot下面的文件"+properties.getProperty("urlpath"));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//取得src目录下面的资源	
	private void getSrc() {
		// TODO Auto-generated method stub
try {
		InputStream inputStream = this.getServletContext().getResourceAsStream("/WEB-INF/classes/NamePath.properties");
			Properties properties = new Properties();
			properties.load(inputStream);
			System.out.println("取得src目录下面的资源	"+properties.getProperty("urlpath"));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//取得包com.hlj.tools下面的文件
	private void getPackage() {
		try {
			
			InputStream inputStream = this.getServletContext().getResourceAsStream("/WEB-INF/classes/com/hlj/tools/NamePath.properties");
				Properties properties = new Properties();
				properties.load(inputStream);
				System.out.println("取得包com.hlj.tools下面的文件"+properties.getProperty("urlpath"));
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
}
*/