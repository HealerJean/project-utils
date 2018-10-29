package com.hlj.file;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class FileTest {
	
	/**
	 * 6��
	 */
	static int i = 1; //���ڱ���ͳ�Ƽ�¼�ĸ���

	
	public static void main(String[] args) throws Exception {
		/**
		 * 1����֪·������ ����ļ�  ǰ�ᣬ�������·��	��û��·���ᱨ��
		*/
		//	createFile();
				
		/**
		 * 1.2�������и���Ŀ¼���ļ�
		 * 
		 */
		//	createHavaDirectoryFile();
			
		/**	
		* 2���ж��ǲ����ļ�����Ŀ¼	
		* ��������ļ���Ŀ¼�����ڣ�Ҳ���ᱨ��
		*/	
	    //	File directoryName	  = new File("D:/test/healerjean/txt.txt");
		//	judgeFileOrDirectory(directoryName);
		
		/**
		 * 3��
		 * �ж��ǲ���Ŀ¼
		 * ����Ŀ¼����ʹ·�������ڣ�Ҳ�ᴴ�����·������Ϊ��mkdirs
		 */
		//	 createDirectory();

		
		/**
		 * 4�������ļ�
		 * ��һ���ļ��Լ�·��������ڣ� ����fileInputStream�ᱨ��
		 * �ڶ����ļ����Բ�����,����·��������ڣ����·����������FileOutSteam�ᱨ��
		 */
		 copyFile("D:/test/healerjean/file.txt","D:/test/copyFile/file2.txt");
		
		/**
		 * 5��ɾ��Ŀ¼
		 * 
		 */
        //	File file	  = new File("C:/Users/qdkf/Desktop/��Ŀ/��ʡ�籣����/ceshi");
        //	delteFiles(file);
		
		/**
		 * 6 ��Ŀ¼�¶�ȡ�ļ����ݽ���ƥ��
		 * 
		 */
			//File file  = new File("C:\\Users\\qdkf\\Desktop\\��Ŀ\\��ʡ�籣����\\���ݰ�\\���ݰ�\\�����籣--�˱��������ݰ�");
		//	File file  = new File("E:/study/HealerJean.github.io");
	
		//	getFileValue(file,"asidetitle");
		
		
		/**
		 * 7����ȡtxt�ļ�����
		 * 
		 */
		//	String filePath = "D:\\test\\20170904\\9108_REQ_XML_T0120170904006463.xml";
		//	getFileTextValue(filePath);
			
		/**
		 * 8��������,һ��һ�ж�ȡ����	
		 */
	   //	String filePath = "C:/Users/qdkf/Desktop/��Ŀ/����/STS01ToRST01_NJF01001_20170904_2017090465853776438363389189.txt";
	   //	getFileReadLineTextValue(filePath);
	
	   /**
	    * 9�������ַ�����������
	    * ֻҪ�޸�code  city testType typecChoice  directChoice 
	    */
		/*String textContext = XmlTestContet.jiangSu1104RsToStEnd;
		String code = "1104-";             //�޸�λ�� 1 
		String city = "����-";           //�޸�λ��  2
		

		String testType = getTestType("1104").trim();          //�޸�λ��  3 
		String typeOne = "���ͱ���-";
    	String typeTwo = "��Ӧ����-";
		int typecChoice = 0; //1���ͱ���                         //�޸�λ�� 4
		String typecChoiceFinal = null;
		if(typecChoice==1){                    
			typecChoiceFinal = typeOne;
		}else{
			typecChoiceFinal = typeTwo;
		}
		
		String directRS = "�����˷�������-";
		String directST = "�����˷�������-";
		int directChoice = 1; //1 �����˷�������             //�޸�λ�� 5
		String directChoiceFinal = null;
		if(directChoice==1){
			directChoiceFinal = directRS;
		}else {
			directChoiceFinal = directST;
		}
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String ds =simpleDateFormat.format(new Date());
		String fileName = city+typecChoiceFinal+code+ds+".xml";
		
		//���� 
		String path = "D:/txtDirectory/"+city+"/"+testType+"/"+code+directChoiceFinal+"/"+typecChoiceFinal;
		getTxtByTextContent(textContext,fileName,path);	
	
	*/
		
		
		/**
		 *10�� ��ȡ��ǰ ����ϵͳ��Ϣ �Լ�·������
		 */
	//	testSeparator();
	}
	      



   public static String	getTestType(String str){
			if(str.equals("0101")||str.equals("SYS00101")||str.equals("SYS02000")){
				return "��ͨ�Բ���";
			}if(str.equals("0102")||str.equals("SYS01090")||str.equals("SYS02090")){
				return "ͨ�ý��ײ�ѯ";
			}if(str .equals("1101")||str.equals("NJB02101")){
				return "�ƻ�������Ϣ����";
			}if(str .equals("1102")||str.equals("NJB02103")){
				return "Ͷ�������Ϣ����";
			}if(str .equals("1103")||str.equals("NJB02102")){
				return "����������Ϣ����";
			}if(str .equals("1104")||str.equals("NJB02206")){
				return "��������Ϣ����";
			}if(str .equals("1201")||str.equals("NJB01201")){
				return "����ָ���ϴ�";
			}if(str .equals("1203")||str.equals("NJB02201")){
				return "����˻�ִ";
			}if(str .equals("1210")||str.equals("NJB02202")){
				return "��λ��ֵ��Ϣ�ϴ�";
			}if(str .equals("1211")||str.equals("NJB01202")){
				return "�ʲ���ֵ��ϸ����";
			}if(str .equals("1212")||str.equals("NJB01203")){
				return "�ɽ����ܱ����ϴ�";
			}if(str .equals("1205")||str.equals("NJB01901")){
				return "�ļ�����֪ͨ(����֪ͨ)";
			}if(str .equals("1208")||str.equals("NJB01902")){
				return "�ļ�����֪ͨ(���Ž������֪ͨ)";
			}if(str .equals("9208")||str.equals("NJB02901")||str.equals("NJB02902")){
				return "�ļ�������֪ͨ";
			}

			
			return null;
			
		}




	/**
	 * 1��
	 * ��֪·������ ����ļ�  
	 * ǰ�ᣬ�������·��,���򴴽��ļ��ᱨ��	
	 * @throws IOException 
	 */
	private static void createFile() throws IOException {
		
			File fileNameTxt = new File("D:/test/healerjean/file.txt");
			
			if(!fileNameTxt.exists()){
				fileNameTxt.createNewFile();
			}
			System.out.println("���Գɹ�");
	}
	
	

	/**
	 * 1.2��������Ŀ¼���ļ�
	 * 
	 */
	private static void createHavaDirectoryFile() throws IOException {
		File directoryName = new File("D:/test/healerjean/file");  

//ͨ������Ŀ¼�����ļ�   a1 �Ǹ��� (ֻҪ��֮ǰ�ĸ������϶��ǿ��Ե�)
		File directoryNameTxt = new File(directoryName,"directoryName.txt");
		
		if(!directoryNameTxt.exists()){
			directoryNameTxt.createNewFile();
		}
		System.out.println("������Ŀ¼���ļ��ɹ�");
	}
	
	/**	
	 * 2��
	 * �ж��ǲ����ļ�����Ŀ¼	
	 * ͬʱҲ���ᱨ��
	 */
	private static void judgeFileOrDirectory(File path) {
		
				System.out.println("���Կ�ʼ");
				if(path.isFile()){
					System.out.println(path.getPath()+"��һ���ļ�");
				}
				else if(path.isDirectory()){
					System.out.println(path.getPath()+"��һ��Ŀ¼");
				}else {
					System.out.println(path.getPath()+"�����ļ�Ҳ����Ŀ¼");

				}
	}
	
	
	

	/**
	 * 3��
	 * �ж��ǲ���Ŀ¼
	 * ����Ŀ¼����ʹ·�������ڣ�Ҳ�ᴴ�����·������Ϊ��mkdirs
	 */
	private static void createDirectory() {
		//����Ŀ¼
				File directoryName = new File("D:/test/healerjean/file");  
				
				if(!directoryName.exists()){
					directoryName.mkdirs();
					System.out.println(directoryName.getPath()+"����Ŀ¼�ɹ�"); 
				}
		
	}
	
	
	/**
	 * 4�������ļ�
	 * ��һ���ļ��Լ�·��������ڣ� ����fileInputStream�ᱨ��
	 * �ڶ����ļ����Բ�����,����·��������ڣ����·����������FileOutSteam�ᱨ��
	 */
	 public static void copyFile(String string,String string2) throws IOException{
	        FileInputStream ins = new FileInputStream(string);
	        FileOutputStream out = new FileOutputStream(string2);
	        byte[] b = new byte[1024];
	        int n=0;
	        while((n=ins.read(b))!=-1){
	            out.write(b, 0, n); 
	        }
	         
	        ins.close();
	        out.close();
	        System.out.println("�����ļ��ɹ�");
	    }
	 /**
	  * 5��ɾ�����Ŀ¼
	  */
	 
	    public static void  delteFiles(File file){
	    	//file.listFiles()�ǻ�ȡfile�������Ҳ����file���Ŀ¼������ļ����ļ��еļ���
	        File[] files=file.listFiles(); 
	        for(File f:files)
	        {
	            if(f.isDirectory())//�ݹ����
	            {
	                delteFiles(f);
	            }
	            else {
	                f.delete();
	            }
	        }
	        file.delete();
	        System.out.println("ɾ��Ŀ¼�ɹ�");
	    }
	    
	    
	    /**
		 * 6 ��Ŀ¼�¶�ȡ�ļ����ݽ���ƥ��
	     * @throws Exception 
		 * 
		 */
		private static void getFileValue(File file,String content) throws Exception {
			// 
			//file.listFiles()�ǻ�ȡfile�������Ҳ����file���Ŀ¼������ļ����ļ��еļ���
	        File[] files=file.listFiles(); 
	        for(File f:files)
	        {
	            if(f.isDirectory())//�ݹ����
	            {
	            	getFileValue(f,content);
	            }
	            else {  
	            	String path = f.getPath();
	                String xml = path.substring(path.lastIndexOf(".")+1, path.length());
	           /* 	if(xml.equals("xml")){*/
	            		FileInputStream fInputStream = new FileInputStream(f);
	            		ByteArrayOutputStream outStream = new ByteArrayOutputStream();      
	            		
	            		byte[] buffer = new byte[1024]; 
	            		int len = 0;
	            		while((len=fInputStream.read(buffer))!=-1){
	            			outStream.write(buffer, 0, len);
	            		}
	            		String str = new String(outStream.toByteArray(),"utf-8");

	 //            		System.out.println("�ļ���Ϊ"+f.getName()+"/n������Ϊ"+str); 
	 //           		if(str.contains("<typecode>9208</typecode>")&&str.contains("<appcode>0000</appcode>")){
	 //           		if(str.contains("<typecode>1103</typecode>")&&!str.contains("<appcode>0000</appcode>")){
	              	    if(str.contains(content)){
	            			System.out.println("��"+i+"���ļ���Ϊ\n"+f.getPath());
	                		System.out.println("����Ϊ\n"+str); 
	                		i++;
	            		}
	            /*	}   */         	
	        		
	            }
	        }
		}
		

		/**
		 * 7����ȡtxt�ļ�����
		 * 
		 */
		private static String getFileTextValue(String filePath) throws Exception {
			//  
			 FileInputStream fileInputStream = new FileInputStream(filePath);
			 ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
			 int len  = 0;
			 byte[] buffer = new byte[1024];
			 while((len = fileInputStream.read(buffer))!=-1){
				 byteOutputStream.write(buffer, 0, len);
			 }
			 String txtValue = new String(byteOutputStream.toByteArray());
			 System.out.println(txtValue);
			 return txtValue;
		}



		/**
		 * 8��������,һ��һ�ж�ȡtxt����	
		 */
		private static String getFileReadLineTextValue(String filePath) throws Exception {
		
			 FileInputStream fileInputStream = new FileInputStream(filePath);
			 ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
			 int len  = 0;
			 byte[] buffer = new byte[1024];
			 while((len = fileInputStream.read(buffer))!=-1){
				 byteOutputStream.write(buffer, 0, len);
			 }
			 byte[] txtByteArray = (byteOutputStream.toByteArray());
			 
			BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(txtByteArray),"utf-8"));
	     	String lineVal =null ;
	     	int flagLength = 0;
			while((lineVal = reader.readLine()) != null ){
			
				flagLength++;
			 if(flagLength==1){
				 System.out.println("��"+flagLength+"�е�����Ϊ"+lineVal);
				 System.out.println(lineVal.substring(0,7));
				 System.out.println(lineVal.substring(0,8));
			 }
			 else{
				 System.out.println("��"+flagLength+"�е�����Ϊ"+lineVal);			 
			 }
			 
			}
	     	
	     	
			return null;
		}

		
		  /**
		    * 9�������ַ�����������
		    * ֻҪ�޸�code  city testType typecChoice  directChoice 
		    */
		public static void getTxtByTextContent(String textContext,String fileName,String path){

			try {
			
				File fileDirectory = new File(path);
				if(!fileDirectory.exists()){
					fileDirectory.mkdirs();
				}
				File fileTxt = new File(path+"/"+fileName) ;
				if(!fileTxt.exists()){
					fileTxt.createNewFile();
				}
				FileOutputStream outputStream = new FileOutputStream(fileTxt);
					
				byte[] buffer = textContext.getBytes("utf-8");
				
				outputStream.write(buffer);
			System.out.println("�ɹ�"+path+"/"+fileName);
				
			} catch (FileNotFoundException e) {
				// 
				e.printStackTrace();
			}catch (UnsupportedEncodingException e) {
				// 
				e.printStackTrace();
			} catch (IOException e) {
				// 
				e.printStackTrace();
			} 
			
			
		}		
		
		
		/**
		 * 10������ϵͳ ·�������ж�
		* @author  ���� HealerJean: 
		* @version ����ʱ�䣺2017��11��1�� ����9:32:49 
		*
		 */
		public static void testSeparator(){
			/**
			 * 1���ж��ĸ�ϵͳ
			 */
			
			File directoryName	  = new File("D:"+File.separator+"test/txt.txt");
			System.out.println(directoryName.getPath()); 
					 
			String os = System.getProperty("os.name"); 
			if(os.startsWith("Win")){
				System.out.printf("This system is windows");
				System.out.println(":::"+os);

			}else { //linux
				
			}

			/**
			 * 2��ϵͳ·���Ĵ������ 
			 * / linux 
			 * \ windows
			 */
			String fileSeparator = System.getProperty("file.separator");
			System.out.println(fileSeparator); 
			
			System.out.println(""+File.separator); 
			
			
		
		}

}
