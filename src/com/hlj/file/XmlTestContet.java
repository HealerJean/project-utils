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
	public final static String xinjiangjsbtSYS02000T10ToR66 =	
	
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
	public final static String xinjiangjsbtSYS02000R66ToT10 =	
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
	



	
	/**
	 * 新疆自治区新版 连通性测试 响应报文
	 * T10 to R65
	 * 0101
	 */
	public final static String xinjiangzzqnew0101T10ToR65 = 
			"<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
			"<pensiondata>\n" + 
			"<version>1.0.0</version>\n" + 
			"<ref>s6620170911110955</ref>\n" + 
			"<sendcode>T10</sendcode>\n" + 
			"<receivecode>S65</receivecode>\n" + 
			"<senddate>20170911</senddate>\n" + 
			"<sendtime>235959</sendtime>\n" + 
			"<dgst>消息报文示例</dgst>\n" + 
			"<appcode>0000</appcode>\n" + 
			"<appmsg>成功</appmsg>\n" + 
			"<datasettype>\n" + 
			"\t<typecode>0101</typecode>\n" + 
			"<typename>连通性测试</typename>\n" + 
			"<recordnumber>1</recordnumber>\n" + 
			"\t\t<mainflag>1</mainflag>\n" + 
			"</datasettype>\n" + 
			"<pensioninfo>\n" + 
			"<planinfo>\n" + 
			"<appseriono>000000000000101000000001</appseriono>\n" + 
			"<transtype>99</transtype>\n" + 
			"</planinfo>\n" + 
			"</pensioninfo>\n" + 
			"</pensiondata>";
	
	
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
			"\t\t<aae009_tg>国寿</aae009_tg>\n" + 
			"\t\t<rows>\n" + 
			"\t\t\t<row>\n" + 
			"\t\t\t\t<aae010_sb>1111111</aae010_sb>\n" + 
			"\t\t\t\t<aae009_sb>国寿</aae009_sb>\n" + 
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
		"\t\t<aae009_tg>国寿</aae009_tg>\n" + 
		"\t\t<aae019_hj>981461.085</aae019_hj>\n" + 
		"\t\t<rows>\n" + 
		"\t\t\t<row>\n" + 
		"\t\t\t\t<aae010_sb>1111111</aae010_sb>\n" + 
		"\t\t\t\t<aae009_sb>国寿</aae009_sb>\n" + 
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
			"\t\t\t\t<aie138>国寿计划</aie138>\n" + 
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
	
}
