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
 * @Date 2018/6/29  ����11:10.
 */
public class MainService {

    public static void main(String[] args) throws Exception {


        File file = new File("/Users/healerjean/Desktop/id.jpg");
        FileOutputStream outputStream = new FileOutputStream(file);


        BufferedImage imageQR  = ReduceImgTest.getBufferedImageByUrl("https://img.alicdn.com/imgextra/i1/3694212174/TB21Wb_jlsmBKNjSZFFXXcT9VXa_!!3694212174.jpg",375*2,375*2);

        URL u = new URL("http://admore.oss-cn-beijing.aliyuncs.com/admin/duodianyouhui/itemgood/6a4507a16213460ab3476a3204a9e5bc.png");

        BufferedImage titleLab = ImageIO.read(u);

        BufferedImage  ErWeiMaImage = QRCodeUtils.writeQRImg("http://admore.oss-cn-beijing.aliyuncs.com/duodian-youhui/index.html#/44");

        String title = "AAAAAAAAAAAAAAǧ����-�ձ������ºͿ���ϴ����30g";
        BigDecimal originPrice =new BigDecimal("88.9");
        BigDecimal  nowPrice  =new BigDecimal("39.9");
        BigDecimal couponPrice  =new BigDecimal("10");

//        String description = "���²����콢�֮꣬ǰ�Ƽ��²����콢��֮ǰ��";
//        String description = "���²����콢�֮꣬ǰ�Ʋ��²����콢�֮꣬ǰ��֮ǰ�Ʋ��²����콢��֮ǰ�Ʋ��²����콢��֮ǰ�Ʋ��²����콢��֮ǰ�Ʋ��²����콢��";

        String description = "AAAAAAAAAAAAAA���²����콢�֮꣬ǰ�Ƽ��²����콢��֮ǰ��";

        String lable = "����,�����������˻�,��Ʒ����";


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
//                int n = tuijian.length() / 26; //�����м���
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
//        //����ͼ�ĸ߶ȺͿ��
//        int bili =0 ;
//        int lovelyImageHeight =0 ;
//        if(strs.size()==0){//�ڶ��п�ʼ 0 ����
//            bili = 630-60 ;
//        }else if(strs.size()==1){ //1������
//            bili = 630-40 ;
//        }else if(strs.size()==2){ //2������
//            bili = 630 -20 ;
//        }else {
//            bili = 630 ;
//        }



        BufferedImage lineSizeBufferedImage = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);

        FontMetrics metricsLineSizeBufferedImage = lineSizeBufferedImage.createGraphics().getFontMetrics();
        //�ܹ��ַ��������أ��Ѿ����ƵĿ������
        int tuiJianStrLenth = metricsLineSizeBufferedImage.stringWidth(description.toString());// strҪ��ӡ���ַ���
        int StrPixelOtherTuiJianWidth =0; //��һ��֮��������ַ��������س���
        int oneTuiJianWidth = 252 ;// 252 ; // ������ 252; //��һ�����س���
        int twoTuiJianWidth = 312; //312 //�ڶ������س���
        int tuiJiangLineSize = 1 ; //�Ƽ��� ����
        int charIndex = 0 ;  //��һ�л��д��� �ַ���indexλ��
        StringBuilder finalStrOtherTuiJian = new StringBuilder();

        StringBuilder sbOneTuiJian = new StringBuilder();// �洢ÿһ�е��ַ���
        if(oneTuiJianWidth< tuiJianStrLenth){
            for (int i1 = 0; i1 < description.length(); i1++) {
                char ch = description.charAt(i1);
                sbOneTuiJian.append(ch);
                //�Ѿ���ӵ��ַ����ĳ���ͨ�� bounds2.getWidth() ��ȡ
                Rectangle2D bounds2 = metricsLineSizeBufferedImage.getStringBounds(sbOneTuiJian.toString(), null);
                int tempStrPi1exlWi1dth = (int) bounds2.getWidth();
                if (tempStrPi1exlWi1dth > oneTuiJianWidth) { //���Ѿ���ӵĳ������Ǹ������ƵĿ�Ƚ��л���
                    charIndex = i1 ;
                    break;
                }
            }
        }
        if(charIndex!=0){
            finalStrOtherTuiJian = new StringBuilder( description.substring(charIndex, description.length()));
            StrPixelOtherTuiJianWidth = metricsLineSizeBufferedImage.stringWidth(finalStrOtherTuiJian.toString()) ;// strҪ��ӡ���ַ���
            tuiJiangLineSize = (int) Math.ceil(StrPixelOtherTuiJianWidth * 1.0 / twoTuiJianWidth) + tuiJiangLineSize;// �������
        }


        //����ͼ�ĸ߶ȺͿ��
        int bili =0 ;
        if(tuiJiangLineSize==1){//�ڶ��п�ʼ 0 ����
            bili = 630-60 ;
        }else if(tuiJiangLineSize==2){ //1������
            bili = 630-40 ;
        }else if(tuiJiangLineSize==3){ //2������
            bili = 630 -20 ;
        }else {
            bili = 630 ;
        }

        BufferedImage bufferedImageFinal =  ReduceImgTest.reduceImg(bufferedImage, 375*3, bili*3, null);

        ImageIO.write(bufferedImageFinal, "jpg", outputStream);

    }
}
