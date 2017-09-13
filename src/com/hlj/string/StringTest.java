package com.hlj.string;

import java.io.UnsupportedEncodingException;

public class StringTest {
	public static void main(String[] args) {
		String str = "abc";
		StringTest stringTest = new StringTest();
	//	stringTest.change(str);   
		System.out.println(str); //��� abc ����ı��
	
		
	/**
	 *  split �����÷�
	 */	
		//Testsplit();
	
	//	stringTest.testnull();
		/**
		 * ����string ��byte�����ת��
		 */
	//	testbyteArray();
		/**
		 * 
		 */
	//	strToBuffer();
		
		/**
		 * ���ַ��������еĴ�д���Сд��ĸ
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
						"<dgst>��Ϣ����ʾ��</dgst>\n" + 
						"<AppCode>0000</AppCode>\n" + 
						"<AppMsg>�ɹ�</AppMsg>\n" + 
						"<DataSetType>\n" + 
						"    \t<TypeCode>0101</TypeCode>\n" + 
						"<TypeName>��ͨ�Բ���</TypeName>\n" + 
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

//replaceAll֧��������ʽ����˻�Բ������н����������������ǣ�����replaceAll("\\d", "*")����replace�򲻻ᣬreplace("\\d","*")�����滻"\\d"���ַ��������������Ϊ����
		
		String finalString  = a.toLowerCase().replace(" ", ""); 
		System.out.println(finalString); 
	}

	/**
	 * 1������string �ɲ����� +
	 */
	
	private static void teststringadd() {
		// TODO Auto-generated method stub
	//	String s+="123"; //�����
	//	String s = s +"abc"; //�����
	}
	
	
	
	
	/**
	 * ����null+�ַ�����ֵ
	 */
	private void testnull() {
		// TODO Auto-generated method stub
		String testString = null+"abc";
		System.out.println(testString);

	}
	
	
	
	/**
	 * �����ַ����Ƿ�ı�
	 * @param str
	 */
	void change(String str){
		
		str  = "ghj";
	}
	
	/**
	 * 2������ split�ָ� 
	 */
	public static void Testsplit() {
		// TODO Auto-generated method stub
String a = "abcdef";
	String []aStrings  = a.split("");
	System.out.println("0���"+aStrings[0]+"*"); //���* ��ʾ����Ϊ0��ʱ�򣬲��������� 
	System.out.println("5���"+aStrings[5]); //���e 
	System.out.println(aStrings.length);  //7

	for(String b:aStrings){
			System.out.println(b); //a b c d e f 
	}
	}
	
	/**
	 * 3������string ��byte�����ת��
	 */
	public static void testbyteArray(){
		String str = "HealerJean";
		byte[] byteArray;
		try {
			byteArray = str.getBytes("utf-8");
			String strByte = new String (byteArray,"UTF-8");
			System.out.println("byte���飺"+byteArray+"\n"+"string:"+strByte);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * String �� StringBuffer֮���ת��
	 */

	 public static void strToBuffer() {
	  //String -> StringBuffer 1�����췽��  2��ͨ��append����
	        //����һ��String����
	        String str = "Hi Java!";
	        System.out.println(str);
	 
	        //��ʽһ�����췽��
	        StringBuffer buffer = new StringBuffer(str);
	        System.out.println(buffer);
	 
	        //��ʽ����ͨ��append����
	        StringBuffer buffer2 = new StringBuffer();
	        buffer2.append(str);
	        System.out.println(buffer2);
	 
	 //StringBuffer -> String
	        //����һ��StringBuffer���� 1�����췽�� 2��toString����
	        StringBuffer buffer3 = new StringBuffer();
	        buffer3.append("Happy birthday Java!");
	        System.out.println(buffer3);
	 
	        //��ʽһ��ͨ�����췽��
	        String str2 = new String(buffer3); 
	        System.out.println(str2);
	         
	        //��ʽ����ͨ��toString����
	        String str3 = buffer3.toString();
	        System.out.println(str3);
	    }
}
