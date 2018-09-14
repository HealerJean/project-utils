package com.hlj.util.QRcode;

import com.sun.jndi.toolkit.url.Uri;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

/**
 * @Desc:
 * @Author HealerJean
 * @Date 2018/6/29  上午11:10.
 */
public class MainService {

    public static void main(String[] args) throws Exception {


        File file = new File("/Users/healerjean/Desktop/id.jpg");
        FileOutputStream outputStream = new FileOutputStream(file);


        BufferedImage imageQR  = ReduceImgTest.getBufferedImageByUrl("https://img.alicdn.com/imgextra/i1/3694212174/TB21Wb_jlsmBKNjSZFFXXcT9VXa_!!3694212174.jpg",375*2,375*2);

        URL u = new URL("http://admore.oss-cn-beijing.aliyuncs.com/admin/duodianyouhui/itemgood/6a4507a16213460ab3476a3204a9e5bc.png");

        BufferedImage titleLab = ImageIO.read(u);

        BufferedImage  ErWeiMaImage = QRCodeUtils.writeQRImg("http://admore.oss-cn-beijing.aliyuncs.com/duodian-youhui/index.html#/44");

        String title = "AAAAAAAAAAAAAA千妇恋-日本进口温和控油洗面奶30g";
        BigDecimal originPrice =new BigDecimal("88.9");
        BigDecimal  nowPrice  =new BigDecimal("39.9");
        BigDecimal couponPrice  =new BigDecimal("10");

//        String description = "布衣不二旗舰店，之前推荐衣不二旗舰店之前推";
//        String description = "布衣不二旗舰店，之前推布衣不二旗舰店，之前推之前推布衣不二旗舰店之前推布衣不二旗舰店之前推布衣不二旗舰店之前推布衣不二旗舰店";

        String description = "AAAAAAAAAAAAAA布衣不二旗舰店，之前推荐衣不二旗舰店之前推";

        String lable = "包邮,七天无理由退换,新品爆款";


        BufferedImage bufferedImage =ChartGraphics. graphicsGenerationlovely(imageQR, ErWeiMaImage,titleLab,title,originPrice,nowPrice,couponPrice+"",description,lable);


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
        if(tuiJiangLineSize==1){//第二行开始 0 数据
            bili = 630-60 ;
        }else if(tuiJiangLineSize==2){ //1条数据
            bili = 630-40 ;
        }else if(tuiJiangLineSize==3){ //2条数据
            bili = 630 -20 ;
        }else {
            bili = 630 ;
        }

        BufferedImage bufferedImageFinal =  ReduceImgTest.reduceImg(bufferedImage, 375*3, bili*3, null);

        ImageIO.write(bufferedImageFinal, "jpg", outputStream);

    }
}
