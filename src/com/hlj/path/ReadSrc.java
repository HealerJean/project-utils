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
//ֱ����Ϊ�����ж�ȡ this.getServletContext().getResourceAsStream
		//ȡ��srcĿ¼�������Դ
		getSrc();
			
		//ȡ��webroot������ļ�		
		getWebRoot();
				
		//ȡ�ð�com.hlj.tools������ļ�
		getPackage();
		
//��ȡ�þ���·������·����һ���ģ����Բ����й����д�룬Ȼ����ж�ȡ
		getRealPath();
	
		
	}
	
	private void getRealPath() {
		// TODO Auto-generated method stub
		String srcPath = this.getServletContext().getRealPath("/WEB-INF/classes/NamePath.properties");
		System.out.println("src�ľ���·��Ϊ"+srcPath);
		
		String fileName = srcPath.substring(srcPath.lastIndexOf("\\")+1,srcPath.length());
		
		System.out.println("�ļ�����"+fileName); 
		try {
			FileInputStream inputStream =new  FileInputStream(srcPath);
			Properties properties = new Properties();
		
				properties.load(inputStream);
				System.out.println("ȡ��src������ļ�"+properties.getProperty("urlpath"));
			}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//ȡ��webroot������ļ�
	private void getWebRoot() {
		
		
		try {
			InputStream inputStream = this.getServletContext().getResourceAsStream("/NamePath.properties");
			Properties properties = new Properties();
			properties.load(inputStream);
			System.out.println("ȡ��webroot������ļ�"+properties.getProperty("urlpath"));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//ȡ��srcĿ¼�������Դ	
	private void getSrc() {
		// TODO Auto-generated method stub
try {
		InputStream inputStream = this.getServletContext().getResourceAsStream("/WEB-INF/classes/NamePath.properties");
			Properties properties = new Properties();
			properties.load(inputStream);
			System.out.println("ȡ��srcĿ¼�������Դ	"+properties.getProperty("urlpath"));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//ȡ�ð�com.hlj.tools������ļ�
	private void getPackage() {
		try {
			
			InputStream inputStream = this.getServletContext().getResourceAsStream("/WEB-INF/classes/com/hlj/tools/NamePath.properties");
				Properties properties = new Properties();
				properties.load(inputStream);
				System.out.println("ȡ�ð�com.hlj.tools������ļ�"+properties.getProperty("urlpath"));
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
}
*/