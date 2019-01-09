package com.hlj.util.job.authorZi;

import com.hlj.util.QRcode.BufferedImageUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.BigDecimal;
import java.net.URL;

/**
 * @Desc:
 * @Author HealerJean
 * @Date 2018/6/29  上午11:10.
 */
public class MainServiceZi {

    public static void main(String[] args) throws Exception {


        File file = new File("/Users/healerjean/Desktop/id.jpg");
        FileOutputStream outputStream = new FileOutputStream(file);

        BufferedImage urlimage = ImageIO.read(new URL("https://img.alicdn.com/imgextra/i1/3694212174/TB21Wb_jlsmBKNjSZFFXXcT9VXa_!!3694212174.jpg"));

        BufferedImage imageQR  = BufferedImageUtils.reduceImg(urlimage,375*2,375*2,null);

        URL u = new URL("http://admore.oss-cn-beijing.aliyuncs.com/admin/duodianyouhui/itemgood/6a4507a16213460ab3476a3204a9e5bc.png");

        BufferedImage titleLab = ImageIO.read(u);

        BufferedImage  ErWeiMaImage =  BufferedImageUtils.writeQRImg("http://admore.oss-cn-beijing.aliyuncs.com/duodian-youhui/index.html#/44",300,300,3);

        String title = "AAAAAAAAAAAAAA千妇恋-日本进口温和控油洗面奶30g";
        BigDecimal originPrice =new BigDecimal("88.9");
        BigDecimal  nowPrice  =new BigDecimal("39.9");
        BigDecimal couponPrice  =new BigDecimal("10");
        String description = "布衣不二旗舰店，之前推布衣不二旗舰店，";
        String lable = "包邮,七天无理由退换,新品爆款";


        CouponAdzoneFoodieTagZi couponAdzoneFoodieTag = new CouponAdzoneFoodieTagZi() ;



        //整体图合成
        BufferedImage temp = new BufferedImage(375, 677, BufferedImage.TYPE_INT_RGB);
        //设置图片的背景色
        Graphics2D main = temp.createGraphics();
        main.fillRect(0, 0, 375, 677);

        int lovelyImageWidth = 375*30,lovelyImageHeight =677*30 ;
        //话痨内容hualaoContent
        Graphics2D hualaoContent = temp.createGraphics();
        hualaoContent.setColor(new Color(37,37,37));
        Font hualaoContentFont = new Font("PingFang SC", Font.PLAIN, 14*30);
        hualaoContent.setFont(hualaoContentFont);
        hualaoContent.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);

        FontMetrics fm = hualaoContent.getFontMetrics();
        int hualaoFirstLineWight = fm.stringWidth(couponAdzoneFoodieTag.getContent());

        if(hualaoFirstLineWight<=(311*30*2)) {
            lovelyImageWidth = 375*30;
            lovelyImageHeight = 677*30;
        }else if((hualaoFirstLineWight>311*30*2)&&hualaoFirstLineWight<=(311*30*3)) {
            lovelyImageWidth = 375*30;
            lovelyImageHeight = 707*30;
        }else if((hualaoFirstLineWight>311*30*3)) {
            lovelyImageWidth = 375*30;
            lovelyImageHeight = 730*30;
        }

//        List<String> hualaoList = StringTool.getStrList(couponAdzoneFoodieTag.getContent() ,22 );
//        if(hualaoList.size()<=2){
//
//        }if(hualaoList.size()==3){
//            lovelyImageWidth = 375*30;
//            lovelyImageHeight = 707*30;
//        }if(hualaoList.size()>3){
//            lovelyImageWidth = 375*30;
//            lovelyImageHeight = 730*30;
//        }


        BufferedImage bufferedImage = ChartGraphicsZi.graphicsGenerationlovely(imageQR, ErWeiMaImage,titleLab,title,originPrice,nowPrice,couponPrice+"",description,lable, couponAdzoneFoodieTag,lovelyImageWidth,lovelyImageHeight);

//        有小编推荐 start-----------------------------------------------------------------------------------------------------------------------------
//
//            String tuijian = description ;
//            StringBuffer s1= null;
//            String oneLine = "",otherLine = "";
//            if(tuijian.length()>21){
//                oneLine = tuijian.substring(0,21);
//                otherLine = tuijian.substring(21,tuijian.length());
//            }else {
//                oneLine =    tuijian ;
//            }
//
//            if(otherLine!=null){
//                s1 = new StringBuffer(otherLine);
//                if(tuijian.length()>26) {
//                    int n = tuijian.length() / 26; //看看有几行
//                    for (int index = 26; index < tuijian.length(); index += 26, n--) {
//                        if (n > 1) {
//                            s1.insert(index, '\n');
//                        }
//                    }
//                }   else {
//                    s1.append(otherLine);
//                }
//            }
//            String otherFinal = s1.toString();
//            List<String> strs = Arrays.asList(otherFinal.split("\n"));
//
//            //整体图的高度和宽度
//            int bili =0 ;
//            int lovelyImageHeight =0 ;
//            if(strs.size()==0){//第二行开始 0 数据
//                bili = 590-60 ;
//            }else if(strs.size()==1){ //1条数据
//                bili = 590-40 ;
//            }else if(strs.size()==2){ //2条数据
//                bili = 590 -20 ;
//            }else {
//                bili = 590 ;
//            }
//
//       BufferedImage bufferedImageFinal =  BufferedImageUtils.reduceImg(bufferedImage, 375*3, bili*3, null);
//        有小编推荐去 end-----------------------------------------------------------------------------------------------------------------------------


//        下面这个是没有小编推荐语的时候
//         BufferedImage bufferedImageFinal =  ChartGraphics.reduceImg(bufferedImage, 375*3, 534*3, null);




        BufferedImage bufferedImageFinal =  BufferedImageUtils.reduceImg(bufferedImage, lovelyImageWidth/10, lovelyImageHeight/10, null);

        ImageIO.write(bufferedImageFinal, "jpg", outputStream);

    }
}




