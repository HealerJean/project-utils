package com.hlj.file;


/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月11日 下午2:31:38 
 * 类说明 用于 社保连通性测试 使用的响应xml内容 
 */
public interface XmlTestContet {
	
	/**
	 * 新疆建设兵团 连通性测试   响应报文
	 * T10 to R66
	 * SYS01000
	 */ 	
	/*	if("SYS01000".equals(eaMessage.getHeadvo().getBuscd())){				
			String feedxml=XmlTestContet.xinjiangjsbt1010T10ToR65;	 
	 */
	public final static String xinjiangjsbtSYS01000T10ToR66 =
			"<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
			"<msgtext>\n" + 
			"  <grphdr>\n" + 
			"    <version>1.0.0</version>\n" + 
			"    <ref>102000002012090600000000000000000001</ref>\n" + 
			"    <buscd>SYS01000</buscd>\n" + 
			"    <tradsrc>ST</tradsrc>\n" + 
			"    <sender>T10</sender>\n" + 
			"<recver>S66</recver>\n" + 
			"<dgst>摘要</dgst>\n" + 
			"    <date>20170911</date>\n" + 
			"<time>100900</time>\n" + 
			"<appcode>0000</appcode>\n" + 
			"<appmsg>交易成功</appmsg>\n" + 
			"  </grphdr>\n" + 
			"  <busitext>\n" + 
			"  </busitext>\n" + 
			"</msgtext>";
	

	/**
	 * 新疆建设兵团 连通性测试  发送报文
	 * R66 to T10
	 * SYS01000
	 */ 	
	public final static String xinjiangjsbtSYS01000R66ToT10 =

"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
"        <msgtext>\n" + 
"          <grphdr>\n" + 
"            <version>1.0.0</version>\n" + 
"            <ref>102000002012090600000000000000000001</ref>\n" + 
"            <buscd>SYS01000</buscd>\n" + 
"            <tradsrc>RS</tradsrc>\n" + 
"            <sender>S66</sender>\n" + 
"        <recver>T10</recver>\n" + 
"        <dgst>摘要</dgst>\n" + 
"            <date>20170911</date>\n" + 
"        <time>100915</time>\n" + 
"          </grphdr>\n" + 
"          <busitext>\n" + 
"          </busitext>\n" + 
"        </msgtext>";

	/**
	 * 新疆建设兵团 连通性测试  发送报文
	 * T10 to  R66
	 * SYS02000
	 */ 	
	public final static String xinJiangJsbtSYS02000T10ToR66 =	
	
	"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
	"<msgtext>\n" + 
	"  <grphdr>\n" + 
	"    <version>1.0.0</version>\n" + 
	"    <ref>S6620170911110939</ref>\n" + 
	"    <buscd>SYS02000</buscd>\n" + 
	"    <tradsrc>ST</tradsrc>\n" + 
	"    <sender>T10</sender>\n" + 
	"<recver>S66</recver>\n" + 
	"<dgst>摘要</dgst>\n" + 
	"    <date>20170911</date>\n" + 
	"<time>100915</time>\n" + 
	"  </grphdr>\n" + 
	"  <busitext>\n" + 
	"  </busitext>\n" + 
	"</msgtext>"; 
	
	
	

	/**
	 * 新疆建设兵团 连通性测试  发送报文
	 * R66 to T10 
	 * SYS02000
	 */ 	
	public final static String xinJiangJsbtSYS02000R66ToT10 =	
					"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" + 
					"<msgtext>\n" + 
					"\t<grphdr>\n" + 
					"\t\t<version>1.0.0</version>\n" + 
					"\t\t<ref/>\n" + 
					"\t\t<buscd>SYS02000</buscd>\n" + 
					"\t\t<tradsrc>ST</tradsrc>\n" + 
					"\t\t<sender>T10</sender>\n" + 
					"\t\t<recver>S66</recver>\n" + 
					"\t\t<date>20170911</date>\n" + 
					"\t\t<time>112936</time>\n" + 
					"\t\t<appcode>0000</appcode>\n" + 
					"\t\t<appmsg/>\n" + 
					"\t</grphdr>\n" + 
					"\t<busitext/>\n" + 
					"</msgtext>";	
	


/***start* 新疆新版*******新疆新版*******新疆新版*********新疆新版*********新疆新版*********新疆新版********************************/	

	
	/**
	 * 新疆自治区新版 连通性测试 受托人->委托人
	 * T10 to R65 发送报文
	 * 0101
	 */
	public final static String xinJiangZzqMew0101T10ToR65 = 
			"<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
					"<pensiondata>"+
					  "<version>1.0.0</version>"+
					  "<sendcode>T10</sendcode>"+
					  "<receivecode>S65</receivecode>"+
					  "<sendername/>"+
					  "<receivername/>"+
					  "<senddate>20170915</senddate>"+
					  "<sendtime>154656</sendtime>"+
					  "<dgst>消息报文示例</dgst>"+
					  "<datasettype>"+
					    "<typecode>0101</typecode>"+
					    "<typename>连通性测试</typename>"+
					  "</datasettype>"+
					  "<pensioninfo>"+
					    "<appseriono>201700915T100101000000115</appseriono>"+
					    "<transtype>99</transtype>"+
					  "</pensioninfo>"+
					"</pensiondata>";
	
	
	/**
	 * 新疆自治区新版 连通性测试 受托人 ->委托人
	 * T10 to R65   响应报文
	 * 0101
	 */
	public final static String xinJiangZzqNew0101T10ToR65End = 
	
			"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
			"<pensiondata>\n" + 
			"\t<version>1.0.0</version>\n" + 
			"\t<sendcode>T10</sendcode>\n" + 
			"\t<receivecode>S65</receivecode>\n" + 
			"\t<sendername/>\n" + 
			"\t<receivername/>\n" + 
			"\t<senddate>20170915</senddate>\n" + 
			"\t<sendtime>154656</sendtime>\n" + 
			"\t<dgst>消息报文示例</dgst>\n" + 
			"\t<datasettype>\n" + 
			"\t\t<typecode>0101</typecode>\n" + 
			"\t\t<typename>连通性测试</typename>\n" + 
			"\t</datasettype>\n" + 
			"\t<pensioninfo>\n" + 
			"\t\t<appseriono>201700915T100101000000115</appseriono>\n" + 
			"\t\t<transtype>99</transtype>\n" + 
			"\t</pensioninfo>\n" + 
			"\t<appcode>0000</appcode>\n" + 
			"\t<appmsg/>\n" + 
			"</pensiondata>";

	
	
	
	/**
	 * 新疆自治区新版  委托人- >受托人
	 * 连通性测试 发送报文
	 * R65 to  T10
	 * 0101
	 */
	public final static String xinJiangZzqNew0101RSToSTStart = 
			"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
			"<pensiondata>\n" + 
			"\t<version>1.0.0</version>\n" + 
			"\t<sendcode>S65</sendcode>\n" + 
			"\t<receivecode>T10</receivecode>\n" + 
			"\t<sendername/>\n" + 
			"\t<receivername/>\n" + 
			"\t<senddate>20170915</senddate>\n" + 
			"\t<sendtime>170517</sendtime>\n" + 
			"\t<dgst>消息报文示例</dgst>\n" + 
			"\t<datasettype>\n" + 
			"\t\t<typecode>0101</typecode>\n" + 
			"\t\t<typename>连通性测试</typename>\n" + 
			"\t</datasettype>\n" + 
			"\t<pensioninfo>\n" + 
			"\t\t<appseriono>20170915S650101000000044</appseriono>\n" + 
			"\t\t<transtype>99</transtype>\n" + 
			"\t</pensioninfo>\n" + 
			"</pensiondata>";

	
	/**
	 * 新疆自治区新版  委托人- >受托人
	 * 连通性测试 响应报文
	 * R65 to  T10
	 * 0101
	 */
	public final static String xinJiangZzqNew0101RSToSTEnd = 
		
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"\t<version>1.0.0</version>\n" + 
		"\t<sendcode>S65</sendcode>\n" + 
		"\t<receivecode>T10</receivecode>\n" + 
		"\t<sendername/>\n" + 
		"\t<receivername/>\n" + 
		"\t<senddate>20170915</senddate>\n" + 
		"\t<sendtime>173633</sendtime>\n" + 
		"\t<dgst>消息报文示例</dgst>\n" + 
		"\t<datasettype>\n" + 
		"\t\t<typecode>0101</typecode>\n" + 
		"\t\t<typename>连通性测试</typename>\n" + 
		"\t</datasettype>\n" + 
		"\t<pensioninfo>\n" + 
		"\t\t<appseriono>20170915S650101000000102</appseriono>\n" + 
		"\t\t<transtype>99</transtype>\n" + 
		"\t</pensioninfo>\n" + 
		"\t<appcode>0000</appcode>\n" + 
		"\t<appmsg/>\n" + 
		"</pensiondata>";

	
	
	
	
	
	
	
	
	


	
	/**
	 * 新疆自治区新版 模拟 发送 委托人 ->受托人
	 * 计划基本信息下载 发送报文
	 * 1101 
	 */
	public final static String xinJiangZzqNew1101RSToSTStart=											
			
			"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
			"<pensiondata>\n" + 
			"  <version>1.0.0</version>\n" + 
			"  <sendcode>S65</sendcode>\n" + 
			"  <receivecode>T10</receivecode>\n" + 
			"  <sendername/>\n" + 
			"  <receivername/>\n" + 
			"  <senddate>20170915</senddate>\n" + 
			"  <sendtime>181624</sendtime>\n" + 
			"  <datasettype>\n" + 
			"    <typecode>1101</typecode>\n" + 
			"    <typename/>\n" + 
			"\t</datasettype>\n" + 
			"\t<pensioninfo>\n" + 
			"\t\t<custaccountbankid>105</custaccountbankid>\n" + 
			"\t\t<unifiedplanlicid>6500ZY00</unifiedplanlicid>\n" + 
			"\t\t<memo/>\n" + 
			"\t\t<appseriono>20170915S651101000000120</appseriono>\n" + 
			"\t\t<trustorid>S65</trustorid>\n" + 
			"\t\t<planlicdate/>\n" + 
			"\t\t<lastupddate>20170915</lastupddate>\n" + 
			"\t\t<investrate>0.3</investrate>\n" + 
			"\t\t<custodian>中国建设银行</custodian>\n" + 
			"\t\t<accountplanid>9002777</accountplanid>\n" + 
			"\t\t<trusteeid>T10</trusteeid>\n" + 
			"\t\t<planlicid>6500ZY201710</planlicid>\n" + 
			"\t\t<transtype>02</transtype>\n" + 
			"\t\t<planbegdate>20140908</planbegdate>\n" + 
			"\t\t<trusteefee>0.001</trusteefee>\n" + 
			"\t\t<unifiedcustodianid/>\n" + 
			"\t\t<trustaccname>新疆职业年金受托财产专户</trustaccname>\n" + 
			"\t\t<planatt>03</planatt>\n" + 
			"\t\t<planname>中国人寿养老保险股份有限公司</planname>\n" + 
			"\t\t<plantype>2</plantype>\n" + 
			"\t\t<unifiedtrusteeid/>\n" + 
			"\t\t<custodianfee>0.001</custodianfee>\n" + 
			"\t\t<custodianid>C02</custodianid>\n" + 
			"\t\t<planenddate/>\n" + 
			"\t\t<trustaccno>1111111</trustaccno>\n" + 
			"\t\t<planid>221</planid>\n" + 
			"\t\t<drawrate>0.2</drawrate>\n" + 
			"\t\t<trustconno/>\n" + 
			"\t\t<unifiedplanname>新疆维吾尔自治区职业年金测试集合计划</unifiedplanname>\n" + 
			"\t</pensioninfo>\n" + 
			"</pensiondata>";

	
	/**
	 * 新疆自治区新版 模拟 发送 委托人 ->受托人
	 * 计划基本信息下载 响应报文
	 * 1101 
	 */
	public final static String xinJiangZzqNew1101RSToSTEnd=											

		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>1.0.0</version>\n" + 
		"  <sendcode>S65</sendcode>\n" + 
		"  <receivecode>T10</receivecode>\n" + 
		"  <sendername/>\n" + 
		"  <receivername/>\n" + 
		"  <senddate>20170915</senddate>\n" + 
		"  <sendtime>061625</sendtime>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>1101</typecode>\n" + 
		"    <typename/>\n" + 
		"  </datasettype>\n" + 
		"  <appcode>0000</appcode>\n" + 
		"  <appmsg>正常</appmsg>\n" + 
		"  <pensioninfo>\n" + 
		"  \t<appseriono>20170915S651101000000120</appseriono>\n" + 
		"    <transtype>02</transtype>\n" + 
		"  </pensioninfo>\n" + 
		"</pensiondata>";

				
				
				
			/**
			 * 新疆自治区新版 模拟 发送 委托人 ->受托人
			 * 投资组合信息推送  发送报文
			 * 1102
			 */
	public final static String xinJiangZzqNew1102RSToSTStart=			
				
