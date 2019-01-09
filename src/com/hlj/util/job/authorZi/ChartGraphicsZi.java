package com.hlj.util.job.authorZi;

import com.hlj.util.QRcode.BufferedImageUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class ChartGraphicsZi{




    public static BufferedImage graphicsGenerationlovely(BufferedImage imageQR,  BufferedImage ImageerWeiMa,
                                                         BufferedImage titleLab,
                                                         String title ,
                                                         BigDecimal originPrice ,
                                                         BigDecimal  nowPrice  ,
                                                         String couponPrice       ,
                                                         String description,
                                                         String label,
                                                         CouponAdzoneFoodieTagZi couponAdzoneFoodieTag,
                                                         int lovelyImageWidth,
                                                         int lovelyImageHeight
    ) {
//小编推荐 去掉
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
//                s1 = new StringBuffer();
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
//
//        //整体图的高度和宽度
//        int  lovelyImageWidth = 375*30;
//        lovelyImageHeight = bili*30;



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


//小编推荐去掉
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
//      推荐.drawRect(0,533*30,375*30,123*30); //小编推荐
        推荐.drawRect(0,533*30,375*30,148*30); //话痨


//        Graphics2D 推荐文子 = bufferedImage.createGraphics();
//        推荐文子.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        推荐文子.setColor(new Color(247,108,45));
//        推荐文子.setStroke(stokeLineKuang);
//        推荐文子.drawRect(20*30,546*30,338*30,88*30);



        Graphics2D 头像 = bufferedImage.createGraphics();
        头像.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        头像.setColor(new Color(247,108,45));
        头像.setStroke(stokeLineKuang);
        头像.drawRect(20*30,550*30,44*30,44*30);





        Graphics2D 名字 = bufferedImage.createGraphics();
        名字.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        名字.setColor(new Color(247,108,45));
        名字.setStroke(stokeLineKuang);
        名字.drawRect(76*30,550*30,80*30,28*30);



        Graphics2D 个性标签 = bufferedImage.createGraphics();
        个性标签.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        个性标签.setColor(new Color(247,108,45));
        个性标签.setStroke(stokeLineKuang);
        个性标签.drawRect(76*30,580*30,80*30,15*30);




        Graphics2D 话痨 = bufferedImage.createGraphics();
        话痨.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        话痨.setColor(new Color(247,108,45));
        话痨.setStroke(stokeLineKuang);
        话痨.drawRect(20*30,600*30,335*30,68*30);



        Graphics2D 话痨内容 = bufferedImage.createGraphics();
        话痨内容.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        话痨内容.setColor(new Color(247,108,45));
        话痨内容.setStroke(stokeLineKuang);
        话痨内容.drawRect(32*30,612*30,311*30,44*30);






        //二维码图片
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



        StringBuffer s1titleOtherLine= null;
        String titleOneLine = "",titleOtherLine = "";
        if(title.length()>10){
            titleOneLine = title.substring(0,10);
            titleOtherLine = title.substring(10,title.length());
        }else {
            titleOneLine =    title ;
        }

        if(titleOtherLine!=null){
            s1titleOtherLine = new StringBuffer(titleOtherLine);
            if(title.length()>13) {
                int n = title.length() / 13; //看看有几行
                for (int index = 13; index < title.length(); index += 13, n--) {
                    if (n > 1) {
                        s1titleOtherLine.insert(index, '\n');
                    }
                }
            }   else {
                s1titleOtherLine = new StringBuffer();
                s1titleOtherLine.append(titleOtherLine);
            }
        }
        String titleOtherFinal = s1titleOtherLine.toString();
        List<String> titleStrs = Arrays.asList(titleOtherFinal.split("\n"));

        if(titleOneLine!="") {
            fixed.drawString(titleOneLine, 58*30, 408*30);

        }

        if(titleOtherFinal!=""){ //第二行开始只显示1行
            for(int m = 0 ;m <titleStrs.size();m++){
                if(m ==0){
                    fixed.drawString(titleStrs.get(m), 21*30, 432*30);
                }
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




//小编推荐 去掉，后期可以加上
//        Graphics2D fixsptjwenzi = bufferedImage.createGraphics();
//        fixsptjwenzi.setColor(new Color(77,77,77));
//        Font sptjFont = new Font("PingFang SC", Font.BOLD,13*30);
//        fixsptjwenzi.setFont(sptjFont);
//        fixsptjwenzi.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        fixsptjwenzi.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
//        String sptjwenzi =  "小编推荐：";
//        fixsptjwenzi.drawString(sptjwenzi, 20*30, 560*30);









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





        try {
            URL personImg = new URL(couponAdzoneFoodieTag.getPersonImgUrl());
            BufferedImage personBufferImage = ImageIO.read(personImg);
            //上面的大图
            graphicsQR.drawImage(personBufferImage, 20*30,545*30,44*30,44*30, null);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }





        //固定文字 title
        Graphics2D name = bufferedImage.createGraphics();
        name.setColor(new Color(54, 54, 54));
        Font fixedFontName = new Font("PingFang SC", Font.BOLD, 16*30);
        name.setFont(fixedFontName);
        //失真处理
        name.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        name.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        name.drawString(couponAdzoneFoodieTag.getName(), 76*30, 566*30);



        //话痨内容hualaoContent
        Graphics2D hualaoContent = bufferedImage.createGraphics();
        hualaoContent.setColor(new Color(37,37,37));
        Font hualaoContentFont = new Font("PingFang SC", Font.PLAIN, 14*30);
        hualaoContent.setFont(hualaoContentFont);
        hualaoContent.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);


        Graphics2D hualaoRect = bufferedImage.createGraphics();
        hualaoRect.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        hualaoRect.setColor(new Color(0,0,0,15));


        FontMetrics fm = hualaoContent.getFontMetrics();
        int hualaoFirstLineWight = fm.stringWidth(couponAdzoneFoodieTag.getContent());

        if(hualaoFirstLineWight<=(311*30*2)) {
            hualaoRect.fillRoundRect(20*30,600*30,335*30,68*30,0,0);//涂一个圆角矩形块
        }else if((hualaoFirstLineWight>311*30*2)&&hualaoFirstLineWight<=(311*30*3)) {
            hualaoRect.fillRoundRect(20*30,600*30,335*30,95*30,0,0);//涂一个圆角矩形块
        }else if((hualaoFirstLineWight>311*30*3)) {
            hualaoRect.fillRoundRect(20*30,600*30,335*30,120*30,0,0);//涂一个圆角矩形块
        }

        if(hualaoFirstLineWight<=311*30){
                hualaoContent.drawString(couponAdzoneFoodieTag.getContent(), 32*30, 635*30);
        }else {
            BufferedImageUtils.drawString(hualaoContent,couponAdzoneFoodieTag.getContent(),25*30,311*30,4,32*30,630*30,true,false);
        }



//
//        for(int i = 0  ; i<hualaoList.size() ;i++){
//            if(hualaoList.size()==1){
//                hualaoContent.drawString(hualaoList.get(0), 32*30, 635*30);
//            }else {
//                if(i==0){
//                    hualaoContent.drawString(hualaoList.get(i), 32*30, 625*30);
//                }else if(i==1){
//                     hualaoContent.drawString(hualaoList.get(i), 32*30, 652*30);
//                }else if(i==2){
//                    hualaoContent.drawString(hualaoList.get(i), 32*30, 682*30);
//                }else if(i==3){
//                    hualaoContent.drawString(hualaoList.get(i), 32*30, 712*30);
//                }
//            }
//        }









        //个性化标签
        Graphics2D editorTagRect = bufferedImage.createGraphics();
        editorTagRect.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        editorTagRect.setColor(new Color(255,156,83,50));

        Graphics2D editorTag = bufferedImage.createGraphics();
        editorTag.setColor(new Color(254,127,0));
        Font editorTagFont = new Font("PingFang SC", Font.PLAIN, 12*30);
        editorTag.setFont(editorTagFont);
        editorTag.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        editorTag.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);


        String editorTagStr = couponAdzoneFoodieTag.getTag() ;
        String tagArrays[] = editorTagStr.split(",");
        int tagWidth [] = new int[5];
        int editorJianJu = 5 ;
        for(int i = 0 ; i<tagArrays.length;i++){

            if(i==0){
                editorTagRect.fillRoundRect(76*30,575*30,(tagArrays[i].length()*11)*30,15*30,0,0);//涂一个圆角矩形块
                editorTag.drawString(tagArrays[i], 77*30, 587*30);
                tagWidth[0] =  (tagArrays[i].length()*11) ;
            }
            if(i==1){
                editorTagRect.fillRoundRect((76+tagWidth[0]+editorJianJu)*30,575*30,(tagArrays[i].length()*11)*30,15*30,0,0);//涂一个圆角矩形块
                editorTag.drawString(tagArrays[i], (77+tagWidth[0]+editorJianJu)*30, 587*30);
                tagWidth[1] = tagArrays[i].length()*11 + 76+tagWidth[0]+editorJianJu; //标签的宽度加
            }
            if(i==2){
                editorTagRect.fillRoundRect((tagWidth[1]+editorJianJu)*30,575*30,(tagArrays[i].length()*11)*30,15*30,0,0);//涂一个圆角矩形块
                editorTag.drawString(tagArrays[i], (tagWidth[1]+editorJianJu+1)*30, 587*30);
            }

        }

//        //个性化标签 一行
//        Graphics2D editorTagRect = bufferedImage.createGraphics();
//        editorTagRect.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        editorTagRect.setColor(new Color(255,156,83,50));
//        editorTagRect.fillRoundRect(76*30,580*30,couponAdzoneFoodieTag.getTagLength()*30,15*30,0,0);//涂一个圆角矩形块
//
//
//
//        Graphics2D editorTag = bufferedImage.createGraphics();
//        editorTag.setColor(new Color(254,127,0));
//        Font editorTagFont = new Font("PingFang SC", Font.PLAIN, 12*30);
//        editorTag.setFont(editorTagFont);
//        editorTag.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        editorTag.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
//        editorTag.drawString(couponAdzoneFoodieTag.getTag(), 76*30, 592*30);






        return bufferedImage;
    }



    /**
     * 指定图片宽度和高度和压缩比例对图片进行压缩
     *
     * @param widthdist
     *            压缩后图片的宽度
     * @param heightdist
     *            压缩后图片的高度
     * @param rate
     *            压缩的比例
     */
    public static BufferedImage reduceImg(BufferedImage bufferedImage, int widthdist, int heightdist, Float rate) {
        try {

            // 如果比例不为空则说明是按比例压缩
            if (rate != null && rate > 0) {
                //获得源图片的宽高存入数组中
                int[] results = getImgWidthHeight(bufferedImage);
                if (results == null || results[0] == 0 || results[1] == 0) {
                    return null;
                } else {
                    //按比例缩放或扩大图片大小，将浮点型转为整型
                    widthdist = (int) (results[0] * rate);
                    heightdist = (int) (results[1] * rate);
                }
            }
            // 开始读取文件并进行压缩
            Image src = (Image) bufferedImage;

            // 构造一个类型为预定义图像类型之一的 BufferedImage
            BufferedImage tag = new BufferedImage((int) widthdist, (int) heightdist, BufferedImage.TYPE_INT_RGB);

            //绘制图像  getScaledInstance表示创建此图像的缩放版本，返回一个新的缩放版本Image,按指定的width,height呈现图像
            //Image.SCALE_SMOOTH,选择图像平滑度比缩放速度具有更高优先级的图像缩放算法。
            tag.getGraphics().drawImage(src.getScaledInstance(widthdist, heightdist, Image.SCALE_SMOOTH), 0, 0, null);

            return tag;
        } catch (Exception ef) {
            ef.printStackTrace();
        }
        return  null;
    }

    /**
     * 获取图片宽度和高度
     *
     * @return 返回图片的宽度
     */
    public static int[] getImgWidthHeight(BufferedImage bufferedImage) {
        int result[] = { 0, 0 };
        try {
            // 获得文件输入流
            // 从流里将图片写入缓冲图片区
            result[0] =bufferedImage.getWidth(null); // 得到源图片宽
            result[1] =bufferedImage.getHeight(null);// 得到源图片高
        } catch (Exception ef) {
            ef.printStackTrace();
        }

        return result;
    }


}