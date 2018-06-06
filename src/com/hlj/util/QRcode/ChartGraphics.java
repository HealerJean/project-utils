package com.hlj.util.QRcode;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
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



    public static BufferedImage graphicsGenerationlovely(BufferedImage imageQR,  BufferedImage ImageerWeiMa) {
        //整体图的高度和宽度
        int lovelyImageWidth = 900;
        int lovelyImageHeight = 1428;
        //整体图合成
        BufferedImage bufferedImage = new BufferedImage(lovelyImageWidth, lovelyImageHeight, BufferedImage.TYPE_INT_RGB);
        //设置图片的背景色
        Graphics2D main = bufferedImage.createGraphics();
        main.fillRect(0, 0, lovelyImageWidth, lovelyImageHeight);


        Graphics graphicsQR = bufferedImage.getGraphics();
        graphicsQR.drawImage(imageQR, 0, 0, 900, 940, null);
        graphicsQR.drawImage(ImageerWeiMa, 591, 992, 249, 249, null);





        Graphics2D baoyou = bufferedImage.createGraphics();
        baoyou.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        baoyou.setColor(new Color(218, 83, 80));
        baoyou.fillRect(25,985,60,30);
        //固定文字 包邮
        Graphics2D fixBaoyou = bufferedImage.createGraphics();
        fixBaoyou.setColor(new Color(252, 250, 253));
        Font baoyouFont = new Font("黑体", Font.PLAIN, 26);
        fixBaoyou.setFont(baoyouFont);
        fixBaoyou.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixBaoyou.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String baoyouWenzi =  "包邮";
        fixBaoyou.drawString(baoyouWenzi, 25, 1010);



        //固定文字 title
        Graphics2D fixed = bufferedImage.createGraphics();
        fixed.setColor(new Color(51, 51, 51));
        Font fixedFont = new Font("黑体", Font.PLAIN, 37);
        fixed.setFont(fixedFont);
        //失真处理
        fixed.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixed.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String title =  "爆款返场】苹果1/7p/X听歌充电耳机转化头";

        List<String> list = getStrList(title,14);

        int i = 1 ;
        for(String str:list){
            if(i==1){
                fixed.drawString(str, 95, 1010);
            }else if(i==2){
                fixed.drawString(str, 20, 1055);
            }else if(i ==3){
                fixed.drawString(str, 20, 1095);
            }
            i++;
        }


        //固定文字 现价
        Graphics2D fixNowPrice = bufferedImage.createGraphics();
        fixNowPrice.setColor(new Color(51, 51, 51));
        Font fixNowPriceFont = new Font("黑体", Font.PLAIN, 28);
        fixNowPrice.setFont(fixNowPriceFont);
        //失真处理
        fixNowPrice.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixNowPrice.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String newPrice =  "现价：￥39.90";
        fixNowPrice.drawString(newPrice, 25, 1166);


        Graphics2D quanJx = bufferedImage.createGraphics();
        quanJx.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        quanJx.setColor(new Color(218, 83, 80));
        quanJx.fillRect(25,1190,30,30);


        //固定文字 券
        Graphics2D fixquanWenzi = bufferedImage.createGraphics();
        fixquanWenzi.setColor(new Color(252, 250, 253));
        Font fixQuanHouwenziFont = new Font("黑体", Font.PLAIN, 26);
        fixquanWenzi.setFont(fixQuanHouwenziFont);
        //失真处理
        fixquanWenzi.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixquanWenzi.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String quanwezi =  "券";
        fixquanWenzi.drawString(quanwezi, 25, 1215);



        Graphics2D yuanJx = bufferedImage.createGraphics();
        yuanJx.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        yuanJx.setColor(new Color(218, 83, 80));
        yuanJx.drawRect(55,1190,60,30);


        //固定文字 券
        Graphics2D fixyuanWenzi = bufferedImage.createGraphics();
        fixyuanWenzi.setColor(new Color(218, 83, 80));
        Font fixyuanWenziFont = new Font("黑体", Font.PLAIN, 26);
        fixyuanWenzi.setFont(fixyuanWenziFont);
        //失真处理
        fixyuanWenzi.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixyuanWenzi.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String yuan =  "30元";
        fixyuanWenzi.drawString(yuan, 55, 1215);




        //固定文字 券以及券后价
        Graphics2D fixQuanHou = bufferedImage.createGraphics();
        fixQuanHou.setColor(new Color(51, 51, 51));
        Font fixQuanHouFont = new Font("黑体", Font.PLAIN, 26);
        fixQuanHou.setFont(fixQuanHouFont);
        //失真处理
        fixQuanHou.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixQuanHou.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String quanhoujia =  "券后价:";
        fixQuanHou.drawString(quanhoujia, 131, 1215);




        //固定文字￥
        Graphics2D meiyuan = bufferedImage.createGraphics();
        meiyuan.setColor(new Color(218, 83, 80));
        Font qhjPriceMeiyuanFont = new Font("黑体", Font.PLAIN, 30);
        meiyuan.setFont(qhjPriceMeiyuanFont);
        //失真处理
        meiyuan.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        meiyuan.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String meiyuanWenZi =  "￥";
        meiyuan.drawString(meiyuanWenZi, 224, 1215);


        //固定文字 9.90
        Graphics2D qhjPrice = bufferedImage.createGraphics();
        qhjPrice.setColor(new Color(218, 83, 80));
        Font qhjPriceFont = new Font("黑体", Font.PLAIN, 60);
        qhjPrice.setFont(qhjPriceFont);
        //失真处理
        qhjPrice.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        qhjPrice.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String QaunPrice =  "9.90";
        qhjPrice.drawString(QaunPrice, 245, 1215);




        Graphics2D sptjRect = bufferedImage.createGraphics();
        sptjRect.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        sptjRect.setColor(new Color(218, 83, 80));
        sptjRect.fillRect(25,1275,110,30);


        //固定文字
        Graphics2D fixsptjwenzi = bufferedImage.createGraphics();
        fixsptjwenzi.setColor(new Color(252, 250, 253));
        Font sptjFont = new Font("黑体", Font.PLAIN, 26);
        fixsptjwenzi.setFont(sptjFont);
        fixsptjwenzi.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixsptjwenzi.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String sptjwenzi =  "商品推荐";
        fixsptjwenzi.drawString(sptjwenzi, 25, 1300);


        //商品推荐
        Graphics2D fixTuiJian = bufferedImage.createGraphics();
        fixTuiJian.setColor(new Color(51, 51, 51));
        Font fixTuiJianFont = new Font("黑体", Font.PLAIN, 30);
        fixTuiJian.setFont(fixTuiJianFont);
        //失真处理
        fixTuiJian.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixTuiJian.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String tuijian =  "百年品牌，药房品质。有预防和治疗三高、心血疾病、跌打止血、抑制疤痕增生等作用。食用方法：外涂伤口，炖鸡汤、牛奶或开水冲服。（不过看评论味道很一言难尽）【赠运费险、正品保障、扫码验真、十倍赔偿】\n";

        List<String> tuijianList = getStrList(tuijian,24);

        int m = 1 ;
        for(String str:tuijianList){
            if(m ==1){
                fixTuiJian.drawString(str, 150, 1300);
            }else if(m ==2){
                fixTuiJian.drawString(str, 20, 1345);
            }else if(m  ==3){
                fixTuiJian.drawString(str, 20, 1390);
            }
            m++;
        }

        return bufferedImage;
    }

    public static void main(String[] args) throws IOException {
        //需要添加的图片
        String imageQRUrl = "/Users/healerjean/Desktop/log.jpeg";
        //保存图片的路径
        String result = "/Users/healerjean/Desktop/newgraphicsGenerationlovely.jpeg";
        FileInputStream inputStream = new FileInputStream(imageQRUrl);
        BufferedImage imageQR = ImageIO.read(inputStream);


        String imageErWeiMaUrl = "/Users/healerjean/Desktop/erweima.jpeg";
        FileInputStream  inputStreamErWeiMa= new FileInputStream(imageErWeiMaUrl);
        BufferedImage imageErWeiMa = ImageIO.read(inputStreamErWeiMa);


        BufferedImage bufferedImage = graphicsGenerationlovely(imageQR, imageErWeiMa);
        int temp = result.lastIndexOf(".") + 1;
        ImageIO.write(bufferedImage, result.substring(temp), new File(result));
    }
}