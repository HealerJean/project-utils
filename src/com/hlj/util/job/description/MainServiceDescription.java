//package com.hlj.util.job.description;
//
//import com.hlj.util.QRcode.BufferedImageUtils;
//import com.hlj.util.job.ChartGraphicsDescription;
//
//import javax.imageio.ImageIO;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.math.BigDecimal;
//import java.net.URL;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * @Desc:
// * @Author HealerJean
// * @Date 2018/6/29  上午11:10.
// */
//public class MainServiceDescription {
//
//    public static void main(String[] args) throws Exception {
//
//
//        File file = new File("/Users/healerjean/Desktop/id.jpg");
//        FileOutputStream outputStream = new FileOutputStream(file);
//
//        BufferedImage urlimage = ImageIO.read(new URL("https://img.alicdn.com/imgextra/i1/3694212174/TB21Wb_jlsmBKNjSZFFXXcT9VXa_!!3694212174.jpg"));
//
//        BufferedImage imageQR  = BufferedImageUtils.reduceImg(urlimage,375*2,375*2,null);
//
//        URL u = new URL("http://admore.oss-cn-beijing.aliyuncs.com/admin/duodianyouhui/itemgood/6a4507a16213460ab3476a3204a9e5bc.png");
//
//        BufferedImage titleLab = ImageIO.read(u);
//
//        BufferedImage  ErWeiMaImage =  BufferedImageUtils.writeQRImg("http://admore.oss-cn-beijing.aliyuncs.com/duodian-youhui/index.html#/44",300,300,3);
//
//        String title = "AAAAAAAAAAAAAA千妇恋-日本进口温和控油洗面奶30g";
//        BigDecimal originPrice =new BigDecimal("88.9");
//        BigDecimal  nowPrice  =new BigDecimal("39.9");
//        BigDecimal couponPrice  =new BigDecimal("10");
//
////        String description = "布衣不二旗舰店，之前推荐衣不二旗舰店之前推";
//        String description = "布衣不二旗舰店，之前推布衣不二旗舰店，之前推之前推布衣不二旗舰店之前推布衣不二旗舰店之前推布衣不二旗舰店之前推布衣不二旗舰店之前推之前推布衣不二旗舰店之前推布衣不二旗舰店之前推布衣不二旗舰店之前推布衣不二旗舰店";
//
////        String description = "AAAAAAAAAAAAAA布衣不二旗舰店，之前推荐衣不二旗舰店之前推";
//
//        String lable = "包邮,七天无理由退换,新品爆款";
//
//
//        BufferedImage bufferedImage = ChartGraphicsDescription. graphicsGenerationlovely(imageQR, ErWeiMaImage,titleLab,title,originPrice,nowPrice,couponPrice+"",description,lable);

////        有小编推荐 start-----------------------------------------------------------------------------------------------------------------------------
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
////        有小编推荐去 end-----------------------------------------------------------------------------------------------------------------------------

//         //下面这个是去掉 小编推荐语
////        BufferedImage bufferedImageFinal =  BufferedImageUtils.reduceImg(bufferedImage, 375*3, 534*3, null);
//
//        ImageIO.write(bufferedImageFinal, "jpg", outputStream);
//
//    }
//}
//
//
//
//