					"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
					"<pensiondata>\n" + 
					"\t<version>1.0.0</version>\n" + 
					"\t<sendcode>S65</sendcode>\n" + 
					"\t<receivecode>T10</receivecode>\n" + 
					"\t<sendername/>\n" + 
					"\t<receivername/>\n" + 
					"\t<senddate>20170918</senddate>\n" + 
					"\t<sendtime>110701</sendtime>\n" + 
					"\t<datasettype>\n" + 
					"\t\t<typecode>1102</typecode>\n" + 
					"\t\t<typename/>\n" + 
					"\t</datasettype>\n" + 
					"\t<pensioninfo>\n" + 
					"\t\t<custaccountbankid/>\n" + 
					"\t\t<memo/>\n" + 
					"\t\t<appseriono>20170918S651102000000033</appseriono>\n" + 
					"\t\t<portfoliobegdate>20140908</portfoliobegdate>\n" + 
					"\t\t<investmanager/>\n" + 
					"\t\t<portfoliooriprice/>\n" + 
					"\t\t<rounding>02</rounding>\n" + 
					"\t\t<lastupddate/>\n" + 
					"\t\t<currency/>\n" + 
					"\t\t<fixincmanager/>\n" + 
					"\t\t<portfolioname>计划层定价</portfolioname>\n" + 
					"\t\t<investrate>0.3</investrate>\n" + 
					"\t\t<investratedesc/>\n" + 
					"\t\t<portfoliotype/>\n" + 
					"\t\t<custodian/>\n" + 
					"\t\t<dealingperiod/>\n" + 
					"\t\t<accountplanid/>\n" + 
					"\t\t<portfoliostat>01</portfoliostat>\n" + 
					"\t\t<firstpricedate>20171006</firstpricedate>\n" + 
					"\t\t<planlicid>6500ZY201710</planlicid>\n" + 
					"\t\t<transtype>02</transtype>\n" + 
					"\t\t<trusteefee>0.001</trusteefee>\n" + 
					"\t\t<trustaccname/>\n" + 
					"\t\t<planname>中国人寿养老保险股份有限公司</planname>\n" + 
					"\t\t<custodianfee>0.001</custodianfee>\n" + 
					"\t\t<custodianid/>\n" + 
					"\t\t<restrustaccname/>\n" + 
					"\t\t<investmentrate/>\n" + 
					"\t\t<trustaccno/>\n" + 
					"\t\t<planid>221</planid>\n" + 
					"\t\t<drawrate>0.2</drawrate>\n" + 
					"\t\t<rescustactbankid/>\n" + 
					"\t\t<investmantid/>\n" + 
					"\t\t<stockmanager/>\n" + 
					"\t\t<portfolioid>71Z0000</portfolioid>\n" + 
					"\t\t<portfolioenddate/>\n" + 
					"\t\t<rescustodian/>\n" + 
					"\t\t<trusteefeedesc/>\n" + 
					"\t\t<restrustaccno/>\n" + 
					"\t\t<custodianfeedesc/>\n" + 
					"\t</pensioninfo>\n" + 
					"</pensiondata>";
			
			
			/**
			 * 新疆自治区新版 模拟 发送 委托人 ->受托人
			 * 投资组合信息推送 响应报文
			 * 1102
			 */
			public final static String xinJiangZzqNew1102RSToSTEnd=			
						
				"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
				"<pensiondata>\n" + 
				"  <version>1.0.0</version>\n" + 
				"  <sendcode>S65</sendcode>\n" + 
				"  <receivecode>T10</receivecode>\n" + 
				"  <sendername/>\n" + 
				"  <receivername/>\n" + 
				"  <senddate>20170918</senddate>\n" + 
				"  <sendtime>110621</sendtime>\n" + 
				"  <datasettype>\n" + 
				"    <typecode>1102</typecode>\n" + 
				"    <typename/>\n" + 
				"  </datasettype>\n" + 
				"  <appcode>0000</appcode>\n" + 
				"  <appmsg>正常</appmsg>\n" + 
				"  <pensioninfo>\n" + 
				"  \t<appseriono>20170918S651102000000033</appseriono>\n" + 
				"    <transtype>02</transtype>\n" + 
				"  </pensioninfo>\n" + 
				"</pensiondata>";
			


			
			/**
			 * 新疆自治区新版 模拟 发送 委托人 ->受托人
			 * 年金管理人信息推送 发送报文
			 * 1103 <licensetype>01</licensetype>
			 */
			public  static final String xinJiangZzqNew1103RsToStStart01 = 		
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
				"<pensiondata>\n" + 
				"\t<version>1.0.0</version>\n" + 
				"\t<sendcode>S65</sendcode>\n" + 
				"\t<receivecode>T10</receivecode>\n" + 
				"\t<sendername/>\n" + 
				"\t<receivername/>\n" + 
				"\t<senddate>20170918</senddate>\n" + 
				"\t<sendtime>114701</sendtime>\n" + 
				"\t<datasettype>\n" + 
				"\t\t<typecode>1103</typecode>\n" + 
				"\t\t<typename/>\n" + 
				"\t</datasettype>\n" + 
				"\t<pensioninfo>\n" + 
				"\t\t<planid>221</planid>\n" + 
				"\t\t<transtype>04</transtype>\n" + 
				"\t\t<planname>中国人寿养老保险股份有限公司</planname>\n" + 
				"\t\t<appseriono>20170918S651103000000043</appseriono>\n" + 
				"\t\t<rows>\n" + 
				"\t\t\t<row>\n" + 
				"\t\t\t\t<fax/>\n" + 
				"\t\t\t\t<memo/>\n" + 
				"\t\t\t\t<institutionorgid/>\n" + 
				"\t\t\t\t<lastupddate>20170918</lastupddate>\n" + 
				"\t\t\t\t<contactp>测试</contactp>\n" + 
				"\t\t\t\t<subinstpostcode/>\n" + 
				"\t\t\t\t<licensetype>01</licensetype>\n" + 
				"\t\t\t\t<institutionid>T10</institutionid>\n" + 
				"\t\t\t\t<institutiontype>03</institutiontype>\n" + 
				"\t\t\t\t<subinstid/>\n" + 
				"\t\t\t\t<address/>\n" + 
				"\t\t\t\t<email/>\n" + 
				"\t\t\t\t<licensenum>0103</licensenum>\n" + 
				"\t\t\t\t<socialcreditcode/>\n" + 
				"\t\t\t\t<institutionname>中国人寿养老保险股份有限公司</institutionname>\n" + 
				"\t\t\t\t<subinstaddr/>\n" + 
				"\t\t\t\t<telephone/>\n" + 
				"\t\t\t</row>\n" + 
				"\t\t</rows>\n" + 
				"\t\t<planlicid>6500ZY201710</planlicid>\n" + 
				"\t</pensioninfo>\n" + 
				"</pensiondata>";

			
			
			/**
			 * 新疆自治区新版 模拟 发送 委托人 ->受托人
			 * 年金管理人信息推送 发送报文
			 * 1103 <licensetype>03</licensetype>
			 */
			public  static final String xinJiangZzqNew1103RsToStStart03 = 

					"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
					"<pensiondata>\n" + 
					"\t<version>1.0.0</version>\n" + 
					"\t<sendcode>S65</sendcode>\n" + 
					"\t<receivecode>T10</receivecode>\n" + 
					"\t<sendername/>\n" + 
					"\t<receivername/>\n" + 
					"\t<senddate>20170918</senddate>\n" + 
					"\t<sendtime>122301</sendtime>\n" + 
					"\t<datasettype>\n" + 
					"\t\t<typecode>1103</typecode>\n" + 
					"\t\t<typename/>\n" + 
					"\t</datasettype>\n" + 
					"\t<pensioninfo>\n" + 
					"\t\t<planid>221</planid>\n" + 
					"\t\t<transtype>04</transtype>\n" + 
					"\t\t<planname>中国人寿养老保险股份有限公司</planname>\n" + 
					"\t\t<appseriono>20170918S651103000000053</appseriono>\n" + 
					"\t\t<rows>\n" + 
					"\t\t\t<row>\n" + 
					"\t\t\t\t<fax/>\n" + 
					"\t\t\t\t<memo/>\n" + 
					"\t\t\t\t<institutionorgid/>\n" + 
					"\t\t\t\t<lastupddate>20170918</lastupddate>\n" + 
					"\t\t\t\t<contactp>测试111</contactp>\n" + 
					"\t\t\t\t<subinstpostcode/>\n" + 
					"\t\t\t\t<licensetype>03</licensetype>\n" + 
					"\t\t\t\t<institutionid>C02</institutionid>\n" + 
					"\t\t\t\t<institutiontype>01</institutiontype>\n" + 
					"\t\t\t\t<subinstid/>\n" + 
					"\t\t\t\t<address/>\n" + 
					"\t\t\t\t<email/>\n" + 
					"\t\t\t\t<licensenum>0132</licensenum>\n" + 
					"\t\t\t\t<socialcreditcode/>\n" + 
					"\t\t\t\t<institutionname>中国建设银行股份有限公司</institutionname>\n" + 
					"\t\t\t\t<subinstaddr/>\n" + 
					"\t\t\t\t<telephone/>\n" + 
					"\t\t\t</row>\n" + 
					"\t\t</rows>\n" + 
					"\t\t<planlicid>6500ZY201710</planlicid>\n" + 
					"\t</pensioninfo>\n" + 
					"</pensiondata>";

			
			/**
			 * 新疆自治区新版 模拟 发送 委托人 ->受托人
			 * 年金管理人信息推送 发送报文
			 * 1103
			 */
			public  static final String xinJiangZzqNew1103RsToStEnd03 = 
					
				
				"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
				"<pensiondata>\n" + 
				"  <version>1.0.0</version>\n" + 
				"  <sendcode>S65</sendcode>\n" + 
				"  <receivecode>T10</receivecode>\n" + 
				"  <sendername/>\n" + 
				"  <receivername/>\n" + 
				"  <senddate>20170918</senddate>\n" + 
				"  <sendtime>122224</sendtime>\n" + 
				"  <datasettype>\n" + 
				"    <typecode>1103</typecode>\n" + 
				"    <typename/>\n" + 
				"  </datasettype>\n" + 
				"  <appcode>0000</appcode>\n" + 
				"  <appmsg>正常</appmsg>\n" + 
				"  <pensioninfo>\n" + 
				"  \t<appseriono>20170918S651103000000053</appseriono>\n" + 
				"    <transtype>04</transtype>\n" + 
				"  </pensioninfo>\n" + 
				"</pensiondata>";

			
			
			
			/**
			 * 新疆自治区新版 模拟 发送 委托人 ->受托人
			 * 年金管理人信息推送 发送报文
			 * 1103 <licensetype>04</licensetype>
			 */
			public  static final String xinJiangZzqNew1103RsToStStart04 = 		
					
