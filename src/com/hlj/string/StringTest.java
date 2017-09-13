package com.hlj.string;

import java.io.UnsupportedEncodingException;

public class StringTest {
	public static void main(String[] args) {
		String str = "abc";
		StringTest stringTest = new StringTest();
	//	stringTest.change(str);   
		System.out.println(str); //输出 abc 不会改变的
	
		
	/**
	 *  split 函数用法
	 */	
		//Testsplit();
	
	//	stringTest.testnull();
		/**
		 * 测试string 和byte数组的转化
		 */
	//	testbyteArray();
		/**
		 * 
		 */
	//	strToBuffer();
		
		/**
		 * 将字符串中所有的大写变成小写字母
		 */
		strUpperToCase();
	}
	
	private static void strUpperToCase() {

		String a = 	
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
						"<PensionData>\n" + 
						"    <Version>1.0.0</Version>\n" + 
						"    <ref>S6620170911110955</ref>\n" + 
						"<SendCode>T10</SendCode>\n" + 
						"<ReceiveCode>S65</ReceiveCode>\n" + 
						"<SendDate>20170911</SendDate>\n" + 
						"<SendTime>235959</ SendTime >\n" + 
						"<dgst>消息报文示例</dgst>\n" + 
						"<AppCode>0000</AppCode>\n" + 
						"<AppMsg>成功</AppMsg>\n" + 
						"<DataSetType>\n" + 
						"    \t<TypeCode>0101</TypeCode>\n" + 
						"<TypeName>连通性测试</TypeName>\n" + 
						"<RecordNumber>1</RecordNumber >\n" + 
						"   \t\t<MainFlag>1</MainFlag>\n" + 
						"</DataSetType>\n" + 
						"  <PensionInfo>\n" + 
						"  <Planinfo>\n" + 
						"    <Appseriono>000000000000101000000001</Appseriono>\n" + 
						"<Transtype>99</Transtype>\n" + 
						"      <Planinfo>\n" + 
						"  </PensionInfo>\n" + 
						"</PensionData>";

//replaceAll支持正则表达式，因此会对参数进行解析（两个参数均是），如replaceAll("\\d", "*")，而replace则不会，replace("\\d","*")就是替换"\\d"的字符串，而不会解析为正则。
		
		String finalString  = a.toLowerCase().replace(" ", ""); 
		System.out.println(finalString); 
	}

	/**
	 * 1、测试string 可不可以 +
	 */
	
	private static void teststringadd() {
		// TODO Auto-generated method stub
	//	String s+="123"; //错误的
	//	String s = s +"abc"; //错误的
	}
	
	
	
	
	/**
	 * 测试null+字符串的值
	 */
	private void testnull() {
		// TODO Auto-generated method stub
		String testString = null+"abc";
		System.out.println(testString);

	}
	
	
	
	/**
	 * 测试字符串是否改变
	 * @param str
	 */
	void change(String str){
		
		str  = "ghj";
	}
	
	/**
	 * 2、测试 split分割 
	 */
	public static void Testsplit() {
		// TODO Auto-generated method stub
String a = "abcdef";
	String []aStrings  = a.split("");
	System.out.println("0输出"+aStrings[0]+"*"); //输出* 表示索引为0的时候，不存在数据 
	System.out.println("5输出"+aStrings[5]); //输出e 
	System.out.println(aStrings.length);  //7

	for(String b:aStrings){
			System.out.println(b); //a b c d e f 
	}
	}
	
	/**
	 * 3、测试string 和byte数组的转化
	 */
	public static void testbyteArray(){
		String str = "HealerJean";
		byte[] byteArray;
		try {
			byteArray = str.getBytes("utf-8");
			String strByte = new String (byteArray,"UTF-8");
			System.out.println("byte数组："+byteArray+"\n"+"string:"+strByte);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * String 和 StringBuffer之间的转化
	 */

	 public static void strToBuffer() {
	  //String -> StringBuffer 1、构造方法  2、通过append方法
	        //创建一个String对象
	        String str = "Hi Java!";
	        System.out.println(str);
	 
	        //方式一：构造方法
	        StringBuffer buffer = new StringBuffer(str);
	        System.out.println(buffer);
	 
	        //方式二：通过append方法
	        StringBuffer buffer2 = new StringBuffer();
	        buffer2.append(str);
	        System.out.println(buffer2);
	 
	 //StringBuffer -> String
	        //创建一个StringBuffer对象 1、构造方法 2、toString方法
	        StringBuffer buffer3 = new StringBuffer();
	        buffer3.append("Happy birthday Java!");
	        System.out.println(buffer3);
	 
	        //方式一：通过构造方法
	        String str2 = new String(buffer3); 
	        System.out.println(str2);
	         
	        //方式二：通过toString方法
	        String str3 = buffer3.toString();
	        System.out.println(str3);
	    }
}
