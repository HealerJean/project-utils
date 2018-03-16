package com.hlj.util.QRcode;


import org.junit.Test;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.imageio.ImageIO;

/**
 * 用于图片水印开发
 * @author yellowcong
 * @date 2017年9月16日
 */
public class WaterMarkUtils {

    //字体样式
    private static final int FONT_STYLE = Font.BOLD;
    //字体大小
    private static final int FONT_SIZE = 60;
    //字体颜色
    private static final Color FONT_COLOR = Color.black;
    //字体颜色
    private static final String FONT_NAME = "微软雅黑";
    //图片类型
    private static final String IMAGE_TYPE  ="png";
    //透明度
    private static final float ALPHA = 0.3F;

    //多图的情况下，水印的间距
    private static final Integer MORE_MARK_DISTANCE = 100;
    //水印名称
    private static final String MARK_TEXT = "HealerJean的梦想博客";
    //打印的地方
    private static final String OUT_PATH = "/Users/healerjean/Desktop";
    //水印的文件目录
    private static final String LOGO_PATH = "/Usersfsdf/healerjean/Desktop/WX20180313-140701@2x.png";
    /**
     * 添加单条文字水印
     * @param srcImg 需要加水印的文件
     * @param moreMark  是否是多个水印 true多个水印   /false 或不写，一个水印
     * @return
     */
    public static String textWaterMark(File srcImg,boolean... moreMark) {
        try {
            //读取图片
            Image image = ImageIO.read(srcImg);

            //计算原始图片宽度长度
            int width = image.getWidth(null);
            int height = image.getHeight(null);
            //创建图片缓存对象
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            //创建java绘图工具对象
            Graphics2D graphics2d = bufferedImage.createGraphics();
            //参数主要是，原图，坐标，宽高
            graphics2d.drawImage(image, 0, 0, width, height, null);

            //使用绘图工具将水印绘制到图片上
            //计算文字水印宽高值
            int waterWidth = FONT_SIZE*getTextLength(MARK_TEXT);
            int waterHeight = FONT_SIZE;
            //水印透明设置
            graphics2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, ALPHA));
            graphics2d.setFont(new Font(FONT_NAME, FONT_STYLE, FONT_SIZE));
            graphics2d.setColor(FONT_COLOR);

            if(moreMark!= null && moreMark.length >0 && moreMark[0]){
                //设定旋转 ， 后面两个参数表示的是围绕那个坐标
                graphics2d.rotate(Math.toRadians(-30), bufferedImage.getWidth()/2, bufferedImage.getHeight()/2);

                int x = -width/2;
                int y = -height/2;

                while(x < width*1.5){
                    y = -height/2;
                    while(y < height*1.5){
                        graphics2d.drawString(MARK_TEXT, x, y);
                        //水印的间距
                        y+=waterHeight+MORE_MARK_DISTANCE;
                    }
                    x+=waterWidth+MORE_MARK_DISTANCE;
                }
            }else{
                graphics2d.drawString(MARK_TEXT, width-waterWidth, height);
            }

            //写图片
            graphics2d.dispose();

            //获取输出的图片
            File outPutImage = WaterMarkUtils.getNewImgFile();

            // 5、将二维码写入图片
            ImageIO.write(bufferedImage, IMAGE_TYPE, outPutImage);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }

    /**
     * 创建一个新的文件图片
     * @return
     * @throws Exception
     */
    private static File getNewImgFile()  {
        // 获取图片名称
        String fileName = UUID.randomUUID().toString() + "." + IMAGE_TYPE;
        File outPutImage = new File(OUT_PATH + File.separator + fileName);

        // 如果图片不存在创建图片
        if (!outPutImage.exists()) {
            try {
                outPutImage.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return outPutImage;
    }

    /**
     * 添加单图片水印
     * @param srcFile 需要家水印的文件路径
     * @return
     */
    public static String imageWaterMark(File srcFile,boolean... moreMark) {
        int X = 636;
        int Y = 763;

        try {
            Image image = ImageIO.read(srcFile);
            //计算原始图片宽度长度
            int width = image.getWidth(null);
            int height = image.getHeight(null);
            //创建图片缓存对象
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            //创建java绘图工具对象
            Graphics2D graphics2d = bufferedImage.createGraphics();
            //参数主要是，原图，坐标，宽高
            graphics2d.drawImage(image, 0, 0, width, height, null);
            graphics2d.setFont(new Font(FONT_NAME, FONT_STYLE, FONT_SIZE));
            graphics2d.setColor(FONT_COLOR);

            //水印图片路径
            File logo = new File(LOGO_PATH);
            Image imageLogo = ImageIO.read(logo);
            int widthLogo = imageLogo.getWidth(null);
            int heightLogo = imageLogo.getHeight(null);
            int widthDiff = width-widthLogo;
            int heightDiff = height-heightLogo;
            //水印坐标设置
            if (X > widthDiff) {
                X = widthDiff;
            }
            if (Y > heightDiff) {
                Y = heightDiff;
            }
            //水印透明设置
            graphics2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, ALPHA));

            if(moreMark!= null && moreMark.length >0 && moreMark[0]){
                graphics2d.rotate(Math.toRadians(-30), bufferedImage.getWidth()/2, bufferedImage.getHeight()/2);

                int x = -width/2;
                int y = -height/2;

                while(x < width*1.5){
                    y = -height/2;
                    while(y < height*1.5){
                        graphics2d.drawImage(imageLogo, x, y, null);
                        y+=heightLogo+MORE_MARK_DISTANCE;
                    }
                    x+=widthLogo+MORE_MARK_DISTANCE;
                }
            }else{
                graphics2d.drawImage(imageLogo, X, Y, null);
            }

            graphics2d.dispose();

            //获取输出的图片
            File outPutImage = getNewImgFile();

            // 5、将二维码写入图片
            ImageIO.write(bufferedImage, IMAGE_TYPE, outPutImage);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }

    //计算水印文本长度
    /**
     * 1、中文长度即文本长度 2、英文长度为文本长度二分之一
     * @param text
     * @return
     */
    private static int getTextLength(String text){
        //水印文字长度
        int length = text.length();

        for (int i = 0; i < text.length(); i++) {
            String s =String.valueOf(text.charAt(i));
            if (s.getBytes().length>1) {
                length++;
            }
        }
        length = length%2==0?length/2:length/2+1;
        return length;
    }


    /**
     * 1、测试单个水印的操作
     */
    @Test
    public void testWarterCode(){
        //要水印的文件
        String file =  "/Users/healerjean/Desktop/WX20180313-140701@2x.png";
        //表示只写一个水印的操作
        WaterMarkUtils.textWaterMark(new File(file));


    }

    /**
     * 2、添加多个文字水印 HealerJean的梦想博客
     */
    @Test
    public void testMoreTextWaterMark() throws Exception{
        String file = "C:/Users/yellowcong/Desktop/qr/logo/logo.jpg";
        WaterMarkUtils.textWaterMark(new File(file),true);
    }


    @Test
    public void testImageWaterMark() throws Exception{
        String file = "C:/Users/yellowcong/Desktop/qr/logo/logo.jpg";
        WaterMarkUtils.imageWaterMark(new File(file));
    }

    /**
     * 多水印图片操作
     * @throws Exception
     */
    @Test
    public void testMoreImageWaterMark() throws Exception{
        String file = "C:/Users/yellowcong/Desktop/qr/logo/logo.jpg";
        WaterMarkUtils.imageWaterMark(new File(file),true);
    }

}