					"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
					"<pensiondata>\n" + 
					"\t<version>1.0.0</version>\n" + 
					"\t<sendcode>S65</sendcode>\n" + 
					"\t<receivecode>T10</receivecode>\n" + 
					"\t<sendername/>\n" + 
					"\t<receivername/>\n" + 
					"\t<senddate>20170918</senddate>\n" + 
					"\t<sendtime>115301</sendtime>\n" + 
					"\t<datasettype>\n" + 
					"\t\t<typecode>1103</typecode>\n" + 
					"\t\t<typename/>\n" + 
					"\t</datasettype>\n" + 
					"\t<pensioninfo>\n" + 
					"\t\t<planid>221</planid>\n" + 
					"\t\t<transtype>04</transtype>\n" + 
					"\t\t<planname>中国人寿养老保险股份有限公司</planname>\n" + 
					"\t\t<appseriono>20170918S651103000000046</appseriono>\n" + 
					"\t\t<rows>\n" + 
					"\t\t\t<row>\n" + 
					"\t\t\t\t<fax/>\n" + 
					"\t\t\t\t<memo/>\n" + 
					"\t\t\t\t<institutionorgid/>\n" + 
					"\t\t\t\t<lastupddate>20170918</lastupddate>\n" + 
					"\t\t\t\t<contactp>测试</contactp>\n" + 
					"\t\t\t\t<subinstpostcode/>\n" + 
					"\t\t\t\t<licensetype>04</licensetype>\n" + 
					"\t\t\t\t<institutionid>I52</institutionid>\n" + 
					"\t\t\t\t<institutiontype>2</institutiontype>\n" + 
					"\t\t\t\t<subinstid/>\n" + 
					"\t\t\t\t<address/>\n" + 
					"\t\t\t\t<email/>\n" + 
					"\t\t\t\t<licensenum>0159</licensenum>\n" + 
					"\t\t\t\t<socialcreditcode/>\n" + 
					"\t\t\t\t<institutionname>中国人寿养老保险股份有限公司</institutionname>\n" + 
					"\t\t\t\t<subinstaddr/>\n" + 
					"\t\t\t\t<telephone/>\n" + 
					"\t\t\t</row>\n" + 
					"\t\t</rows>\n" + 
					"\t\t<planlicid>6500ZY201710</planlicid>\n" + 
					"\t</pensioninfo>\n" + 
					"</pensiondata>";



			
			/**
			 * 新疆自治区新版 模拟 发送 委托人 ->受托人
			 * 定价日信息推送发送报文
			 * Rs To St
			 * 1104
			 */
			public  static final String xinJiangZzqNew1104RsToStStart = 
					"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
					"<pensiondata>\n" + 
					"  <version>1.0.0</version>\n" + 
					"  <sendcode>S65</sendcode>\n" + 
					"  <receivecode>T10</receivecode>\n" + 
					"  <sendername/>\n" + 
					"  <receivername/>\n" + 
					"  <senddate>20170918</senddate>\n" + 
					"  <sendtime>125701</sendtime>\n" + 
					"  <datasettype>\n" + 
					"    <typecode>1104</typecode>\n" + 
					"    <typename/>\n" + 
					"  </datasettype>\n" + 
					"  <pensioninfo>\n" + 
					"    <planid>221</planid>\n" + 
					"    <transtype>99</transtype>\n" + 
					"    <memo/>\n" + 
					"    <planname>中国人寿养老保险股份有限公司</planname>\n" + 
					"    <appseriono>20170918S651104000000060</appseriono>\n" + 
					"    <accountplanid/>\n" + 
					"    <year>2017</year>\n" + 
					"    <lastupddate>20170918</lastupddate>\n" + 
					"    <rows>\n" + 
					"      <row>\n" + 
					"        <status>1</status>\n" + 
					"        <pricedate>20171009</pricedate>\n" + 
					"      </row>\n" + 
					"      <row>\n" + 
					"        <status>1</status>\n" + 
					"        <pricedate>20171230</pricedate>\n" + 
					"      </row>\n" + 
					"      <row>\n" + 
					"        <status>1</status>\n" + 
					"        <pricedate>20171025</pricedate>\n" + 
					"      </row>\n" + 
					"      <row>\n" + 
					"        <status>1</status>\n" + 
					"\t\t\t\t<pricedate>20171130</pricedate>\n" + 
					"\t\t\t</row>\n" + 
					"\t\t\t<row>\n" + 
					"\t\t\t\t<status>1</status>\n" + 
					"\t\t\t\t<pricedate>20171227</pricedate>\n" + 
					"\t\t\t</row>\n" + 
					"\t\t\t<row>\n" + 
					"\t\t\t\t<status>1</status>\n" + 
					"\t\t\t\t<pricedate>20171118</pricedate>\n" + 
					"\t\t\t</row>\n" + 
					"\t\t\t<row>\n" + 
					"\t\t\t\t<status>1</status>\n" + 
					"\t\t\t\t<pricedate>20171117</pricedate>\n" + 
					"\t\t\t</row>\n" + 
					"\t\t\t<row>\n" + 
					"\t\t\t\t<status>1</status>\n" + 
					"\t\t\t\t<pricedate>20171013</pricedate>\n" + 
					"\t\t\t</row>\n" + 
					"\t\t\t<row>\n" + 
					"\t\t\t\t<status>1</status>\n" + 
					"\t\t\t\t<pricedate>20171011</pricedate>\n" + 
					"\t\t\t</row>\n" + 
					"\t\t\t<row>\n" + 
					"\t\t\t\t<status>1</status>\n" + 
					"\t\t\t\t<pricedate>20171008</pricedate>\n" + 
					"\t\t\t</row>\n" + 
					"\t\t\t<row>\n" + 
					"\t\t\t\t<status>1</status>\n" + 
					"\t\t\t\t<pricedate>20171007</pricedate>\n" + 
					"\t\t\t</row>\n" + 
					"\t\t\t<row>\n" + 
					"\t\t\t\t<status>1</status>\n" + 
					"\t\t\t\t<pricedate>20171006</pricedate>\n" + 
					"\t\t\t</row>\n" + 
					"\t\t\t<row>\n" + 
					"\t\t\t\t<status>1</status>\n" + 
					"\t\t\t\t<pricedate>20171012</pricedate>\n" + 
					"\t\t\t</row>\n" + 
					"\t\t\t<row>\n" + 
					"\t\t\t\t<status>1</status>\n" + 
					"\t\t\t\t<pricedate>20171010</pricedate>\n" + 
					"\t\t\t</row>\n" + 
					"\t\t\t<row>\n" + 
					"\t\t\t\t<status>1</status>\n" + 
					"\t\t\t\t<pricedate>20171014</pricedate>\n" + 
					"\t\t\t</row>\n" + 
					"\t\t</rows>\n" + 
					"\t\t<planlicid>6500ZY201710</planlicid>\n" + 
					"\t</pensioninfo>\n" + 
					"</pensiondata>";


			
			
			
			/**
			 * 新疆自治区新版 模拟 发送 委托人 ->受托人
			 * 定价日信息推送 响应报文
			 * Rs To St
			 * 1104
			 */
			public  static final String xinJiangZzqNew1104RsToStEnd = 

				"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
				"<pensiondata>\n" + 
				"  <version>1.0.0</version>\n" + 
				"  <sendcode>S65</sendcode>\n" + 
				"  <receivecode>T10</receivecode>\n" + 
				"  <sendername/>\n" + 
				"  <receivername/>\n" + 
				"  <senddate>20170918</senddate>\n" + 
				"  <sendtime>125624</sendtime>\n" + 
				"  <datasettype>\n" + 
				"    <typecode>1104</typecode>\n" + 
				"    <typename/>\n" + 
				"  </datasettype>\n" + 
				"  <appcode>0000</appcode>\n" + 
				"  <appmsg>正常</appmsg>\n" + 
				"  <pensioninfo>\n" + 
				"  \t<appseriono>20170918S651104000000060</appseriono>\n" + 
				"    <transtype>99</transtype>\n" + 
				"  </pensioninfo>\n" + 
				"</pensiondata>";
			
		
			
			/**
			 * 新疆自治区新版 模拟 发送 委托人 ->受托人
			 * 划款指令上传    发送报文
			 * Rs To St
			 * 1201
			 */
			public  static final String xinJiangZzqNew1201RsToStStart = 

				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
				"<pensiondata>\n" + 
				"  <version>1.0.0</version>\n" + 
				"  <sendcode>S65</sendcode>\n" + 
				"  <receivecode>T10</receivecode>\n" + 
				"  <sendername/>\n" + 
				"\t<receivername/>\n" + 
				"\t<senddate>20170918</senddate>\n" + 
				"\t<sendtime>134301</sendtime>\n" + 
				"\t<datasettype>\n" + 
				"\t\t<typecode>1201</typecode>\n" + 
				"\t\t<typename/>\n" + 
				"\t</datasettype>\n" + 
				"\t<pensioninfo>\n" + 
				"\t\t<custaccountbankid>105</custaccountbankid>\n" + 
				"\t\t<memo/>\n" + 
				"\t\t<appseriono>20170918S651201000000064</appseriono>\n" + 
				"\t\t<paybankprov/>\n" + 
				"\t\t<trustorid/>\n" + 
				"\t\t<collecttype/>\n" + 
				"\t\t<currency/>\n" + 
				"\t\t<paybank/>\n" + 
				"\t\t<custodian/>\n" + 
				"\t\t<contributionnotno>575</contributionnotno>\n" + 
				"\t\t<accountplanid/>\n" + 
				"\t\t<contribution>45011.6</contribution>\n" + 
				"\t\t<paybankid/>\n" + 
				"\t\t<contributionsum>45011.6</contributionsum>\n" + 
				"\t\t<planlicid>6500ZY201710</planlicid>\n" + 
				"\t\t<paybankaccno>1234567890987654</paybankaccno>\n" + 
				"\t\t<transtype>04</transtype>\n" + 
				"\t\t<trustaccname>新疆职业年金受托财产专户</trustaccname>\n" + 
				"\t\t<planname>中国人寿养老保险股份有限公司</planname>\n" + 
				"\t\t<trustorname/>\n" + 
				"\t\t<paybankaccname>年金财务</paybankaccname>\n" + 
				"\t\t<trustaccno>1111111</trustaccno>\n" + 
				"\t\t<contributionnotdate>20170915</contributionnotdate>\n" + 
				"\t\t<planid>221</planid>\n" + 
				"\t\t<contributiondate/>\n" + 
				"\t\t<payserial>1</payserial>\n" + 
				"\t\t<paybankcity/>\n" + 
				"\t</pensioninfo>\n" + 
				"</pensiondata>";


			/**
			 * 新疆自治区新版 模拟 发送 委托人 ->受托人
			 * 划款指令上传   响应报文
			 * Rs To St
			 * 1201
			 */
			public  static final String xinJiangZzqNew1201RsToStEnd = 
				
				
				"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
				"<pensiondata>\n" + 
				"  <version>1.0.0</version>\n" + 
				"  <sendcode>S65</sendcode>\n" + 
				"  <receivecode>T10</receivecode>\n" + 
				"  <sendername/>\n" + 
				"  <receivername/>\n" + 
				"  <senddate>20170918</senddate>\n" + 
				"  <sendtime>014223</sendtime>\n" + 
				"  <datasettype>\n" + 
				"    <typecode>1201</typecode>\n" + 
				"    <typename/>\n" + 
				"  </datasettype>\n" + 
				"  <appcode>0000</appcode>\n" + 
				"  <appmsg>正常</appmsg>\n" + 
				"  <pensioninfo>\n" + 
				"  \t<appseriono>20170918S651201000000064</appseriono>\n" + 
				"    <transtype>04</transtype>\n" + 
				"  </pensioninfo>\n" + 
				"</pensiondata>";

