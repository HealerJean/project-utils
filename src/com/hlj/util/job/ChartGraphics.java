package com.hlj.util.job;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import javax.imageio.ImageIO;

public class ChartGraphics {
    private BufferedImage image;
    private int imageWidth = 900;  //图片的宽度
    private int imageHeight = 1480; //图片的高度
    //生成图片文件
    @SuppressWarnings("restriction")
    public void createImage(String fileLocation) {
        BufferedOutputStream bos = null;
        if(image != null){
            try {
                FileOutputStream fos = new FileOutputStream(fileLocation);
                bos = new BufferedOutputStream(fos);

                JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(bos);
                encoder.encode(image);
                bos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                if(bos!=null){//关闭输出流
                    try {
                        bos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void graphicsGeneration(String name, String id, String classname, String imgurl) {
        int H_title = 30;     //头部高度
        int H_mainPic = 940;  //轮播广告高度
        int H_tip = 60;  //上网提示框高度
        int H_btn = 25;  //按钮栏的高度
        int tip_2_top = (H_title+H_mainPic);
        int btns_2_top = tip_2_top+H_tip+20;
        int btn1_2_top = btns_2_top+10;
        int btn2_2_top = btn1_2_top+H_btn;
        int shops_2_top = btn2_2_top+H_btn+20;
        int W_btn = 280;  //按钮栏的宽度

        image = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_RGB);
        //设置图片的背景色
        Graphics2D main = image.createGraphics();
        main.setColor(Color.white);
        main.fillRect(0, 0, imageWidth, imageHeight);

        //***********************页面头部
        Graphics title = image.createGraphics();
        //设置区域颜色
        title.setColor(new Color(143, 0, 0));
        //填充区域并确定区域大小位置
        title.fillRect(0, 0, imageWidth, H_title);
        //设置字体颜色，先设置颜色，再填充内容
        title.setColor(Color.white);
        //设置字体
        Font titleFont = new Font("宋体", Font.BOLD, 14);
        title.setFont(titleFont);
        title.drawString("my head", 100, (H_title)/2+5);

        //***********************插入中间广告图
        Graphics mainPic = image.getGraphics();
        BufferedImage bimg = null;
        try {
            bimg = javax.imageio.ImageIO.read(new java.io.File(imgurl));
        } catch (Exception e) {}

        if(bimg!=null){
            mainPic.drawImage(bimg, 0, H_title, imageWidth, H_mainPic, null);
            mainPic.dispose();
        }
        //***********************设置下面的提示框

        Graphics2D tip = image.createGraphics();
        //设置区域颜色
        tip.setColor(new Color(255, 120, 89));
        //填充区域并确定区域大小位置
        tip.fillRect(0, tip_2_top, imageWidth, H_tip);
        //设置字体颜色，先设置颜色，再填充内容
        tip.setColor(Color.white);
        //设置字体
        Font tipFont = new Font("宋体", Font.PLAIN, 14);
        tip.setFont(tipFont);
        tip.drawString("登录成功，本次认证时间1小时", 60, tip_2_top+(H_tip)/2-10);
        tip.drawString("正在返回商家主页", 100, tip_2_top+(H_tip)/2+10);



        //***********************设置下面的按钮块
        //设置字体颜色，先设置颜色，再填充内容
        tip.setColor(Color.black);
        tip.drawString("您可以选择的操作：", 20, btns_2_top);
        tip.drawString("下面的小图标：", 20, shops_2_top);
        //***********************按钮
        Font btnFont = new Font("宋体", Font.BOLD, 14);
        Graphics2D btn1 = image.createGraphics();
        btn1.setColor(new Color(41,192 , 50));//#29C65A
        btn1.fillRect(10, btn1_2_top, W_btn, H_btn);
        btn1.setColor(Color.BLACK);
        btn1.drawRect(10, btn1_2_top, W_btn, H_btn);
        //btn1 文本
        btn1.setColor(Color.white);
        btn1.setFont(btnFont);
        btn1.drawString("单击我啊", 120, btn1_2_top+(H_btn/2)+5);

        Graphics2D btn2 = image.createGraphics();
        btn2.setColor(new Color(141,120 , 22));//#29C65A
        btn2.fillRect(10, btn2_2_top, W_btn, H_btn);
        btn2.setColor(Color.BLACK);
        btn2.drawRect(10, btn2_2_top, W_btn, H_btn);
        //btn2文本
        btn2.setColor(Color.white);
        btn2.setFont(btnFont);
        btn2.drawString("单击我啊", 120, btn2_2_top+(H_btn/2)+5);

        createImage("/Users/healerjean/Desktop/newChartGraphics.png");

    }

//    public static void main(String[] args) {
//        ChartGraphics cg = new ChartGraphics();
//        try {
//            cg.graphicsGeneration("ewew", "1", "12", "/Users/healerjean/Desktop/WechatIMG155.jpeg");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


    public static List<String> getStrList(String inputString, int length) {
        int size = inputString.length() / length;
        if (inputString.length() % length != 0) {
            size += 1;
        }
        return getStrList(inputString, length, size);
    }


    public static List<String> getStrList(String inputString, int length,
                                          int size) {
        List<String> list = new ArrayList<String>();
        for (int index = 0; index < size; index++) {
            String childStr = substring(inputString, index * length,
                    (index + 1) * length);
            list.add(childStr);
        }
        return list;
    }


    public static String substring(String str, int f, int t) {
        if (f > str.length())
            return null;
        if (t > str.length()) {
            return str.substring(f, str.length());
        } else {
            return str.substring(f, t);
        }
    }




    public static BufferedImage graphicsGenerationlovely(BufferedImage imageQR,  BufferedImage ImageerWeiMa,
                                                         BufferedImage titleLab,
                                                         String title ,
                                                         BigDecimal originPrice ,
                                                         BigDecimal  nowPrice  ,
                                                         String couponPrice       ,
                                                         String description,
                                                         String label
    ) {





        BufferedImage lineSizeBufferedImage = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);

        FontMetrics metricsLineSizeBufferedImage = lineSizeBufferedImage.createGraphics().getFontMetrics();
        //总共字符串的像素，已经限制的宽度像素
        int tuiJianStrLenth = metricsLineSizeBufferedImage.stringWidth(description.toString());// str要打印的字符串
        int StrPixelOtherTuiJianWidth =0; //第一行之外的其他字符串的像素长度
        int oneTuiJianWidth = 252 ;// 252 ; // 电脑上 252; //第一行像素长度
        int twoTuiJianWidth = 312; //312 //第二行像素长度
        int tuiJiangLineSize = 1 ; //推荐语 行数
        int charIndex = 0 ;  //第一行换行处的 字符串index位置
        StringBuilder finalStrOtherTuiJian = new StringBuilder();

        StringBuilder sbOneTuiJian = new StringBuilder();// 存储每一行的字符串
        if(oneTuiJianWidth< tuiJianStrLenth){
            for (int i1 = 0; i1 < description.length(); i1++) {
                char ch = description.charAt(i1);
                sbOneTuiJian.append(ch);
                //已经添加的字符串的长度通过 bounds2.getWidth() 获取
                Rectangle2D bounds2 = metricsLineSizeBufferedImage.getStringBounds(sbOneTuiJian.toString(), null);
                int tempStrPi1exlWi1dth = (int) bounds2.getWidth();
                if (tempStrPi1exlWi1dth > oneTuiJianWidth) { //当已经添加的超过我们给出限制的宽度进行换行
                    charIndex = i1 ;
                    break;
                }
            }
        }
        if(charIndex!=0){
            finalStrOtherTuiJian = new StringBuilder( description.substring(charIndex, description.length()));
            StrPixelOtherTuiJianWidth = metricsLineSizeBufferedImage.stringWidth(finalStrOtherTuiJian.toString()) ;// str要打印的字符串
            tuiJiangLineSize = (int) Math.ceil(StrPixelOtherTuiJianWidth * 1.0 / twoTuiJianWidth) + tuiJiangLineSize;// 算出行数
        }



        //整体图的高度和宽度
        int bili =0 ;
        int lovelyImageHeight =0 ;
        if(tuiJiangLineSize==1){//第二行开始 0 数据
            bili = 630-60 ;
        }else if(tuiJiangLineSize==2){ //1条数据
            bili = 630-40 ;
        }else if(tuiJiangLineSize==3){ //2条数据
            bili = 630 -20 ;
        }else {
            bili = 630 ;
        }


//
//
//        String tuijian = description ;
//        StringBuffer s1= null;
//        String oneLine = "",otherLine = "";
//        if(tuijian.length()>21){
//            oneLine = tuijian.substring(0,21);
//            otherLine = tuijian.substring(21,tuijian.length());
//        }else {
//            oneLine =    tuijian ;
//        }
//
//        if(otherLine!=null){
//            s1 = new StringBuffer(otherLine);
//            if(tuijian.length()>26) {
//                int n = tuijian.length() / 26; //看看有几行
//                for (int index = 26; index < tuijian.length(); index += 26, n--) {
//                    if (n > 1) {
//                        s1.insert(index, '\n');
//                    }
//                }
//            }   else {
//                s1.append(otherLine);
//            }
//        }
//        String otherFinal = s1.toString();
//        List<String> strs = Arrays.asList(otherFinal.split("\n"));
//
//        //整体图的高度和宽度
//        int bili =0 ;
//        int lovelyImageHeight =0 ;
//        if(strs.size()==0){//第二行开始 0 数据
//            bili = 630-60 ;
//        }else if(strs.size()==1){ //1条数据
//            bili = 630-40 ;
//        }else if(strs.size()==2){ //2条数据
//            bili = 630 -20 ;
//        }else {
//            bili = 630 ;
//        }














        //整体图的高度和宽度
        int  lovelyImageWidth = 375*30;
        lovelyImageHeight = bili*30;
        //整体图合成
        BufferedImage bufferedImage = new BufferedImage(lovelyImageWidth, lovelyImageHeight, BufferedImage.TYPE_INT_RGB);
        //设置图片的背景色
        Graphics2D main = bufferedImage.createGraphics();
        main.fillRect(0, 0, lovelyImageWidth, lovelyImageHeight);


        Graphics graphicsQR = bufferedImage.getGraphics();
        //上面的大图
        graphicsQR.drawImage(imageQR, 0, 0, 375*30, 375*30, null);


        //商品推荐
        Graphics2D fixTuiJian = bufferedImage.createGraphics();
        fixTuiJian.setColor(new Color(77,77,77));
        Font fixTuiJianFont = new Font("PingFang SC", Font.PLAIN, 13*30);
        fixTuiJian.setFont(fixTuiJianFont);
        //失真处理
        fixTuiJian.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixTuiJian.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);



//        FontMetrics metricsLineSizeBufferedImage = lineSizeBufferedImage.createGraphics().getFontMetrics();
//        //总共字符串的像素，已经限制的宽度像素
//        int tuiJianStrLenth = metricsLineSizeBufferedImage.stringWidth(description.toString());// str要打印的字符串
//        int StrPixelOtherTuiJianWidth ; //第一行之外的其他字符串的像素长度
//        int oneTuiJianWidth = 252; //第一行像素长度
//        int twoTuiJianWidth = 252; //第二行像素长度
//        int tuiJiangLineSize = 1 ; //推荐语 行数
//        int charIndex = 0 ;  //第一行换行处的 字符串index位置
//        StringBuilder finalStrOtherTuiJian = new StringBuilder();
//


        //总共字符串的像素，已经限制的宽度像素

//        sbOneTuiJian = new StringBuilder();// 存储每一行的字符串


//        if(oneTuiJianWidth< tuiJianStrLenth){
//            for (int i1 = 0; i1 < description.length(); i1++) {
//                char ch = description.charAt(i1);
//                sbOneTuiJian.append(ch);
//                //已经添加的字符串的长度通过 bounds2.getWidth() 获取
//                Rectangle2D bounds2 = metricsLineSizeBufferedImage.getStringBounds(sbOneTuiJian.toString(), null);
//                int tempStrPi1exlWi1dth = (int) bounds2.getWidth();
//                if (tempStrPi1exlWi1dth > oneTuiJianWidth) { //当已经添加的超过我们给出限制的宽度进行换行
//                    fixTuiJian.drawString(description.substring(0,i1), 85*30, 560*30);
//                    oneHangSizeTuiJian = i1;
//                    break;
//                }
//            }
//        }else {
//            fixTuiJian.drawString(description, 85*30, 560*30);
//        }

        if(charIndex!=0){
            fixTuiJian.drawString(description.substring(0,charIndex), 85*30, 560*30);
            //算出行数
            int lineSize = (int) Math.ceil(StrPixelOtherTuiJianWidth * 1.0 / twoTuiJianWidth);// 算出行数
            if (twoTuiJianWidth < StrPixelOtherTuiJianWidth) { // 页面宽度（width）小于 字符串长度
                StringBuilder sb = new StringBuilder();// 存储每一行的字符串
                int j = 0;
                int tempStart = 0;
                String tempStrs[] = new String[lineSize];// 存储换行之后每一行的字符串
                for (int i1 = 0; i1 < finalStrOtherTuiJian.length(); i1++) {
                    char ch = finalStrOtherTuiJian.charAt(i1);
                    sb.append(ch);
                    //已经添加的字符串的长度通过 bounds2.getWidth() 获取
                    Rectangle2D bounds2 = metricsLineSizeBufferedImage.getStringBounds(sb.toString(), null);
                    int tempStrPi1exlWi1dth = (int) bounds2.getWidth();
                    if (tempStrPi1exlWi1dth > twoTuiJianWidth) { //当已经添加的超过我们给出限制的宽度进行换行
                        tempStrs[j++] = finalStrOtherTuiJian.substring(tempStart, i1); //一开始是从0开始
                        tempStart = i1; //当第一行有了数据之后 会将i1给到临时开始位置 tempStart
                        sb.delete(0, sb.length()); // 对sb内容进行清空，给他赋予下一行开始的字符
                        sb.append(ch);
                    }

                    // 最后一行
                    if (i1 == finalStrOtherTuiJian.length() - 1) {
                        tempStrs[j] = finalStrOtherTuiJian.substring(tempStart);
                    }
                }
                for (int i = 0; i < tempStrs.length; i++) {
                    if(i ==0){
                        fixTuiJian.drawString(tempStrs[i], 20*30, 580*30);
                    }else if(i  ==1){
                        fixTuiJian.drawString(tempStrs[i], 20*30, 600*30);
                    }else  if(i == 2){
                        fixTuiJian.drawString(tempStrs[i], 20*30, 620*30);
                    }
                }
            } else {
                fixTuiJian.drawString(finalStrOtherTuiJian.toString(), 20*30, 580*30);
            }

        }else {
            fixTuiJian.drawString(description, 85*30, 560*30);
        }



//
//
//        if(oneLine!="") {
//            fixTuiJian.drawString(oneLine, 85*30, 560*30);
//        }
//
//        if(otherFinal!=""){ //第二行开始只显示3行
//            for(int m = 0 ;m <strs.size();m++){
//                if(m ==0){
//                    fixTuiJian.drawString(strs.get(m), 20*30, 580*30);
//                }else if(m  ==1){
//                    fixTuiJian.drawString(strs.get(m), 20*30, 600*30);
//                }else  if(m == 2){
//                    fixTuiJian.drawString(strs.get(m), 20*30, 620*30);
//                }
//            }
//        }
//







        BasicStroke stokeLineKuang = new   BasicStroke(   40f   ); //12


        Graphics2D 标题 = bufferedImage.createGraphics();
        标题.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        标题.setColor(new Color(247,108,45));
        标题.setStroke(stokeLineKuang);
        标题.drawRect(0,375*30,238*30,158*30);



        Graphics2D 标题文字 = bufferedImage.createGraphics();
        标题文字.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        标题文字.setColor(new Color(247,108,45));
        标题文字.setStroke(stokeLineKuang);
        标题文字.drawRect(21*30,390*30,210*30,48*30);


        Graphics2D 现价 = bufferedImage.createGraphics();
        现价.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        现价.setColor(new Color(247,108,45));
        现价.setStroke(stokeLineKuang);
        现价.drawRect(20*30,446*30,63*30,16*30);//16.5


        Graphics2D 券后价 = bufferedImage.createGraphics();
        券后价.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        券后价.setColor(new Color(247,108,45));
        券后价.setStroke(stokeLineKuang);
        券后价.drawRect(84*30,465*30,101*30,28*30); //100.5



        Graphics2D 二维码 = bufferedImage.createGraphics();
        二维码.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        二维码.setColor(new Color(247,108,45));
        二维码.setStroke(stokeLineKuang);
        二维码.drawRect(232*30,394*30,124*30,120*30);


        Graphics2D 二维码内 = bufferedImage.createGraphics();
        二维码内.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        二维码内.setColor(new Color(247,108,45));
        二维码内.setStroke(stokeLineKuang);
        二维码内.drawRect(240*30,397*30,109*30,109*30);

        Graphics2D 二维码文字 = bufferedImage.createGraphics();
        二维码文字.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        二维码文字.setColor(new Color(247,108,45));
        二维码文字.setStroke(stokeLineKuang);
        二维码文字.drawRect(249*30,507*30,90*30,14*30);





        Graphics2D 推荐 = bufferedImage.createGraphics();
        推荐.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        推荐.setColor(new Color(247,108,45));
        推荐.setStroke(stokeLineKuang);
        推荐.drawRect(0,533*30,375*30,123*30);


        Graphics2D 推荐文子 = bufferedImage.createGraphics();
        推荐文子.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        推荐文子.setColor(new Color(247,108,45));
        推荐文子.setStroke(stokeLineKuang);
        推荐文子.drawRect(20*30,546*30,338*30,88*30);


        //天猫
        graphicsQR.drawImage(
                titleLab.getScaledInstance( 34*30, 17*30 ,Image.SCALE_SMOOTH), 21*30, 393*30, null);



        //固定文字 title
        Graphics2D fixed = bufferedImage.createGraphics();
        fixed.setColor(new Color(54, 54, 54));
        Font fixedFont = new Font("PingFang SC", Font.BOLD, 16*30);
        fixed.setFont(fixedFont);
        //失真处理
        fixed.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixed.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);



//        StringBuffer s1titleOtherLine= null;
//        String titleOneLine = "",titleOtherLine = "";
//        if(title.length()>10){
//            titleOneLine = title.substring(0,10);
//            titleOtherLine = title.substring(10,title.length());
//        }else {
//            titleOneLine =    title ;
//        }
//
//        if(titleOtherLine!=null){
//            s1titleOtherLine = new StringBuffer(titleOtherLine);
//            if(title.length()>13) {
//                int n = title.length() / 13; //看看有几行
//                for (int index = 13; index < title.length(); index += 13, n--) {
//                    if (n > 1) {
//                        s1titleOtherLine.insert(index, '\n');
//                    }
//                }
//            }   else {
//                s1titleOtherLine.append(titleOtherLine);
//            }
//        }
//        String titleOtherFinal = s1titleOtherLine.toString();
//        List<String> titleStrs = Arrays.asList(titleOtherFinal.split("\n"));
//
//        if(titleOneLine!="") {
//            fixed.drawString(titleOneLine, 58*30, 408*30);
//
//        }
//
//        if(titleOtherFinal!=""){ //第二行开始只显示1行
//            for(int m = 0 ;m <titleStrs.size();m++){
//                if(m ==0){
//                    fixed.drawString(titleStrs.get(m), 21*30, 432*30);
//                }
//            }
//        }






        FontMetrics metrics = bufferedImage.createGraphics().getFontMetrics();
        //总共字符串的像素，已经限制的宽度像素
        int StrPixelWidth = metrics.stringWidth(title.toString());// str要打印的字符串
        int oneTitleWidth = 120; //电脑上是120

        StringBuilder sbOne = new StringBuilder();// 存储每一行的字符串
        int oneHangSize = 0 ;
        if(oneTitleWidth< StrPixelWidth){
            for (int i1 = 0; i1 < title.length(); i1++) {
                char ch = title.charAt(i1);
                sbOne.append(ch);
                //已经添加的字符串的长度通过 bounds2.getWidth() 获取
                Rectangle2D bounds2 = metrics.getStringBounds(sbOne.toString(), null);
                int tempStrPi1exlWi1dth = (int) bounds2.getWidth();
                if (tempStrPi1exlWi1dth > oneTitleWidth) { //当已经添加的超过我们给出限制的宽度进行换行
                    fixed.drawString(title.substring(0,i1), 58*30, 408*30);
                    oneHangSize = i1;
                    break;
                }
            }
        }else {
            fixed.drawString(title, 58*30, 408*30);
        }

        if(oneHangSize!=0){
            StringBuilder finalStrOther = new StringBuilder( title.substring(oneHangSize, title.length()));
            if(finalStrOther!=null&&finalStrOther.length()>0){
                fixed.drawString(finalStrOther.toString(), 21*30, 432*30);

            }
        }






        Graphics2D fixNowPriceshixiao  = bufferedImage.createGraphics();
        fixNowPriceshixiao.setColor(new Color(171, 171, 171));
        BasicStroke fixNowPriceshixiaoLine = new   BasicStroke(   2f   );
        fixNowPriceshixiao.setStroke(fixNowPriceshixiaoLine);
        fixNowPriceshixiao.drawLine(56*30,454*30,80*30,454*30);//画一条线段


        //固定文字 现价
        Graphics2D fixNowPrice = bufferedImage.createGraphics();
        fixNowPrice.setColor(new Color(171, 171, 171));
        Font fixNowPriceFont = new Font("PingFang SC", Font.BOLD, 12*30);
        fixNowPrice.setFont(fixNowPriceFont);
        //失真处理
        fixNowPrice.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixNowPrice.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String newPrice =  "现价 ￥"+originPrice;
        fixNowPrice.drawString(newPrice, 20*30, 458*30);




        Graphics2D quanJx = bufferedImage.createGraphics();
        quanJx.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        quanJx.setColor(new Color(247,108,45));
        quanJx.fillRect(20*30,472*30,18*30,17*30);


        //固定文字 券
        Graphics2D fixquanWenzi = bufferedImage.createGraphics();
        fixquanWenzi.setColor(new Color(255,255,255));
        Font fixQuanHouwenziFont = new Font("PingFang SC", Font.PLAIN, 12*30);
        fixquanWenzi.setFont(fixQuanHouwenziFont);
        //失真处理
        fixquanWenzi.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixquanWenzi.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String quanwezi =  "券";
        fixquanWenzi.drawString(quanwezi, 23*30, 484*30);





        Graphics2D yuanJx = bufferedImage.createGraphics();
        yuanJx.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        yuanJx.setColor(new Color(247,108,45));
        BasicStroke yuanJxstokeLine = new   BasicStroke(   9f   ); //12
        yuanJx.setStroke(yuanJxstokeLine);
        yuanJx.drawRect(20*30,472*30,55*30,17*30);


        //固定文字 券金额
        Graphics2D fixyuanWenzi = bufferedImage.createGraphics();
        fixyuanWenzi.setColor(new Color(247,108,45));
        Font fixyuanWenziFont = new Font("PingFang SC", Font.PLAIN, 12*30);
        fixyuanWenzi.setFont(fixyuanWenziFont);
        //失真处理
        fixyuanWenzi.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixyuanWenzi.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String yuan =  couponPrice+"元";
        fixyuanWenzi.drawString(yuan, 43*30, 485*30);



        //固定文字 券以及券后价
        Graphics2D fixQuanHou = bufferedImage.createGraphics();
        fixQuanHou.setColor(new Color(171, 171, 171));
        Font fixQuanHouFont = new Font("PingFang SC", Font.BOLD, 14*30);
        fixQuanHou.setFont(fixQuanHouFont);
        //失真处理
        fixQuanHou.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixQuanHou.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String quanhoujia =  "券后价";
        fixQuanHou.drawString(quanhoujia, 84*30, 484*30);




        //固定文字￥
        Graphics2D meiyuan = bufferedImage.createGraphics();
        meiyuan.setColor(new Color(247,108,45));
        Font qhjPriceMeiyuanFont = new Font("PingFang SC", Font.PLAIN, 10*30);
        meiyuan.setFont(qhjPriceMeiyuanFont);
        //失真处理
        meiyuan.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        meiyuan.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String meiyuanWenZi =  "￥";
        meiyuan.drawString(meiyuanWenZi, 127*30, 484*30);


        //固定文字 9.90
        Graphics2D qhjPrice = bufferedImage.createGraphics();
        qhjPrice.setColor(new Color(247,108,45));
        Font qhjPriceFont = new Font("PingFang SC", Font.BOLD, 20*30);
        qhjPrice.setFont(qhjPriceFont);
        //失真处理
        qhjPrice.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        qhjPrice.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String QaunPrice = nowPrice+"";
        qhjPrice.drawString(QaunPrice, 140*30, 484*30);




        //小编推荐
        Graphics2D fixsptjwenzi = bufferedImage.createGraphics();
        fixsptjwenzi.setColor(new Color(77,77,77));
        Font sptjFont = new Font("PingFang SC", Font.BOLD,13*30);
        fixsptjwenzi.setFont(sptjFont);
        fixsptjwenzi.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixsptjwenzi.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String sptjwenzi =  "小编推荐：";
        fixsptjwenzi.drawString(sptjwenzi, 20*30, 560*30);









        //二维码的图片
        graphicsQR.drawImage(ImageerWeiMa, 238*30, 397*30, 109*30, 109*30, null);

        //固定文字 长按识别二维码领券
        Graphics2D changan = bufferedImage.createGraphics();
        changan.setColor(new Color(255,156,83));
        Font changanFont = new Font("PingFang SC", Font.PLAIN, 10*30);
        changan.setFont(changanFont);
        changan.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        changan.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String changanWenzi = "长按识别二维码领券";
        changan.drawString(changanWenzi, 249*30, 517*30);






        //粗细
        BasicStroke stokeLine = new   BasicStroke(   40f   ); //12

        //左上
        Graphics2D erweimazuo  = bufferedImage.createGraphics();
        erweimazuo.setColor(new Color(255,156,83));
        erweimazuo.setStroke(stokeLine);
        erweimazuo.drawLine(232*30,394*30,244*30,394*30);//画一条线段

        Graphics2D erweimazuoxai  = bufferedImage.createGraphics();
        erweimazuoxai.setColor(new Color(255,156,83));
        erweimazuoxai.setStroke(stokeLine);
        erweimazuoxai.drawLine(232*30,394*30,232*30,406*30);//画一条线段


        //右上
        Graphics2D erweimayou  = bufferedImage.createGraphics();
        erweimayou.setColor(new Color(255,156,83));
        erweimayou.setStroke(stokeLine);
        erweimayou.drawLine(356*30,394*30,344*30,394*30);//画一条线段

        Graphics2D erweimayouxia  = bufferedImage.createGraphics();
        erweimayouxia.setColor(new Color(255,156,83));
        erweimayouxia.setStroke(stokeLine);
        erweimayouxia.drawLine(356*30,394*30,356*30,406*30);//画一条线段


        //左下
        Graphics2D erweimaxiazuo  = bufferedImage.createGraphics();
        erweimaxiazuo.setColor(new Color(255,156,83));
        erweimaxiazuo.setStroke(stokeLine);
        erweimaxiazuo.drawLine(232*30,514*30,244*30,514*30);//画一条线段

        Graphics2D erweimaxiazuoxia  = bufferedImage.createGraphics();
        erweimaxiazuoxia.setColor(new Color(255,156,83));
        erweimaxiazuoxia.setStroke(stokeLine);
        erweimaxiazuoxia.drawLine(232*30,514*30,232*30,502*30);//画一条线段


        //右下
        Graphics2D erweimaxiayou  = bufferedImage.createGraphics();
        erweimaxiayou.setColor(new Color(255,156,83));
        erweimaxiayou.setStroke(stokeLine);
        erweimaxiayou.drawLine(356*30,514*30,344*30,514*30);//画一条线段


        Graphics2D erweimaxiayouxia  = bufferedImage.createGraphics();
        erweimaxiayouxia.setColor(new Color(255,156,83));
        erweimaxiayouxia.setStroke(stokeLine);
        erweimaxiayouxia.drawLine(356*30,514*30,356*30,502*30);//画一条线段





        Graphics2D xianduan  = bufferedImage.createGraphics();
        xianduan.setColor(new Color(245,245,245));
        BasicStroke xianduanstokeLine = new   BasicStroke(   20f   );
        xianduan.setStroke(xianduanstokeLine);
        xianduan.drawLine(0,534*30,375*30,534*30);//画一条线段



        if(label!=null){
            List<String> labels = Arrays.asList(label.split(","));
            //一般最多三个标签
            int flag = 1 ;
            int oneWidth = 0 ,twoWidth = 0 ,threeWidth = 0;
            for(int j = 0 ; j<labels.size();j++ ){
                int length = labels.get(j).length();
                if(flag==1){

                    if(length==2){
                        oneWidth = 20;
                    }else if(length==4){
                        oneWidth = 40;
                    }else if(length == 3){
                        oneWidth = 30;
                    }else if(length == 5){
                        oneWidth = 50;
                    }else if(length == 6){
                        oneWidth = 60;
                    }else if(length == 7){
                        oneWidth = 70;
                    }else {
                        oneWidth = 80;
                    }

                    Graphics2D label2DOne = bufferedImage.createGraphics();
                    label2DOne.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    label2DOne.setColor(new Color(255,156,83,50));
                    label2DOne.fillRoundRect(24*30,497*30,(oneWidth+9)*30,19*30,17*30,17*30);//涂一个圆角矩形块

                    //固定文字 包邮
                    Graphics2D fixlabel2DOne = bufferedImage.createGraphics();
                    fixlabel2DOne.setColor(new Color(254,127,0));
                    Font fixlabel2DFont = new Font("PingFang SC", Font.PLAIN, 10*30);
                    fixlabel2DOne.setFont(fixlabel2DFont);
                    fixlabel2DOne.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    fixlabel2DOne.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
                    fixlabel2DOne.drawString(labels.get(j), 29*30, 510*30);
                }
                if(flag==2){


                    if(length==2){
                        twoWidth = 20;
                    }else if(length==4){
                        twoWidth = 40;
                    }else if(length == 3){
                        twoWidth = 30;
                    }else if(length == 5){
                        twoWidth = 50;
                    }else if(length == 6){
                        twoWidth = 60;
                    }else if(length == 7){
                        twoWidth = 70;
                    }else {
                        twoWidth = 80;
                    }

                    Graphics2D label2DTwo = bufferedImage.createGraphics();
                    label2DTwo.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    label2DTwo.setColor(new Color(255,156,83,50));
                    label2DTwo.fillRoundRect((24+(oneWidth+8)+8)*30,497*30,(twoWidth+9)*30,19*30,17*30,17*30);//涂一个圆角矩形块

                    //固定文字 包邮
                    Graphics2D fixlabel2DTwo = bufferedImage.createGraphics();
                    fixlabel2DTwo.setColor(new Color(254,127,0));
                    Font fixlabel2DFont = new Font("PingFang SC", Font.PLAIN, 10*30);
                    fixlabel2DTwo.setFont(fixlabel2DFont);
                    fixlabel2DTwo.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    fixlabel2DTwo.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
                    fixlabel2DTwo.drawString(labels.get(j), (24+(oneWidth+8)+8+4)*30, 510*30);
                }
                if(flag==3){

                    if(length==2){
                        threeWidth = 20;
                    }else if(length==4){
                        threeWidth = 40;
                    }else if(length == 3){
                        threeWidth = 30;
                    }else if(length == 5){
                        oneWidth = 50;
                    }else if(length == 6){
                        oneWidth = 60;
                    }else if(length == 7){
                        oneWidth = 70;
                    }else {
                        oneWidth = 80;
                    }


                    Graphics2D label2DThree = bufferedImage.createGraphics();
                    label2DThree.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    label2DThree.setColor(new Color(255,156,83,50));
                    label2DThree.fillRoundRect((24+(oneWidth+8)+8+(twoWidth+8)+8)*30,497*30,(threeWidth+8)*30,19*30,17*30,17*30);//涂一个圆角矩形块

                    //固定文字 包邮
                    Graphics2D fixlabel2DThree = bufferedImage.createGraphics();
                    fixlabel2DThree.setColor(new Color(254,127,0));
                    Font fixlabel2DFont = new Font("PingFang SC", Font.PLAIN, 10*30);
                    fixlabel2DThree.setFont(fixlabel2DFont);
                    fixlabel2DThree.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    fixlabel2DThree.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
                    fixlabel2DThree.drawString(labels.get(j), (24+(oneWidth+8)+8+(twoWidth+8)+8+4)*30, 510*30);
                }
                flag++;

            }
        }


        return bufferedImage;
    }

}