    /**
	* 新疆自治区新版 模拟 发送 委托人 ->受托人
	* 划款到账回执   发送报文
	* St To Rs 
	* 1203
	*/			
	public  static final String xinJiangZzqNew1203StToRsStart = 
					
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>1.0.0</version>\n" + 
		"  <sendcode>T10</sendcode>\n" + 
		"  <receivecode>S65</receivecode>\n" + 
		"  <sendername/>\n" + 
		"  <receivername/>\n" + 
		"  <senddate>20170918</senddate>\n" + 
		"  <sendtime>180744</sendtime>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>1203</typecode>\n" + 
		"    <typename/>\n" + 
		"  </datasettype>\n" + 
		"\t<pensioninfo>\n" + 
		"\t\t<accountplanid>9002777</accountplanid>\n" + 
		"\t\t<appseriono>20170918T101203000000967</appseriono>\n" + 
		"\t\t<transtype>04</transtype>\n" + 
		"\t\t<planname>中国人寿养老保险股份有限公司</planname>\n" + 
		"\t\t<planid>221</planid>\n" + 
		"\t\t<planlicid>6500ZY201710</planlicid>\n" + 
		"\t\t<enterpriseid/>\n" + 
		"\t\t<enterprisename/>\n" + 
		"\t\t<contributionnotno>575</contributionnotno>\n" + 
		"\t\t<collecttype/>\n" + 
		"\t\t<contributionsum>45011.6</contributionsum>\n" + 
		"\t\t<currency/>\n" + 
		"\t\t<custodian/>\n" + 
		"\t\t<custaccountbankid>105</custaccountbankid>\n" + 
		"\t\t<trustaccname>新疆职业年金受托财产专户</trustaccname>\n" + 
		"\t\t<trustaccno>1111111</trustaccno>\n" + 
		"\t\t<payserial>1</payserial>\n" + 
		"\t\t<enterprisebank/>\n" + 
		"\t\t<enterprisebankid/>\n" + 
		"\t\t<enterprisebankaccname>年金财务</enterprisebankaccname>\n" + 
		"\t\t<enterprisebankaccno>1234567890987654</enterprisebankaccno>\n" + 
		"\t\t<enterprisebankprov/>\n" + 
		"\t\t<enterprisebankcity/>\n" + 
		"\t\t<contribution>45011.6</contribution>\n" + 
		"\t\t<paidupamt>45011.6</paidupamt>\n" + 
		"\t\t<paidupdate>20170918141200</paidupdate>\n" + 
		"\t\t<paidupflag>1</paidupflag>\n" + 
		"\t\t<paidupnotno>1234</paidupnotno>\n" + 
		"\t\t<memo/>\n" + 
		"\t</pensioninfo>\n" + 
		"</pensiondata>";
					
					
    /**
	* 新疆自治区新版 模拟 发送 委托人 ->受托人
	* 划款到账回执   响应报文
	* St To Rs 
	* 1203
	*/			
	public  static final String xinJiangZzqNew1203StToRsEnd = 
			
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"\t<version>1.0.0</version>\n" + 
		"\t<sendcode>T10</sendcode>\n" + 
		"\t<receivecode>S65</receivecode>\n" + 
		"\t<sendername/>\n" + 
		"\t<receivername/>\n" + 
		"\t<senddate>20170918</senddate>\n" + 
		"\t<sendtime>180744</sendtime>\n" + 
		"\t<datasettype>\n" + 
		"\t\t<typecode>1203</typecode>\n" + 
		"\t\t<typename/>\n" + 
		"\t</datasettype>\n" + 
		"\t<pensioninfo>\n" + 
		"\t\t<appseriono>20170918T101203000000967</appseriono>\n" + 
		"\t</pensioninfo>\n" + 
		"\t<appcode>0000</appcode>\n" + 
		"\t<appmsg/>\n" + 
		"</pensiondata>";
			

	
	
	/**
	 * 新疆自治区新版 模拟 发送 受托人 -> 委托人 
	 * 单位净值信息上传    发送报文
	 * St To  Rs
	 * 1210
	 */	
	public  static final String xinJiangZzqNew1210StToRsStart = 
				
			"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
			"<pensiondata>\n" + 
			"  <version>1.0.0</version>\n" + 
			"  <sendcode>T10</sendcode>\n" + 
			"  <receivecode>S65</receivecode>\n" + 
			"  <sendername/>\n" + 
			"\t<receivername/>\n" + 
			"\t<senddate>20170918</senddate>\n" + 
			"\t<sendtime>184044</sendtime>\n" + 
			"\t<datasettype>\n" + 
			"\t\t<typecode>1210</typecode>\n" + 
			"\t\t<typename/>\n" + 
			"\t</datasettype>\n" + 
			"\t<pensioninfo>\n" + 
			"\t\t<appseriono>20170918T101210000000971</appseriono>\n" + 
			"\t\t<transtype>04</transtype>\n" + 
			"\t\t<planname>中国人寿养老保险股份有限公司</planname>\n" + 
			"\t\t<planid>221</planid>\n" + 
			"\t\t<planlicid>6500ZY201710</planlicid>\n" + 
			"\t\t<infotype>1</infotype>\n" + 
			"\t\t<portfolioid>71Z0000</portfolioid>\n" + 
			"\t\t<portfolioname>计划层定价</portfolioname>\n" + 
			"\t\t<assetvalue>1076340806.27</assetvalue>\n" + 
			"\t\t<price>1000.0011</price>\n" + 
			"\t\t<volume>1075158132.3276</volume>\n" + 
			"\t\t<earnloss>01</earnloss>\n" + 
			"\t\t<earn>107634.27</earn>\n" + 
			"\t\t<navincrate>1634.2</navincrate>\n" + 
			"\t\t<trustfee>0</trustfee>\n" + 
			"\t\t<investfee>0</investfee>\n" + 
			"\t\t<custodfee>0</custodfee>\n" + 
			"\t\t<priceday>20170228</priceday>\n" + 
			"\t\t<nextpriceday>20170627</nextpriceday>\n" + 
			"\t\t<memo/>\n" + 
			"\t\t<accountplanid>9002777</accountplanid>\n" + 
			"\t\t<investmantid>C02</investmantid>\n" + 
			"\t\t<investincom>0</investincom>\n" + 
			"\t\t<investuncom>0</investuncom>\n" + 
			"\t\t<currency>156</currency>\n" + 
			"\t</pensioninfo>\n" + 
			"</pensiondata>";

	/**
	 * 新疆自治区新版 模拟 发送 受托人 -> 委托人 
	 * 单位净值信息上传    响应报文
	 * St To  Rs
	 * 1210
	 */	
	public  static final String xinJiangZzqNew1210StToRsEnd = 
	
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"\t<version>1.0.0</version>\n" + 
		"\t<sendcode>T10</sendcode>\n" + 
		"\t<receivecode>S65</receivecode>\n" + 
		"\t<sendername/>\n" + 
		"\t<receivername/>\n" + 
		"\t<senddate>20170918</senddate>\n" + 
		"\t<sendtime>184044</sendtime>\n" + 
		"\t<datasettype>\n" + 
		"\t\t<typecode>1210</typecode>\n" + 
		"\t\t<typename/>\n" + 
		"\t</datasettype>\n" + 
		"\t<pensioninfo>\n" + 
		"\t\t<appseriono>20170918T101210000000971</appseriono>\n" + 
		"\t</pensioninfo>\n" + 
		"\t<appcode>0000</appcode>\n" + 
		"\t<appmsg/>\n" + 
		"</pensiondata>";

	

	/**
	 * 新疆自治区新版   委托人->   受托人 
	 * 资产估值明细下载    发送报文
	 * Rs To St  
	 * 1211
	 */
	public  static final String xinJiangZzqNew1211RsToStStart = 
				
		"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
		"<pensiondata>\n" + 
		"\t<version>1.0.0</version>\n" + 
		"\t<sendcode>S65</sendcode>\n" + 
		"\t<receivecode>T10</receivecode>\n" + 
		"\t<sendername/>\n" + 
		"\t<receivername/>\n" + 
		"\t<senddate>20170919</senddate>\n" + 
		"\t<sendtime>162101</sendtime>\n" + 
		"\t<datasettype>\n" + 
		"\t\t<typecode>1211</typecode>\n" + 
		"\t\t<typename/>\n" + 
		"\t</datasettype>\n" + 
		"\t<pensioninfo>\n" + 
		"\t\t<transtype>04</transtype>\n" + 
		"\t\t<planid>221</planid>\n" + 
		"\t\t<appseriono>20170919S651211000000023</appseriono>\n" + 
		"\t\t<portfolioid>71Z0000</portfolioid>\n" + 
		"\t\t<priceday>20170228</priceday>\n" + 
		"\t</pensioninfo>\n" + 
		"</pensiondata>";

	
	/**
	 * 新疆自治区新版   委托人->   受托人 
	 * 资产估值明细下载    响应报文
	 * Rs To St  
	 * 1211
	 */
	public  static final String xinJiangZzqNew1211RsToStEnd = 		
		
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>1.0.0</version>\n" + 
		"  <sendcode>S65</sendcode>\n" + 
		"  <receivecode>T10</receivecode>\n" + 
		"  <sendername/>\n" + 
		"  <receivername/>\n" + 
		"  <senddate>20170919</senddate>\n" + 
		"  <sendtime>042027</sendtime>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>1211</typecode>\n" + 
		"    <typename/>\n" + 
		"  </datasettype>\n" + 
		"    <appcode>0000</appcode>\n" + 
		"  \t<appmsg>正常</appmsg>\n" + 
		"  <pensioninfo>\n" + 
		"  \t<appseriono>20170919S651211000000023</appseriono>\n" + 
		"    <transtype>04</transtype>\n" + 
		"    <appcode>0000</appcode>\n" + 
		"  \t<appmsg>正常</appmsg>\n" + 
		"  \t<planid>221</planid>\n" + 
		"  \t<planname>中国人寿养老保险股份有限公司</planname>\n" + 
		"  \t<planlicid>6500ZY201710</planlicid>\n" + 
		"  \t<portfolioid>71Z0000</portfolioid>\n" + 
		"  \t<portfolioname>计划层定价</portfolioname>\n" + 
		"  \t<rows>\n" + 
		"  \t</rows>\n" + 
		" </pensioninfo>\n" + 
		"</pensiondata>";

	/**
	 * 新疆自治区新版   委托人->   受托人 
	 * 成交汇总报表上传   发送报文
	 * Rs To St  
	 * 1212
	 */
	public  static final String xinJiangZzqNew1212RsToStStart = 
					 
		"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>1.0.0</version>\n" + 
		"  <sendcode>S45</sendcode>\n" + 
		"  <receivecode>T10</receivecode>\n" + 
		"  <sendername/>\n" + 
		"  <receivername/>\n" + 
		"  <senddate>20170919</senddate>\n" + 
		"  <sendtime>170307</sendtime>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>1212</typecode>\n" + 
		"    <typename/>\n" + 
		"  </datasettype>\n" + 
		"  <pensioninfo>\n" + 
		"    <totalsalesum>0</totalsalesum>\n" + 
		"    <totalbuyamt>62000</totalbuyamt>\n" + 
		"    <memo/>\n" + 
		"    <appseriono>20170911S451212000000273</appseriono>\n" + 
		"    <otherbuyvol/>\n" + 
		"    <transsalevol/>\n" + 
		"    <currency/>\n" + 
		"    <portfolioname>计划层定价</portfolioname>\n" + 
		"    <othersalevol/>\n" + 
		"    <switchbuyvol/>\n" + 
		"    <transsalesum/>\n" + 
		"    <accountplanid>281</accountplanid>\n" + 
		"\t\t<othersalesum/>\n" + 
		"\t\t<begassetval>125534215.9</begassetval>\n" + 
		"\t\t<begassetvol>104664178.6691</begassetvol>\n" + 
		"\t\t<otherbuysum/>\n" + 
		"\t\t<planlicid>2222223333</planlicid>\n" + 
		"\t\t<paymentsalesum>0</paymentsalesum>\n" + 
		"\t\t<noinvestbuyvol/>\n" + 
		"\t\t<appreciation>1063072.79</appreciation>\n" + 
		"\t\t<planname>中国人寿年金计划</planname>\n" + 
		"\t\t<contribuyamt>62000</contribuyamt>\n" + 
		"\t\t<totalsalevol>0</totalsalevol>\n" + 
		"\t\t<finalassetvol>105550515.836</finalassetvol>\n" + 
		"\t\t<paymentsalevol>0</paymentsalevol>\n" + 
		"\t\t<noinvestsalevol/>\n" + 
		"\t\t<priceday>20170830</priceday>\n" + 
		"\t\t<totalbuyvol>886337.1669</totalbuyvol>\n" + 
		"\t\t<repbatchno>319</repbatchno>\n" + 
		"\t\t<planid>281</planid>\n" + 
		"\t\t<sumtype>H</sumtype>\n" + 
		"\t\t<switchsalevol/>\n" + 
		"\t\t<price>1.1994</price>\n" + 
		"\t\t<noinvestbuysum/>\n" + 
		"\t\t<noinvestsalesum/>\n" + 
		"\t\t<printday/>\n" + 
		"\t\t<periodinvestsum>62000</periodinvestsum>\n" + 
		"\t\t<portfolioid>T10Z0001</portfolioid>\n" + 
		"\t\t<contribuyvol>886337.1669</contribuyvol>\n" + 
		"\t\t<switchsalesum/>\n" + 
		"\t\t<finalassetval>126597288.69</finalassetval>\n" + 
		"\t\t<periodinvestvol>886337.1669</periodinvestvol>\n" + 
		"\t\t<switchbuysum/>\n" + 
		"\t</pensioninfo>\n" + 
		"</pensiondata>";

	
	
	/**
	 * 新疆自治区新版   委托人->   受托人 
	 * 成交汇总报表上传  响应报文
	 * Rs To St  
	 * 1212
	 */
	public  static final String xinJiangZzqNew1212RsToStEnd = 
	
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>1.0.0</version>\n" + 
		"  <sendcode>S45</sendcode>\n" + 
		"  <receivecode>T10</receivecode>\n" + 
		"  <sendername/>\n" + 
		"  <receivername/>\n" + 
		"  <senddate>20170919</senddate>\n" + 
		"  <sendtime>045937</sendtime>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>1212</typecode>\n" + 
		"    <typename/>\n" + 
		"  </datasettype>\n" + 
		"  <appcode>0000</appcode>\n" + 
		"  <appmsg>正常</appmsg>\n" + 
		"  <pensioninfo>\n" + 
		"  \t<appseriono>20170911S451212000000273</appseriono>\n" + 
		"    <transtype></transtype>\n" + 
		"  </pensioninfo>\n" + 
		"</pensiondata>";

	
	

	/**
	 * 新疆自治区新版   委托人->   受托人 
	 * 文件就绪通知（发放通知）    发送报文
	 * Rs To St  
	 * 1205
	 */
	public  static final String xinJiangZzqNew1205RsToStStart = 

		"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
		"<pensiondata>\n" + 
		"\t<version>1.0.0</version>\n" + 
		"\t<sendcode>S65</sendcode>\n" + 
		"\t<receivecode>T10</receivecode>\n" + 
		"\t<sendername/>\n" + 
		"\t<receivername/>\n" + 
		"\t<senddate>20170919</senddate>\n" + 
		"\t<sendtime>184902</sendtime>\n" + 
		"\t<datasettype>\n" + 
		"\t\t<typecode>1205</typecode>\n" + 
		"\t\t<typename/>\n" + 
		"\t</datasettype>\n" + 
		"\t<pensioninfo>\n" + 
		"\t\t<appseriono>20170919S651205000000100</appseriono>\n" + 
		"\t\t<transtype>04</transtype>\n" + 
		"\t\t<filename>RSS65ToSTT10_NJF01001_20170919_2068.txt.gz</filename>\n" + 
		"\t\t<filepath>2017</filepath>\n" + 
		"\t\t<planid>221</planid>\n" + 
		"\t\t<accountplanid/>\n" + 
		"\t\t<planname>中国人寿养老保险股份有限公司</planname>\n" + 
		"\t\t<planlicid>6500ZY201710</planlicid>\n" + 
		"\t\t<paymentno>2068</paymentno>\n" + 
		"\t\t<paycount>2</paycount>\n" + 
		"\t\t<paysum>162.96</paysum>\n" + 
		"\t\t<taxpayable>0</taxpayable>\n" + 
		"\t\t<aftertaxpayamt>162.96</aftertaxpayamt>\n" + 
		"\t\t<currency/>\n" + 
		"\t\t<memo/>\n" + 
		"\t\t<filesign>GMY9BLPT2H7fwuJlsQcMid3xT0yb3PQCsUOMLh9Qb/ijphKrExmjifNzUGyMCOd0nevL78lH1G1qf9zOEY/DXIRjkESpTIlzI4wqzwQegkyZ3/atTxfXdODGBVcLM2TzOayYiFQF736YedNSsh7JYOfY29BgAzRcMqWKspUqQHQ=</filesign>\n" + 
		"\t\t<aeskey>VCOYky0JIjGrxDAY</aeskey>\n" + 
		"\t</pensioninfo>\n" + 
		"</pensiondata>";

	/**
	 * 新疆自治区新版   委托人->   受托人 
	 * 文件就绪通知（发放通知）    响应报文
	 * Rs To St  
	 * 1205
	 */
	public  static final String xinJiangZzqNew1205RsToStEnd = 
		
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>1.0.0</version>\n" + 
		"  <sendcode>S65</sendcode>\n" + 
		"  <receivecode>T10</receivecode>\n" + 
		"  <sendername/>\n" + 
		"  <receivername/>\n" + 
		"  <senddate>20170919</senddate>\n" + 
		"  <sendtime>064825</sendtime>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>1205</typecode>\n" + 
		"    <typename/>\n" + 
		"  </datasettype>\n" + 
		"  <appcode>0000</appcode>\n" + 
		"  <appmsg>正常</appmsg>\n" + 
		"  <pensioninfo>\n" + 
		"  \t<appseriono>20170919S651205000000100</appseriono>\n" + 
		"  \t <appcode>0000</appcode>\n" + 
		" \t <appmsg>正常</appmsg>\n" + 
		"    <filename>RSS65ToSTT10_NJF01001_20170919_2068.txt.gz</filename>\n" + 
		"\t<filesign>GMY9BLPT2H7fwuJlsQcMid3xT0yb3PQCsUOMLh9Qb/ijphKrExmjifNzUGyMCOd0nevL78lH1G1qf9zOEY/DXIRjkESpTIlzI4wqzwQegkyZ3/atTxfXdODGBVcLM2TzOayYiFQF736YedNSsh7JYOfY29BgAzRcMqWKspUqQHQ=</filesign>\n" + 
		"  </pensioninfo>\n" + 
		"</pensiondata>";


	/**
	 * 新疆自治区新版    受托人 -> 委托人   
	 * 文件就绪通知（发放通知）    发送报文
	 * St To Rs   
	 * 9208 关于1205
	 */
	public  static final String xinJiangZzqNew9208_1205StToRsStart = 
			
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>1.0.0</version>\n" + 
		"  <sendcode>T10</sendcode>\n" + 
		"  <receivecode>S65</receivecode>\n" + 
		"  <sendername/>\n" + 
		"  <receivername/>\n" + 
		"  <senddate>20170919</senddate>\n" + 
		"  <sendtime>064826</sendtime>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>9208</typecode>\n" + 
		"    <typename/>\n" + 
		"  </datasettype>\n" + 
		"  <appcode>0000</appcode>\n" + 
		"  <appmsg>正常</appmsg>\n" + 
		"  <pensioninfo>\n" + 
		"  \t<appseriono>20170919T109208000000982</appseriono>\n" + 
		"    <transtype>04</transtype>\n" + 
		"    <filename>RSS65ToSTT10_NJF01001_20170919_2068.txt.gz</filename>\n" + 
		"\t<result>0</result>\n" + 
		"\t<errormsg/>\n" + 
		"  </pensioninfo>\n" + 
		"</pensiondata>";

	
	/**
	 * 新疆自治区新版    受托人 -> 委托人   
	 * 文件就绪通知（发放通知）    响应报文
	 * St To Rs   
	 * 9208 关于1205
	 */
	public  static final String xinJiangZzqNew9208_1205StToRsEnd = 
		
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>1.0.0</version>\n" + 
		"  <sendcode>T10</sendcode>\n" + 
		"  <receivecode>S65</receivecode>\n" + 
		"  <sendername/>\n" + 
		"  <receivername/>\n" + 
		"  <senddate>20170919</senddate>\n" + 
		"  <sendtime>064826</sendtime>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>9208</typecode>\n" + 
		"    <typename/>\n" + 
		"  </datasettype>\n" + 
		"  <appcode>0000</appcode>\n" + 
		"  <appmsg></appmsg>\n" + 
		"  <pensioninfo>\n" + 
		"  \t<appseriono>20170919T109208000000982</appseriono>\n" + 
		"    <transtype>04</transtype>\n" + 
		"    <filename>RSS65ToSTT10_NJF01001_20170919_2068.txt.gz</filename>\n" + 
		"\t<result>0</result>\n" + 
		"\t<errormsg/>\n" + 
		"  </pensioninfo>\n" + 
		"</pensiondata>";

	
	


	/**
	 * 新疆自治区新版   委托人->   受托人 
	 * 文件就绪通知（发放结果反馈通知）    发送报文
	 * St To Rs  
	 * 1208
	 */
	public  static final String xinJiangZzqNew1208StToRsStart = 
	
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"\t<version>1.0.0</version>\n" + 
		"\t<sendcode>T10</sendcode>\n" + 
		"\t<receivecode>S65</receivecode>\n" + 
		"\t<sendername/>\n" + 
		"\t<receivername/>\n" + 
		"\t<senddate>20170920</senddate>\n" + 
		"\t<sendtime>120314</sendtime>\n" + 
		"\t<datasettype>\n" + 
		"\t\t<typecode>1208</typecode>\n" + 
		"\t\t<typename/>\n" + 
		"\t</datasettype>\n" + 
		"\t<pensioninfo>\n" + 
		"\t\t<appseriono>20170920T101208000000998</appseriono>\n" + 
		"\t\t<transtype>04</transtype>\n" + 
		"\t\t<planname>中国人寿年金计划</planname>\n" + 
		"\t\t<planid>221</planid>\n" + 
		"\t\t<planlicid>6500ZY201710</planlicid>\n" + 
		"\t\t<accountplanid>9002777</accountplanid>\n" + 
		"\t\t<filename>STT10ToRSS65_NJF02001_20170920_2068.txt</filename>\n" + 
		"\t\t<filesign/>\n" + 
		"\t\t<aeskey/>\n" + 
		"\t\t<filepath/>\n" + 
		"\t\t<paymentno>2068</paymentno>\n" + 
		"\t\t<paycount>2</paycount>\n" + 
		"\t\t<paysum>162.96</paysum>\n" + 
		"\t\t<taxpayable>0</taxpayable>\n" + 
		"\t\t<aftertaxpayamt>162.96</aftertaxpayamt>\n" + 
		"\t\t<paysuccount>1</paysuccount>\n" + 
		"\t\t<paysucsum>66.56</paysucsum>\n" + 
		"\t\t<payfailcount>1</payfailcount>\n" + 
		"\t\t<payfailsum>96.40</payfailsum>\n" + 
		"\t\t<memo/>\n" + 
		"\t</pensioninfo>\n" + 
		"</pensiondata>";

	/**
	 * 新疆自治区新版   委托人->   受托人 
	 * 文件就绪通知（发放结果反馈通知）    响应报文
	 * St To Rs  
	 * 1208
	 */
	public  static final String xinJiangZzqNew1208StToRsEnd = 
		
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"\t<version>1.0.0</version>\n" + 
		"\t<sendcode>T10</sendcode>\n" + 
		"\t<receivecode>S65</receivecode>\n" + 
		"\t<sendername/>\n" + 
		"\t<receivername/>\n" + 
		"\t<senddate>20170920</senddate>\n" + 
		"\t<sendtime>120314</sendtime>\n" + 
		"\t<datasettype>\n" + 
		"\t\t<typecode>1208</typecode>\n" + 
		"\t\t<typename/>\n" + 
		"\t</datasettype>\n" + 
		"\t<pensioninfo>\n" + 
		"\t\t<filename>STT10ToRSS65_NJF02001_20170920_2068.txt.gz</filename>\n" + 
		"\t\t<filesign>C++ZfDZNBQKcCa76DSMzmN224hU4IexvqOSTwoPQsIIOzBWLA+JxesibAu5LRvWX00QK6+CRsn88f6KvASD74VC2cWiXEdOOEW34gdnGz3gab6/XsJoPkjOp9iN4ZD7cPwzKRBzVqYQ/sGeLpO1QMwltBPwrcd0aBm0I6oQdss0=</filesign>\n" + 
		"\t\t<appseriono>20170920T101208000000998</appseriono>\n" + 
		"\t</pensioninfo>\n" + 
		"\t<appcode>0000</appcode>\n" + 
		"\t<appmsg/>\n" + 
		"</pensiondata>";
	
	
	/**
	 * 新疆自治区新版    受托人 -> 委托人   
	 * 文件就绪通知（发放结果反馈通知）    发送报文
	 * Rs  To  St  
	 * 9208 关于1208
	 */
	public  static final String xinJiangZzqNew9208_1208RsToStStart = 

	"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
	"<pensiondata>\n" + 
	"\t<version>1.0.0</version>\n" + 
	"\t<sendcode>S65</sendcode>\n" + 
	"\t<receivecode>T10</receivecode>\n" + 
	"\t<sendername/>\n" + 
	"\t<receivername/>\n" + 
	"\t<senddate>20170920</senddate>\n" + 
	"\t<sendtime>124019</sendtime>\n" + 
	"\t<datasettype>\n" + 
	"\t\t<typecode>9208</typecode>\n" + 
	"\t\t<typename/>\n" + 
	"\t</datasettype>\n" + 
	"\t<pensioninfo>\n" + 
	"\t\t<transtype>99</transtype>\n" + 
	"\t\t<result>0</result>\n" + 
	"\t\t<appseriono>20170920S659208000000019</appseriono>\n" + 
	"\t\t<errormsg/>\n" + 
	"\t\t<filename>STT10ToRSS65_NJF02001_20170920_2068.txt</filename>\n" + 
	"\t</pensioninfo>\n" + 
	"</pensiondata>";
	
	
	/**
	 * 新疆自治区新版    受托人 -> 委托人   
	 * 文件就绪通知（发放结果反馈通知）    响应报文
	 * Rs  To  St  
	 * 9208 关于1208
	 */
	public  static final String xinJiangZzqNew9208_1208RsToStEnd = 
			
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>1.0.0</version>\n" + 
		"  <sendcode>S65</sendcode>\n" + 
		"  <receivecode>T10</receivecode>\n" + 
		"  <sendername/>\n" + 
		"  <receivername/>\n" + 
		"  <senddate>20170920</senddate>\n" + 
		"  <sendtime>123939</sendtime>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>9208</typecode>\n" + 
		"    <typename/>\n" + 
		"  </datasettype>\n" + 
		"  <appcode>0000</appcode>\n" + 
		"  <appmsg>正常</appmsg>\n" + 
		"  <pensioninfo>\n" + 
		"   \t<appseriono>20170920S659208000000019</appseriono>\n" + 
		"    <transtype>99</transtype>\n" + 
		"    <filename>STT10ToRSS65_NJF02001_20170920_2068.txt</filename>\n" + 
		"\t<result>0</result>\n" + 
		"\t<errormsg></errormsg>\n" + 
		"  </pensioninfo>\n" + 
		"</pensiondata>";
	
	
	
	/**
	 * 新疆自治区新版    委托人 -> 受托人   
	 * 通用交易查询    发送报文
	 * St To Rs   
	 * 0102
	 */
	public  static final String xinJiangZzqNew0102RsToStStart = 
			
		"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>1.0.0</version>\n" + 
		"  <sendcode>S65</sendcode>\n" + 
		"  <receivecode>T10</receivecode>\n" + 
		"  <sendername/>\n" + 
		"  <receivername/>\n" + 
		"  <senddate>20170922</senddate>\n" + 
		"  <sendtime>100740</sendtime>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>0102</typecode>\n" + 
		"    <typename/>\n" + 
		"  </datasettype>\n" + 
		"  <pensioninfo>\n" + 
		"    <appseriono>20170922S650102000000002</appseriono>\n" + 
		"    <transtype>07</transtype>\n" + 
		"    <oldappseriono>20170921S651101000000016</oldappseriono>\n" + 
		"  </pensioninfo>\n" + 
		"  <oldpensioninfo>\n" + 
		"    <custaccountbankid>105</custaccountbankid>\n" + 
		"    <unifiedplanlicid>6500ZY00</unifiedplanlicid>\n" + 
		"    <memo/>\n" + 
		"    <appseriono>20170921S651101000000016</appseriono>\n" + 
		"    <trustorid>S65</trustorid>\n" + 
		"    <planlicdate/>\n" + 
		"    <lastupddate>20170921</lastupddate>\n" + 
		"    <investrate>0.3</investrate>\n" + 
		"    <custodian>中国建设银行</custodian>\n" + 
		"    <accountplanid>9002777</accountplanid>\n" + 
		"    <trusteeid>T10</trusteeid>\n" + 
		"    <planlicid>6500ZY201710</planlicid>\n" + 
		"    <transtype>02</transtype>\n" + 
		"    <planbegdate>20140908</planbegdate>\n" + 
		"    <trusteefee>0.001</trusteefee>\n" + 
		"    <unifiedcustodianid/>\n" + 
		"    <trustaccname>新疆职业年金受托财产专户</trustaccname>\n" + 
		"    <planatt>03</planatt>\n" + 
		"    <planname>中国人寿养老保险股份有限公司</planname>\n" + 
		"    <plantype>2</plantype>\n" + 
		"    <unifiedtrusteeid/>\n" + 
		"    <custodianfee>0.001</custodianfee>\n" + 
		"    <custodianid>C01</custodianid>\n" + 
		"    <planenddate/>\n" + 
		"    <trustaccno>1111111</trustaccno>\n" + 
		"    <planid>221</planid>\n" + 
		"    <drawrate>0.2</drawrate>\n" + 
		"    <trustconno/>\n" + 
		"    <unifiedplanname>新疆维吾尔自治区职业年金测试集合计划</unifiedplanname>\n" + 
		"  </oldpensioninfo>\n" + 
		"</pensiondata>";

	/**
	 * 新疆自治区新版    委托人 -> 受托人   
	 * 通用交易查询    响应报文
	 * St To Rs   
	 * 0102
	 */
	public  static final String xinJiangZzqNew0102RsToStEnd = 
	

		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>1.0.0</version>\n" + 
		"  <sendcode>S65</sendcode>\n" + 
		"  <receivecode>T10</receivecode>\n" + 
		"  <sendername/>\n" + 
		"  <receivername/>\n" + 
		"  <senddate>20170922</senddate>\n" + 
		"  <sendtime>100658</sendtime>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>0102</typecode>\n" + 
		"    <typename/>\n" + 
		"  </datasettype>\n" + 
		"  <appcode>0000</appcode>\n" + 
		"  <appmsg>正常</appmsg>\n" + 
		"  <oldAppCode>0000</oldAppCode>\n" + 
		"  <oldAppMsg></oldAppMsg>\n" + 
		"  <pensioninfo>\n" + 
		"  \t<appseriono>20170922S650102000000002</appseriono>\n" + 
		"    <transtype>07</transtype>\n" + 
		"    <oldappseriono>20170921S651101000000016</oldappseriono>\n" + 
		"  </pensioninfo>\n" + 
		"  <oldpensioninfo/>\n" + 
		"</pensiondata>";


	/**
	 * 新疆自治区新版    受托人 -> 委托人    
	 * 通用交易查询    发送报文
	 * St To Rs   
	 * 0102
	 */
	public  static final String xinJiangZzqNew0102StToRsStart = 	
		
		"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>1.0.0</version>\n" + 
		"  <sendcode>T10</sendcode>\n" + 
		"  <receivecode>S65</receivecode>\n" + 
		"  <sendername/>\n" + 
		"  <receivername/>\n" + 
		"  <senddate>20170922</senddate>\n" + 
		"  <sendtime>112204</sendtime>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>0102</typecode>\n" + 
		"    <typename/>\n" + 
		"  </datasettype>\n" + 
		"\t<pensioninfo>\n" + 
		"\t\t<appseriono>20170922T100102000001069</appseriono>\n" + 
		"\t\t<transtype>07</transtype>\n" + 
		"\t\t<oldappseriono>201700915T100101000000115</oldappseriono>\n" + 
		"\t</pensioninfo>\n" + 
		"\t<oldpensioninfo>\n" + 
		"\t\t<transtype>99</transtype>\n" + 
		"\t</oldpensioninfo>\n" + 
		"</pensiondata>";

	/**
	 * 新疆自治区新版    受托人 -> 委托人    
	 * 通用交易查询    发送报文
	 * St To Rs   
	 * 0102
	 */
	public  static final String xinJiangZzqNew0102StToRsEnd = 	
			
		"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>1.0.0</version>\n" + 
		"  <sendcode>T10</sendcode>\n" + 
		"  <receivecode>S65</receivecode>\n" + 
		"  <sendername/>\n" + 
		"  <receivername/>\n" + 
		"  <senddate>20170922</senddate>\n" + 
		"  <sendtime>112204</sendtime>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>0102</typecode>\n" + 
		"    <typename/>\n" + 
		"  </datasettype>\n" + 
		"  <pensioninfo>\n" + 
		"    <appseriono>20170922T100102000001069</appseriono>\n" + 
		"    <transtype>07</transtype>\n" + 
		"    <oldappseriono>201700915T100101000000115</oldappseriono>\n" + 
		"  </pensioninfo>\n" + 
		"  <appcode>0000</appcode>\n" + 
		"  <appmsg/>\n" + 
		"  <oldappcode>0000</oldappcode>\n" + 
		"  <oldappmsg/>\n" + 
		"  <oldpensioninfo>\n" + 
		"    <appseriono>201700915T100101000000115</appseriono>\n" + 
		"    <transtype>99</transtype>\n" + 
		"  </oldpensioninfo>\n" + 
		"</pensiondata>";

/***end* 新疆新版*******新疆新版*******新疆新版*********新疆新版*********新疆新版*********新疆新版********************************/	
	
/***start*****福建****福建******福建*******福建***********福建********福建*****福建**********/
	
	/**
	 * 福建 划款指令 代理人发受托人
	 *  发送报文
	 * 359900 to 313222
	 * NJB01201
	 */
	public final static String fuJianNJB01201Start = 
			"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
			"<msgtext>\n" + 
			"\t<grphdr>\n" + 
			"\t\t<version>1.0.0</version>\n" + 
			"\t\t<ref>35990020170911372261</ref>\n" + 
			"\t\t<buscd>NJB01201</buscd>\n" + 
			"\t\t<tradsrc>RS</tradsrc>\n" + 
			"\t\t<sender>359900</sender>\n" + 
			"\t\t<recver>313222</recver>\n" + 
			"\t\t<date>20170911</date>\n" + 
			"\t\t<time>103520</time>\n" + 
			"\t</grphdr>\n" + 
			"\t<busitext>\n" + 
			"\t\t<aaz482>-8446744073709551073</aaz482>\n" + 
			"\t\t<aaz434>2200000000000026</aaz434>\n" + 
			"\t\t<aae019_hj>981461.08</aae019_hj>\n" + 
			"\t\t<aae010_tg>1111111</aae010_tg>\n" + 
			"\t\t<aae009_tg>人保</aae009_tg>\n" + 
			"\t\t<rows>\n" + 
			"\t\t\t<row>\n" + 
			"\t\t\t\t<aae010_sb>1111111</aae010_sb>\n" + 
			"\t\t\t\t<aae009_sb>人保</aae009_sb>\n" + 
			"\t\t\t\t<aae019>981461.08</aae019>\n" + 
			"\t\t\t\t<bae275>01</bae275>\n" + 
			"\t\t</row>\n" + 
			"\t\t</rows>\n" + 
			"\t</busitext>\n" + 
			"</msgtext>";

	/**
	 * 福建 划款指令 代理人发受托人 
	 *  响应报文
	 * 313222 to 359900  
	 * NJB01201
	 */
	public final static String fuJianNJB01201End = 
			"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
			"<msgtext>\n" + 
			"\t<grphdr>\n" + 
			"\t\t<version>1.0.0</version>\n" + 
			"\t\t<ref>35990020170911372261</ref>\n" + 
			"\t\t<buscd>NJB01201</buscd>\n" + 
			"\t\t<tradsrc>RS</tradsrc>\n" + 
			"\t\t<sender>359900</sender>\n" + 
			"\t\t<recver>313222</recver>\n" + 
			"\t\t<date>20170911</date>\n" + 
			"\t\t<time>103523</time>\n" + 
			"\t\t<appcode>0000</appcode>\n" + 
			"\t\t<appmsg>正常</appmsg>\n" + 
			"\t</grphdr>\n" + 
			"\t<busitext>\n" + 
			"\t</busitext>\n" + 
			"</msgtext>";

	/**
	 * 福建  到账反馈 受托人发代理人
	 * 发送报文
	 * 313222 to 359900  
	 * NJB02201
	 */
	public final static String fuJianNJB02201Start = 	
		
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<msgtext>\n" + 
		"\t<grphdr>\n" + 
		"\t\t<version>1.0.0</version>\n" + 
		"\t\t<ref>S0120170913006581</ref>\n" + 
		"\t\t<buscd>NJB02201</buscd>\n" + 
		"\t\t<tradsrc>RS</tradsrc>\n" + 
		"\t\t<sender>S01</sender>\n" + 
		"\t\t<recver>T01</recver>\n" + 
		"\t\t<date>20170913</date>\n" + 
		"\t\t<time>142330</time>\n" + 
		"\t</grphdr>\n" + 
		"\t<busitext>\n" + 
		"\t\t<aaz482>-8446744073709551073</aaz482>\n" + 
		"\t\t<aaz434>2200000000000026</aaz434>\n" + 
		"\t\t<aae010_tg>1111111</aae010_tg>\n" + 
		"\t\t<aae009_tg>人保</aae009_tg>\n" + 
		"\t\t<aae019_hj>981461.085</aae019_hj>\n" + 
		"\t\t<rows>\n" + 
		"\t\t\t<row>\n" + 
		"\t\t\t\t<aae010_sb>1111111</aae010_sb>\n" + 
		"\t\t\t\t<aae009_sb>人保</aae009_sb>\n" + 
		"\t\t\t\t<aae019>981461.08</aae019>\n" + 
		"\t\t\t\t<aie194>1</aie194>\n" + 
		"\t\t\t\t<aae036_tg>20170912174853</aae036_tg>\n" + 
		"\t\t\t\t<bae275>01</bae275>\n" + 
		"\t\t\t</row>\n" + 
		"\t\t</rows>\n" + 
		"\t\t<aae013>成功</aae013>\n" + 
		"\t</busitext>\n" + 
		"</msgtext>";

	

	/**
	 * 福建  到账反馈 受托人发代理人
	 * 响应报文
	 * 359900  to 313222  
	 * NJB02201
	 */
	public final static String fuJianNJB02201End = 	

		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<msgtext>\n" + 
		"\t<grphdr>\n" + 
		"\t\t<version>1.0.0</version>\n" + 
		"\t\t<ref>S0120170912006577</ref>\n" + 
		"\t\t<buscd>NJB02201</buscd>\n" + 
		"\t\t<tradsrc>ST</tradsrc>\n" + 
		"\t\t<sender>359900</sender>\n" + 
		"\t\t<recver>313222</recver>\n" + 
		"\t\t<date>20170912</date>\n" + 
		"\t\t<time>175508</time>\n" + 
		"\t\t<appcode>0000</appcode>\n" + 
		"\t\t<appmsg/>\n" + 
		"\t</grphdr>\n" + 
		"\t<busitext/>\n" + 
		"</msgtext>";

	

	/**
	 * 福建  单位净值信息上传  受托人发代理人
	 * 发送报文
	 *  313222 to 359900  
	 * NJB02202
	 */
	public final static String fuJianNJB02202Start = 	
			
			"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
			"<msgtext>\n" + 
			"\t<grphdr>\n" + 
			"\t\t<version>1.0.0</version>\n" + 
			"\t\t<ref>T0120170913006580</ref>\n" + 
			"\t\t<buscd>NJB02202</buscd>\n" + 
			"\t\t<tradsrc>RS</tradsrc>\n" + 
			"\t\t<sender>T01</sender>\n" + 
			"\t\t<recver>S01</recver>\n" + 
			"\t\t<date>20170913</date>\n" + 
			"\t\t<time>140401</time>\n" + 
			"\t</grphdr>\n" + 
			"\t<busitext>\n" + 
			"\t\t<aaz434>2200000000000026</aaz434>\n" + 
			"\t\t<aie077>1100ZY201602</aie077>\n" + 
			"\t\t<aie177>1</aie177>\n" + 
			"\t\t<rows>\n" + 
			"\t\t\t<row>\n" + 
			"\t\t\t\t<aaz430>2200000000000026</aaz430>\n" + 
			"\t\t\t\t<aie138>人保计划</aie138>\n" + 
			"\t\t\t\t<aaz429>200000000000000723</aaz429>\n" + 
			"\t\t\t\t<aie136>20170930</aie136>\n" + 
			"\t\t\t\t<aie134>1.0050</aie134>\n" + 
			"\t\t\t\t<aie167>971252.95</aie167>\n" + 
			"\t\t\t\t<aie168>976109.21475</aie168>\n" + 
			"\t\t\t\t<aie093_st>0</aie093_st>\n" + 
			"\t\t\t\t<aie093_tg>0</aie093_tg>\n" + 
			"\t\t\t\t<aie093_tz>0</aie093_tz>\n" + 
			"\t\t\t</row>\n" + 
			"\t\t</rows>\n" + 
			"\t</busitext>\n" + 
			"</msgtext>";

	/**
	 * 福建  单位净值信息上传  受托人发代理人
	 * 响应报文
	 * 359900  to 313222  
	 * NJB02202
	 */
	public final static String fuJianNJB02202End = 	
		
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<msgtext>\n" + 
		"\t<grphdr>\n" + 
		"\t\t<version>1.0.0</version>\n" + 
		"\t\t<ref>T0120170913006580</ref>\n" + 
		"\t\t<buscd>NJB02202</buscd>\n" + 
		"\t\t<tradsrc>ST</tradsrc>\n" + 
		"\t\t<sender>359900</sender>\n" + 
		"\t\t<recver>313222</recver>\n" + 
		"\t\t<date>20170913</date>\n" + 
		"\t\t<time>140404</time>\n" + 
		"\t\t<appcode>0000</appcode>\n" + 
		"\t\t<appmsg/>\n" + 
		"\t</grphdr>\n" + 
		"\t<busitext/>\n" + 
		"</msgtext>";

	
/***end*****福建****福建******福建*******福建***********福建********福建*****福建**********/
	
	
/****start**江苏****江苏****江苏****江苏*****江苏*****江苏****江苏****江苏****江苏*******************************/
	
	
	
	/**
	 * 江苏 连通性测试 委托人-> 受托人
	 * S32  to  T10 发送报文
	 * 0101
	 */
	public final static String jiangSu0101RsToStStart = 
		
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>V1.0</version>\n" + 
		"  <sendcode>S32</sendcode>\n" + 
		"  <receivecode>T10</receivecode>\n" + 
		"  <senddate>20170929</senddate>\n" + 
		"  <sendtime>104750</sendtime>\n" + 
		"  <dgst>连通性测试</dgst>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>0101</typecode>\n" + 
		"    <typename>连通性测试</typename>\n" + 
		"  </datasettype>\n" + 
		"  <pensioninfo>\n" + 
		"    <appseriono>000120170929000668</appseriono>\n" + 
		"    <transtype>04</transtype>\n" + 
		"  </pensioninfo>\n" + 
		"</pensiondata>";

	
	/**
	 * 江苏 连通性测试 委托人-> 受托人
	 * S32  to  T10 响应报文
	 * 0101
	 */
	public final static String jiangSu0101RsToStEnd = 
		
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"\t<version>1.0.0</version>\n" + 
		"\t<sendcode>S32</sendcode>\n" + 
		"\t<receivecode>T10</receivecode>\n" + 
		"\t<sendername/>\n" + 
		"\t<receivername/>\n" + 
		"\t<senddate>20170929</senddate>\n" + 
		"\t<sendtime>104836</sendtime>\n" + 
		"\t<dgst>消息报文示例</dgst>\n" + 
		"\t<datasettype>\n" + 
		"\t\t<typecode>0101</typecode>\n" + 
		"\t\t<typename>连通性测试</typename>\n" + 
		"  </datasettype>\n" + 
		"  <pensioninfo>\n" + 
		"    <appseriono>null</appseriono>\n" + 
		"    <transtype>null</transtype>\n" + 
		"  </pensioninfo>\n" + 
		"  <appcode>0000</appcode>\n" + 
		"  <appmsg/>\n" + 
		"</pensiondata>";

	
	/**
	* 江苏  委托人-> 受托人
	* 计划基本信息下载
	* T10 to S32   发送报文 
	* 0101
	*/
	public final static String jiangSu1101RsToStStart = 
			 
		
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>V1.0</version>\n" + 
		"  <sendcode>S32</sendcode>\n" + 
		"  <receivecode>T10</receivecode>\n" + 
		"  <senddate>20170929</senddate>\n" + 
		"  <sendtime>111609</sendtime>\n" + 
		"  <dgst>计划基本信息</dgst>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>1101</typecode>\n" + 
		"    <typename>计划基本信息上传</typename>\n" + 
		"  </datasettype>\n" + 
		"  <pensioninfo>\n" + 
		"    <appseriono>000120170929000670</appseriono>\n" + 
		"    <transtype>02</transtype>\n" + 
		"    <planid>0001AA1000000000000L</planid>\n" + 
		"    <accountplanid>000001</accountplanid>\n" + 
		"    <planname>江苏职业年金统一计划AA</planname>\n" + 
		"    <planlicid>3200ZY20170929</planlicid>\n" + 
		"    <planlicdate/>\n" + 
		"    <planatt>03</planatt>\n" + 
		"    <plantype/>\n" + 
		"    <trustconno/>\n" + 
		"    <trusteeid>S32</trusteeid>\n" + 
		"    <custodianid>000001</custodianid>\n" + 
		"    <trustorid>S32</trustorid>\n" + 
		"    <unifiedplanlicid>3200ZY00</unifiedplanlicid>\n" + 
		"    <unifiedplanname/>\n" + 
		"    <unifiedcustodianid/>\n" + 
		"    <unifiedtrusteeid/>\n" + 
		"    <planbegdate/>\n" + 
		"    <planenddate/>\n" + 
		"    <trusteefee/>\n" + 
		"    <custodianfee/>\n" + 
		"    <custodian/>\n" + 
		"    <custaccountbankid/>\n" + 
		"    <trustaccname>农行</trustaccname>\n" + 
		"    <trustaccno>349856</trustaccno>\n" + 
		"    <collectionbank/>\n" + 
		"    <collectionbankid/>\n" + 
		"    <collectionbankcity/>\n" + 
		"    <collectionbankprov/>\n" + 
		"    <collectionbankname>中国银行年金账户</collectionbankname>\n" + 
		"    <collectionbankno>1239895</collectionbankno>\n" + 
		"    <lastupddate>20170929</lastupddate>\n" + 
		"    <regplacecode>3200</regplacecode>\n" + 
		"    <memo/>\n" + 
		"  </pensioninfo>\n" + 
		"</pensiondata>";



	/**
	 * 江苏  委托人-> 受托人
	 * 计划基本信息下载
	 * T10 to S32   响应报文 
	 * 0101
	 */
	public final static String jiangSu1101RsToStEnd = 
		 

	"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
	"<pensiondata>\n" + 
	"  <version>1.0.0</version>\n" + 
	"  <sendcode>S32</sendcode>\n" + 
	"  <receivecode>T10</receivecode>\n" + 
	"  <sendername/>\n" + 
	"  <receivername/>\n" + 
	"  <senddate>20170929</senddate>\n" + 
	"  <sendtime>111638</sendtime>\n" + 
	"  <datasettype>\n" + 
	"    <typecode>1101</typecode>\n" + 
	"    <typename/>\n" + 
	"  </datasettype>\n" + 
	"  <appcode>0000</appcode>\n" + 
	"  <appmsg>正常</appmsg>\n" + 
	"  <pensioninfo>\n" + 
	"    <appseriono>000120170929000670</appseriono>\n" + 
	"    <transtype>02</transtype>\n" + 
	"  </pensioninfo>\n" + 
	"</pensiondata>\n" + 
	"";


	/**
	* 江苏 模拟 发送 委托人 ->受托人
	* 投资组合信息推送发送报文
	* 1102
	*/
		
	public final static String jiangSu1102RsToStStart=			
					
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>V1.0</version>\n" + 
		"  <sendcode>S32</sendcode>\n" + 
		"  <receivecode>T10</receivecode>\n" + 
		"  <senddate>20170929</senddate>\n" + 
		"  <sendtime>124120</sendtime>\n" + 
		"  <dgst>投资组合信息</dgst>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>1102</typecode>\n" + 
		"    <typename>投资组合基本信息上传</typename>\n" + 
		"  </datasettype>\n" + 
		"  <pensioninfo>\n" + 
		"    <appseriono>000120170929000679</appseriono>\n" + 
		"    <transtype>02</transtype>\n" + 
		"    <planid>0001AA1000000000000L</planid>\n" + 
		"    <accountplanid>000001</accountplanid>\n" + 
		"    <planname>江苏职业年金统一计划AA</planname>\n" + 
		"    <planlicid>3200ZY20170929</planlicid>\n" + 
		"    <rows>\n" + 
		"      <row>\n" + 
		"        <portfolioid>90001</portfolioid>\n" + 
		"        <portfolioname>统一投资组合</portfolioname>\n" + 
		"        <investmantid/>\n" + 
		"        <custodianid/>\n" + 
		"        <custodian/>\n" + 
		"        <custaccountbankid/>\n" + 
		"        <trustaccno/>\n" + 
		"        <trustaccname/>\n" + 
		"        <rescustodian/>\n" + 
		"        <rescustactbankid/>\n" + 
		"        <restrustaccno/>\n" + 
		"        <restrustaccname/>\n" + 
		"        <currency>156</currency>\n" + 
		"        <investmanager/>\n" + 
		"        <portfoliobegdate>20170928</portfoliobegdate>\n" + 
		"        <portfolioenddate/>\n" + 
		"        <rounding/>\n" + 
		"        <dealingperiod/>\n" + 
		"        <investmentrate/>\n" + 
		"        <investratedesc/>\n" + 
		"        <trusteefee/>\n" + 
		"        <trusteefeedesc/>\n" + 
		"        <custodianfee/>\n" + 
		"        <custodianfeedesc/>\n" + 
		"        <portfoliooriprice>1</portfoliooriprice>\n" + 
		"        <portfoliostat/>\n" + 
		"        <firstpricedate/>\n" + 
		"        <lastupddate/>\n" + 
		"        <memo/>\n" + 
		"        <stockmanager/>\n" + 
		"        <fixincmanager/>\n" + 
		"        <portfoliotype/>\n" + 
		"        <investrate/>\n" + 
		"        <drawrate/>\n" + 
		"      </row>\n" + 
		"    </rows>\n" + 
		"  </pensioninfo>\n" + 
		"</pensiondata>";

	/**
	* 江苏 模拟 发送 委托人 ->受托人
	* 投资组合信息推送  响应报文
	* 1102
	*/
		
	public final static String jiangSu1102RsToStEnd=			

		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>1.0.0</version>\n" + 
		"  <sendcode>S32</sendcode>\n" + 
		"  <receivecode>T10</receivecode>\n" + 
		"  <sendername/>\n" + 
		"  <receivername/>\n" + 
		"  <senddate>20170929</senddate>\n" + 
		"  <sendtime>124150</sendtime>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>1102</typecode>\n" + 
		"    <typename/>\n" + 
		"  </datasettype>\n" + 
		"  <appcode>0000</appcode>\n" + 
		"  <appmsg>正常</appmsg>\n" + 
		"  <pensioninfo>\n" + 
		"    <appseriono>000120170929000679</appseriono>\n" + 
		"    <transtype>02</transtype>\n" + 
		"  </pensioninfo>\n" + 
		"</pensiondata>";

			
	
	
	
	
	
	/**
	 * 江苏 模拟 发送 委托人 ->受托人
	 * 定价日信息推送发送报文
	 * Rs To St
	 * 1104
	 */
	
	
	public final static String jiangSu1104RsToStStart=			
					
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>V1.0</version>\n" + 
		"  <sendcode>S32</sendcode>\n" + 
		"  <receivecode>T10</receivecode>\n" + 
		"  <senddate>20170929</senddate>\n" + 
		"  <sendtime>132821</sendtime>\n" + 
		"  <dgst>定价日信息</dgst>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>1104</typecode>\n" + 
		"    <typename>定价日信息</typename>\n" + 
		"  </datasettype>\n" + 
		"  <pensioninfo>\n" + 
		"    <appseriono>000120170929000680</appseriono>\n" + 
		"    <transtype>1</transtype>\n" + 
		"    <accountplanid/>\n" + 
		"    <planid>0001AA1000000000000L</planid>\n" + 
		"    <planname>江苏职业年金统一计划AA</planname>\n" + 
		"    <planlicid>3200ZY20170929</planlicid>\n" + 
		"    <year>2017</year>\n" + 
		"    <rows>\n" + 
		"      <row>\n" + 
		"        <pricedate>20171001</pricedate>\n" + 
		"        <status>1</status>\n" + 
		"      </row>\n" + 
		"      <row>\n" + 
		"        <pricedate>20171101</pricedate>\n" + 
		"        <status>1</status>\n" + 
		"      </row>\n" + 
		"      <row>\n" + 
		"        <pricedate>20171201</pricedate>\n" + 
		"        <status>1</status>\n" + 
		"      </row>\n" + 
		"    </rows>\n" + 
		"    <lastupddate>20170929</lastupddate>\n" + 
		"    <memo/>\n" + 
		"  </pensioninfo>\n" + 
		"</pensiondata>";

	
	/**
	 * 江苏 模拟 发送 委托人 ->受托人
	 * 定价日信息推送  响应报文
	 * Rs To St
	 * 1104
	 */
	
	
	public final static String jiangSu1104RsToStEnd=			
		
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>1.0.0</version>\n" + 
		"  <sendcode>S32</sendcode>\n" + 
		"  <receivecode>T10</receivecode>\n" + 
		"  <sendername/>\n" + 
		"  <receivername/>\n" + 
		"  <senddate>20170929</senddate>\n" + 
		"  <sendtime>012850</sendtime>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>1104</typecode>\n" + 
		"    <typename/>\n" + 
		"  </datasettype>\n" + 
		"  <appcode>0000</appcode>\n" + 
		"  <appmsg>正常</appmsg>\n" + 
		"  <pensioninfo>\n" + 
		"    <appseriono>000120170929000680</appseriono>\n" + 
		"    <transtype>1</transtype>\n" + 
		"  </pensioninfo>\n" + 
		"</pensiondata>";
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 江苏 发送 委托人 ->受托人
	 * 年金管理人信息推送 发送报文
	 * 1103 
	 */
 	public static final String jiangSu1103RsToStStart = 
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
		"<pensiondata>\n" + 
		"  <version>V1.0</version>\n" + 
		"  <sendcode>S32</sendcode>\n" + 
		"  <receivecode>null</receivecode>\n" + 
		"  <senddate>20170920</senddate>\n" + 
		"  <sendtime>120356</sendtime>\n" + 
		"  <dgst>年金管理人信息</dgst>\n" + 
		"  <datasettype>\n" + 
		"    <typecode>1103</typecode>\n" + 
		"    <typename>年金管理人信息</typename>\n" + 
		"  </datasettype>\n" + 
		"  <pensioninfo>\n" + 
		"    <appseriono>000120170920000553</appseriono>\n" + 
		"    <transtype>2</transtype>\n" + 
		"    <planid/>\n" + 
		"    <accountplanid/>\n" + 
		"    <planlicid>3600ZY20170920</planlicid>\n" + 
		"    <rows>\n" + 
		"      <row>\n" + 
		"        <institutionid/>\n" + 
		"        <institutionname/>\n" + 
		"        <institutionorgid>null</institutionorgid>\n" + 
		"        <socialcreditcode/>\n" + 
		"        <institutiontype>01</institutiontype>\n" + 
		"        <licensetype>01</licensetype>\n" + 
		"        <licensenum>null</licensenum>\n" + 
		"        <subinstid/>\n" + 
		"        <subinstaddr/>\n" + 
		"        <subinstpostcode/>\n" + 
		"        <telephone>12580</telephone>\n" + 
		"        <contactp>李磊2</contactp>\n" + 
		"        <email/>\n" + 
		"        <fax/>\n" + 
		"        <address>北京市公安厅</address>\n" + 
		"        <lastupddate>20170920</lastupddate>\n" + 
		"        <memo/>\n" + 
		"      </row>\n" + 
		"      <row>\n" + 
		"        <institutionid/>\n" + 
		"        <institutionname/>\n" + 
		"\t\t\t\t<institutionorgid>null</institutionorgid>\n" + 
		"\t\t\t\t<socialcreditcode/>\n" + 
		"\t\t\t\t<institutiontype>02</institutiontype>\n" + 
		"\t\t\t\t<licensetype>02</licensetype>\n" + 
		"\t\t\t\t<licensenum>null</licensenum>\n" + 
		"\t\t\t\t<subinstid/>\n" + 
		"\t\t\t\t<subinstaddr/>\n" + 
		"\t\t\t\t<subinstpostcode/>\n" + 
		"\t\t\t\t<telephone>010-68098143</telephone>\n" + 
		"\t\t\t\t<contactp>杨明生</contactp>\n" + 
		"\t\t\t\t<email>shifengyi@cebbank.com</email>\n" + 
		"\t\t\t\t<fax>010-68098204</fax>\n" + 
		"\t\t\t\t<address>北京市西城区金融大街中国人寿广场</address>\n" + 
		"\t\t\t\t<lastupddate>20170920</lastupddate>\n" + 
		"\t\t\t\t<memo/>\n" + 
		"\t\t\t</row>\n" + 
		"\t\t\t<row>\n" + 
		"\t\t\t\t<institutionid/>\n" + 
		"\t\t\t\t<institutionname/>\n" + 
		"\t\t\t\t<institutionorgid>null</institutionorgid>\n" + 
		"\t\t\t\t<socialcreditcode/>\n" + 
		"\t\t\t\t<institutiontype>03</institutiontype>\n" + 
		"\t\t\t\t<licensetype>03</licensetype>\n" + 
		"\t\t\t\t<licensenum>null</licensenum>\n" + 
		"\t\t\t\t<subinstid/>\n" + 
		"\t\t\t\t<subinstaddr/>\n" + 
		"\t\t\t\t<subinstpostcode/>\n" + 
		"\t\t\t\t<telephone>12580</telephone>\n" + 
		"\t\t\t\t<contactp>坚坚2</contactp>\n" + 
		"\t\t\t\t<email/>\n" + 
		"\t\t\t\t<fax/>\n" + 
		"\t\t\t\t<address>北京市公安厅</address>\n" + 
		"\t\t\t\t<lastupddate>20170920</lastupddate>\n" + 
		"\t\t\t\t<memo/>\n" + 
		"\t\t\t</row>\n" + 
		"\t\t</rows>\n" + 
		"\t</pensioninfo>\n" + 
		"</pensiondata>";

 /****end**江苏****江苏****江苏****江苏*****江苏*****江苏****江苏****江苏****江苏*******************************/
 	
 	
}
